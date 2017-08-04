> IMPORTANT! Completed tasks are evaluate at the final result and the manner of applying the knowledge gained in the  course 

### Required reading  
JUnit: 
   * [Essential Skills for Agile Development, Tong Ka Iok, Kent](https://drive.google.com/file/d/0B9XARH7wTEN4MTB6WjVoNWdiMEk/view?usp=sharing)  
   * [Test Driven TDD and Acceptance](https://drive.google.com/a/clouway.com/file/d/0B9XARH7wTEN4Vm9UVGF5R29UdXM/view?usp=drivesdk)  
   * [JUnit Books](https://drive.google.com/folderview?id=0B9XARH7wTEN4YXVfUjBLenI0Nlk&usp=sharing)  
   * [Effective Unit Testing](https://drive.google.com/file/d/0B9XARH7wTEN4aDluMkFPeHFMM1k/view?usp=sharing)  

TDD and Other Stuff:  
  * [TDD Lectures](http://jbrains.usefedora.com/courses/wbitdd-01/lectures/133270)  
  * http://en.wikipedia.org/wiki/Test-driven_development  
  * [Essential Skills for Agile Development, Tong Ka Iok, Kent](https://drive.google.com/file/d/0B9XARH7wTEN4MTB6WjVoNWdiMEk/view?usp=sharing)  
  * [Your Constructors Are Completely Irrational](http://blog.thecodewhisperer.com/2015/03/23/your-constructors-are-completely-irrational/)
  * [Preserve Whole Object](http://refactoring.com/catalog/preserveWholeObject.html)  
  * [Greeting Kata](https://github.com/testdouble/contributing-tests/wiki/Greeting-Kata)  
  * [Primitive Obsession](http://www.jamesshore.com/Blog/PrimitiveObsession.html)  

**Sandbox Examples:** 
  * [All Examples](https://github.com/mgenov/sandbox)  
  * [Testing Exceptions](https://github.com/mgenov/sandbox/tree/master/src/com/clouway/sandbox/exceptions)  

### Video Tutorials
 * [assertEquals vs Hamcrest](https://drive.google.com/open?id=0B9XARH7wTEN4RkhWdzRGUmtFS2s)  

### Задачи

1. Да се създадат тестове на задача 1 от Objects in Java за сумиране на стрингове. Да се тестват следните сценарии: 
 
  * Дали с нормални данни връща очаквания резултат
  * При подаване на данни, които съдържат символи, различни от цифри, дали се хвърля нужното изключение.
  * При подаване на null аргумент дали се хвърля IllegalArgumentException

2. Да се създадат тестове на задача 3 от Introducing Java (printArray, getSum и getMinElement)

3. Чрез Test Driven Development (TDD) да се реализира програма за управлението на склад.

  * Складът може да получава нови и да продава наличните продукти.
  * Да се създадат няколко различни обекта - продукти, като за всеки от тях има определено максимално количество, което Ð¼оже да постъпи в склада.
  * Да се добави възможността продуктите в склада да се извеждат сортирани по цена. (За сортирането да се използва метода sort(List<T> a) от класа Collections).
  * Да се определят различните сценарии и да се реализират чрез тестове.
