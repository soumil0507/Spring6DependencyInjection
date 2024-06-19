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
- You have two beans
    - One is primary annotated primary so by default spring context is going to pick up this bean
    - You also have another bean
    - Now you want this bean to be implemented by the controller
    - Give this service a name or by default the name of this service is starting with lowercase class or bean name.
    - and this will run the Bean 2

## Spring Profiles
- We can set Annotate two same servies with different profiles when they implement the same interface.
- While testing Annotate the class with ActiveProfiles to use the particular service.
    #### Default Profile
    - If none of the profiles are active we can set one profile as default and that particular service will be used.