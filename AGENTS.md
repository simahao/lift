# AGENTS.md - Lift Project

## Project Overview

Spring Boot 2.7.18 backend application for elevator motor selection based on rules engine (easy-rules). The project parses rule definitions from YAML files and provides REST API for motor model queries.

**Tech Stack**: Java 11, Spring Boot 2.7.18, easy-rules 4.1.0, Log4j2, Maven

## Build & Run Commands

```bash
# Build project
mvn clean compile

# Run application
mvn spring-boot:run

# Run all tests
mvn test

# Run single test
mvn test -Dtest=MotorRuleEngineServiceTest#testUserExample_NMX05

# Package as JAR
mvn clean package
```

## Project Structure

```
src/main/java/hz/lift/
├── controller/          # REST API endpoints
├── model/               # Request/Response DTOs
├── service/             # Business logic, rule engine
└── LiftApplication.java # Main entry point

src/main/resources/
├── application.properties
├── log4j2.xml
└── rules/               # YAML rule definitions (easy-rules format)

src/test/java/hz/lift/
├── service/             # Service unit tests
└── LiftApplicationTests.java
```

## Code Style

### Imports
- Java standard library first
- Third-party libraries (org.springframework, org.jeasy)
- Project packages (hz.lift)
- No wildcard imports

### Naming
- Classes: PascalCase (e.g., `MotorSelectionRequest`)
- Methods/variables: camelCase (e.g., `selectMotor`, `getSpeed`)
- Constants: UPPER_SNAKE_CASE
- Test methods: `test<Condition>_<Expected>` (e.g., `testUserExample_NMX05`)

### Classes
- Model classes: POJO with getters/setters (JavaBean style)
- Services: `@Service` annotation
- Controllers: `@RestController` with `@RequestMapping`
- Constructor injection preferred over field injection

### Types
- Use `BigDecimal` for decimal values (not double/float)
- Use wrapper types (`Boolean`, `Integer`) for nullable fields
- Return response objects, not raw strings

### Error Handling
- Null checks before processing
- Log errors with context: `logger.error("Failed to {}", action, exception)`
- Return meaningful error responses (e.g., motor="NA" with reason)

### Logging
- Use SLF4J Logger: `LoggerFactory.getLogger(ClassName.class)`
- Debug level for detailed tracing
- Info level for important operations
- Error level with exception stack trace

## Testing

- JUnit 5 (`@Test` annotation)
- Spring Boot Test (`@SpringBootTest` for integration tests)
- `@Autowired` for service injection in tests
- Assertions: `assertEquals`, `assertNotNull`

## Rule Engine (easy-rules)

Rules defined in `src/main/resources/rules/*.yml` using MVEL expressions:
- Condition format: `request.field.doubleValue() == value`
- Priority: Lower number = higher priority
- `skipOnFirstAppliedRule(true)` stops after first match

## API Endpoints

- `GET /api/mada1/qryMotor` - Query parameters
- `POST /api/mada1/qryMotor` - JSON body

## Configuration

- Log4j2: `src/main/resources/log4j2.xml`
- Application: `src/main/resources/application.properties`
- Rules: `src/main/resources/rules/`
