# Rock Paper Scissor

## Download

[rockpaperscissor-1.1](target/rockpaperscissor-1.1-SNAPSHOT-jar-with-dependencies.jar)

[rockpaperscissor-1.1.zip](https://github.com/silvionetto/rockpaperscissor/archive/master.zip)

## Documentation

[Requirement](doc/Requirements.md)

[Site](http://htmlpreview.github.com/?https://github.com/silvionetto/rockpaperscissor/blob/master/target/site/index.html)

[PMD Report](http://htmlpreview.github.com/?https://github.com/silvionetto/rockpaperscissor/blob/master/target/site/pmd.html)

[Check Style](http://htmlpreview.github.com/?https://github.com/silvionetto/rockpaperscissor/blob/master/target/site/checkstyle.html)

[Jacoco](http://htmlpreview.github.com/?https://github.com/silvionetto/rockpaperscissor/blob/master/target/site/jacoco/index.html)

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
    mvn cobertura:coberturapri

## Quality Assurance

    mvn checkstyle:checkstyle
    mvn pmd:pmd