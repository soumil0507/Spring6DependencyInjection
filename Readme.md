# Dependency Injection

## Different types of dependency injection

### Dependency Injection without Spring
- PropertyInjected - Avoid
- SetterInjected - Least Preferred
- ConstructorInjected - Preferred


### Dependency Injection using Spring Framework
- Annotate properties as Autowired.
- Annotate controllers as Controller
- Annotate service as Service
- Anotate TestClasses as SpringBootTest

## Primary Bean
- if you have two beans that spring will implement, make one primary to resolve the dependency issue

## Qualifiers
