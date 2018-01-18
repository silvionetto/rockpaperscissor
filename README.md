# Rock Paper Scissor

## Download

[rockpaperscissor-1.0](target/rockpaperscissor-1.0-SNAPSHOT-jar-with-dependencies.jar)

[rockpaperscissor-1.0.zip](https://github.com/silvionetto/rockpaperscissor/archive/master.zip)

## Documentation

[Requirement](doc/Requirements.md)

[PMD Report](target/site/pmd.html)

[Check Style](target/site/checkstyle.html)

## Usage
1 - Clone the project:

    git clone https://github.com/silvionetto/rockpaperscissor.git
    cd rockpaperscissor
    
2 - To run the application using maven:

    mvn exec:java
    
3 - To run the application using java:
    
    java -jar target/rockpaperscissor-1.0-SNAPSHOT-jar-with-dependencies.jar
    
## Build

    mvn install site

## Test

    mvn test

## Quality Assurance

    mvn checkstyle:checkstyle
    mvn pmd:pmd