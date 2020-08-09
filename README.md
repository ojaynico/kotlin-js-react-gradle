# kotlin-js-react-gradle
A basic React app written in Kotlin using Gradle

The app uses Kotlin wrappers for react libraries and it is single page application using hashRouter to manage routes.

Dependencies used
- react
- react-dom
- react-router-dom
- kotlinx-html-js
- kotlinx-coroutines-core-js


To run the the project after cloning

1. cd kotlin-js-react-gradle
2. Run the command in your cmd or terminal (make sure gradle and other environment properties are setup)

    `./gradlew -continuous run`
    
    OR
    
    `gradle browserRun  --continuous`
    
The project will open in the browser on port 8080 i.e http://localhost:8080
