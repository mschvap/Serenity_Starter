[![Java CI with Maven](https://github.com/mschvap/Serenity_Starter/actions/workflows/check.yml/badge.svg)](https://github.com/mschvap/Serenity_Starter/actions/workflows/check.yml)

# Primeros pasos con Serenity y Cucumber

Este proyecto fue creado para ser utilizado como témplate en pruebas automatizadas utilizando la librería de Serenity con Cucumber. 

Serenity puede utilizar el patrón Page Object pero en este caso se utiliza screenplay debido a los grandes beneficios que aporta como test más ordenados y facilidad en la reutilización de código.

Para más información recurrir a la página web de serenity: [https://serenity-bdd.github.io/docs/guide/user_guide_intro](https://serenity-bdd.github.io/docs/guide/user_guide_intro)

También se puede acceder al repositorio de serenity-dojo para consultar distintos ejemplos: [https://github.com/serenity-dojo](https://github.com/serenity-dojo))

> [!IMPORTANT]
>
> **PRE-REQUISITOS**:
>
> * Para ejecutar el proyecto se recomienda mínimo las siguientes versiones:
>   * IntelliJ Community Edition 2021
>   * Java JDK 11+
> * En IntelliJ es necesario instalar los plugins de Gherkin y Cucumber para Java.

## Funcionalidades incluidas en el framework

> **Soporta automatización**:
> * Web
> * Apis

## Estructura del proyecto

Se recomienda utilizar la siguiente estructura para la construcción de los casos de prueba:

```Gherkin
src
  + main
  + test
    + java                          Runner y Clases operativas de serenity
      + example                   
        +model
        +questions
        +stepdefinitions
        +tasks
        +userinterfaces
        CucumberTestSuite.java      Runner de Cucumber
    + resources
      + features                    Feature files
          login.feature
```

## Ejecución de los test

```gherkin
mvn clean verify
```


> [!NOTE] 
> * El proyecto está configurado para ejecutarse con maven o con gradle pero este documento solo describe la ejecución en maven
>

> [!TIP]
> * Por defecto está configurado para ejecutarse headless, para cambiar esta configuración se debe modificar la siguiente propiedad en el archivo `serenity.conf`:
>```gherkin
>headless.mode = true
>```
> a
>
>```gherkin
>headless.mode = false
>```

## Lista de Contenidos

> * Casos de prueba web
> * Casos de prueba Apis
> * Patron Screenplay (Task, Question, Action, UserInterface)
> * Cucumber y Gherkin
> * Múltiples casos de prueba
> * Estructuras de datos (List, Collection, Map, DataTable)
> * Assertions
> * Selectores estáticos (Target)
> * Selectores dinámicos
