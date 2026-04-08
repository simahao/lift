# AGENTS.md - Lift Project

## Project Overview

Spring Boot 2.7.18 backend application for elevator component selection based on rules engine (easy-rules). The project parses rule definitions from YAML files and provides REST APIs for various elevator component queries (motors, rails, stiffners, etc.).

**Tech Stack**: Java 11, Spring Boot 2.7.18, easy-rules 4.1.0, Log4j2, Maven

## Build & Run Commands

```bash
# Build project
mvn clean compile

# Run application
mvn spring-boot:run

# Run all tests
mvn test

# Run single test class
mvn test -Dtest=RailSettingServiceTest

# Run single test method
mvn test -Dtest=RailSettingServiceTest#testRule1_KMC972573H03

# Package as JAR
mvn clean package

# Run with code coverage
mvn test jacoco:report
```

## Project Structure

```
src/main/java/hz/lift/
├── controller/
│   ├── motor/              # Motor selection endpoints
│   │   └── MotorSelectionController.java
│   └── rail/               # Rail-related endpoints (one per PRD file)
│       ├── RailSettingController.java
│       ├── StiffnerSettingController.java
│       ├── TopMacGrKmSettingController.java
│       └── ...
├── model/
│   ├── motor/
│   │   ├── MotorSelectionRequest.java
│   │   └── MotorSelectionResponse.java
│   └── rail/               # One request/response pair per PRD file
│       ├── RailSettingRequest.java
│       ├── RailSettingResponse.java
│       └── ...
├── service/
│   ├── motor/
│   │   └── MotorRuleEngineService.java
│   └── rail/               # One service per PRD file
│       ├── RailSettingService.java
│       ├── StiffnerSettingService.java
│       └── ...
└── LiftApplication.java    # Main entry point

src/main/resources/
├── application.properties
├── log4j2.xml
└── rules/                  # YAML rule definitions
    ├── motor/              # Motor selection rules
    │   └── mada1-rules.yml
    └── rail/               # Rail-related rules (one file per PRD)
        ├── mrl-car-top-mac-gr-setting-rules.yml
        ├── mrl-stiffner-setting-rules.yml
        └── ...

src/test/java/hz/lift/
└── service/                # One test class per service
    ├── motor/
    │   └── MotorRuleEngineServiceTest.java
    └── rail/
        ├── RailSettingServiceTest.java
        └── StiffnerSettingServiceTest.java
```

## Code Style

### Imports (Order Matters!)
1. Java standard library (`java.*`, `javax.*`)
2. Third-party libraries (`org.springframework`, `org.jeasy`, `org.slf4j`)
3. Project packages (`hz.lift.*`)
4. **No wildcard imports** (e.g., `import java.util.*` is forbidden)

### Naming Conventions
- Classes: PascalCase (e.g., `MotorSelectionRequest`, `StiffnerSettingService`)
- Methods/variables: camelCase (e.g., `selectMotor`, `getSpeed`, `wgtRatedLoadQ`)
- Constants: UPPER_SNAKE_CASE (e.g., `DEFAULT_RESULT = "NA"`)
- Test methods: `test<Condition>_<Expected>` (e.g., `testRule1_WGT630_NMX08_T82B`)

### Class Structure
- Model classes: POJO with getters/setters (JavaBean style)
- Services: `@Service` annotation, constructor injection
- Controllers: `@RestController` with `@RequestMapping`
- Inner classes for rule results (e.g., `RailResult`, `StiffnerResult`)

### Types
- Use `BigDecimal` for decimal values (not double/float)
- Use wrapper types (`Boolean`, `Integer`) for nullable fields
- Return response objects, not raw strings
- Request fields: match PRD column names exactly

### Error Handling
- Null checks before processing: `if (request == null) { return ...; }`
- Log errors with context: `logger.error("Failed to {}", action, exception)`
- Return meaningful error responses (e.g., `result="NA"` with reason)

