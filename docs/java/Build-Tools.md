> IMPORTANT! Completed tasks are evaluate at the final result and the manner of applying the knowledge gained in the  course 

### Required Reading  
  [Apache ANT](http://ant.apache.org/)  
  [Maven Basics](http://maven.apache.org/)  
  [The Maven 2 tutorial](http://docs.codehaus.org/display/MAVENUSER/The+Maven+2+tutorial)  
  [Gradle](https://www.gradle.org/)  
  [Jenkins](http://jenkins-ci.org/)  
  Examples - [Petstore Project](https://github.com/testinfected/simple-petstore)  

### Задачи 
1. Запознаване с ANT - базови неща

2. Да се създаде проект, който използва Gradle за build система. 
Проектът трябва да има следната структура:  
 * MyProject
 * src/main/java/com/clouway/MyClass.java
 * src/main/resources/com/clouway/MyClassMessages.properties
 * src/test/java/com/clouway/MyClassTest.java
 * build.gradle

  Проектът трябва да се компилира в jar файл, като за гÐ»авен клас (main class) трябва да се     постави класа MyClass. След пакетиране на проекта, изходния файл трябва да се намира в target директорията. 

  След изпълнението на задачата, приложението трябва да може да бъде стартирано със следната команда от конзолата:  

  java -jar MyProject.jar  

  **Допълнителни условия:**
 * Класа MyClass да използва класове от log4j библиотеката, например класа Logger.  
 * Да се разгледат различни начини за пакетиране (като самостоятелен jar с препакетирани пакети и като jar + libs)  
 * Да се разгледат и варианти за създаване на web приложения и да се определи по какво структурата на web приложенията се различава от jar структурата
 * Project файловете на средата трябва да се игнорират и да не се добавят в репозиторито  
 * След като се одобри задачата, да се checkout'не проекта в отделна директория и да се пробва да се импортира в IDEA'та. 
 

3. Да се генерира проект с maven.  
Проекта трябва да има следната структура:  
 * myproject (jar)  
 * myproject-bl (jar) (Business layer)  
 * myproject-pl (jar)( Persistence layer )  
 * myproject-bo (jar) (Business objects)  

 **Допълнителни условия:**  

 * Всеки един от проектите трябва да е зависим от junit и log4j  
 * Проекта myproject-pl трябва да зависи от jdbc драйвера на mysql  
 * Проекта трябва да може да се пакетира с mvn package  
 * Проекта трябва да може да се компилира с mvn compile  

 Трябва да се изпробват възможнистите за пакетирането до самостоятелен jar, като за целта може да използвате [jar jar maven plugin'a](http://sonatype.github.io/jarjar-maven-plugin/)  

!!! Да се направи съпоставка между двата инструмента (maven и gradle) и да се определят предимства и недостатъци, които сте забелязали в двата инструмента. 