### Logging
- Use SLF4J: `LoggerFactory.getLogger(ClassName.class)`
- Debug level: detailed tracing (`logger.debug(...)`)
- Info level: important operations (`logger.info(...)`)
- Error level: with exception stack trace (`logger.error("...", exception)`)

### Code Formatting
- 4 spaces indentation (no tabs)
- Opening brace on same line
- One blank line between import groups
- Max line length: 120 characters

## Testing

### Test Structure
- One test class per service: `<ServiceName>Test.java`
- One test method per rule condition
- Use `@SpringBootTest` for integration tests
- Use `@Autowired` for service injection

### Assertions
- `assertEquals(expected, actual)`
- `assertNotNull(object)` for null checks
- Include meaningful failure messages when needed

### Coverage Requirements
- Target: 100% branch and statement coverage for new code
- Run coverage report: `mvn test jacoco:report`
- View report: `target/site/jacoco/index.html`

## Rule Engine (easy-rules)

### YAML Rule Format
```yaml
---
name: "Rule1: Description"
priority: 1
condition: "request.field != null && request.field == 'value'"
actions:
  - "result.result = 'output'; result.matchedRule = 'Rule1';"
```

### Condition Guidelines
- **Always check for null**: `request.field != null && request.field == 'value'`
- Use `==` for equality (MVEL uses Java semantics)
- Use `||` for OR, `&&` for AND
- Use explicit comparisons, avoid `in` operator (causes ClassCastException)
- Numeric comparisons: `request.qtyGrCwtTopALength > 0`

### Priority
- Lower number = higher priority (evaluated first)
- Default rule: priority 1000

## API Endpoints

### Motor Selection
- `GET /api/mada1/qryMotor` - Query parameters
- `POST /api/mada1/qryMotor` - JSON body

### Rail Settings (one endpoint per PRD file)
- `/api/rail/setting` - Rail setting
- `/api/rail/stiffner/setting` - Stiffner setting
- `/api/rail/topmacgrkm/setting` - Top Mac Gr Km setting

## Configuration

- Log4j2: `src/main/resources/log4j2.xml`
- Application: `src/main/resources/application.properties`
- Rules: `src/main/resources/rules/`

## Adding New PRD Files

When adding a new PRD file (e.g., `prd/rail/new_feature_rules.md`):

1. **Model**: Create `NewFeatureRequest.java` and `NewFeatureResponse.java` in `model/rail/`
2. **Service**: Create `NewFeatureService.java` in `service/rail/`
3. **Controller**: Create `NewFeatureController.java` in `controller/rail/`
4. **Rules**: Create `new-feature-rules.yml` in `resources/rules/rail/`
5. **Test**: Create `NewFeatureServiceTest.java` in `test/java/hz/lift/service/rail/`

Follow existing patterns exactly - match field names to PRD columns.

## Multi-Step Task Checklist Rule

When user provides numbered items (e.g., "1. Do X, 2. Do Y, 3. Do Z"), **immediately create a todo list** and verify each item upon completion:

### Protocol
1. **Immediately**: Create todo items for each numbered item
2. **Per-item**: Mark `in_progress` before starting, `completed` after finishing
3. **Final check**: Before reporting completion, verify ALL items are marked done

### Example
User request: "Process the file: 1. Handle origi: cells, 2. Handle e.g. cells, 3. Keep unmarked cells unchanged"

Correct behavior:
```
[todo] 1. Handle origi: cells - in_progress
[todo] 2. Handle e.g. cells - pending  
[todo] 3. Keep unmarked cells unchanged - pending
→ Do item 1, mark completed
→ Do item 2, mark completed
→ Do item 3, mark completed
→ Final verification: all items completed
```

### Anti-Pattern (NEVER do this)
- Start working immediately without creating todo
- Complete only part of the items and report "done"
- Forget to verify all numbered items were addressed
