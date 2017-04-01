> IMPORTANT! Completed tasks are evaluate at the final result and the manner of applying the knowledge gained in the  course 

### Required reading

http://www.jmock.org/getting-started.html  
[Mock Roles, Not Objects](https://drive.google.com/file/d/0B9XARH7wTEN4eXpWRHl3emVJeDQ/view?usp=sharing)  
[Introduce Parameter Object](http://refactoring.com/catalog/introduceParameterObject.html)  
[Logging is also feature](http://www.mockobjects.com/2007/04/test-smell-logging-is-also-feature.html)  
[Discovery Testing the Game Of Life](https://www.youtube.com/watch?v=aeX5OXO-w30&list=PLIuJbrOVyGjl0keQ-QyiMEOCvmabJEf0t&index=1)  
[SOLID Principles Explained](https://android.jlelse.eu/solid-principles-the-definitive-guide-75e30a284dea#.33zl10fvp)  
[SOLID Principles in real world](https://dzone.com/articles/the-solid-principles-in-real-life)  
[Bible Books](https://drive.google.com/folderview?id=0B9XARH7wTEN4RndBYi1iTkNFbWs&usp=sharing)  

*Note:* Alternatives of jmock are EasyMock and Mockito, but we use in our projects only jmock.  

**Sandbox Examples:** 
  * [Sandbox Repository](https://github.com/mgenov/sandbox)  
  * [Game Example](https://github.com/mgenov/sandbox/tree/master/src/com/clouway/sandbox/game)  

### Задачи
1) Да се използват мок обекти за тестване на следната функционалност за филтриране на неподходящи адреси
```java
public interface Endpoint {
   boolean matches(String url);
}

public class EndpointFilter {
  private final Endpoint[] endpoints;

  public EndpointFilter(Endpoint... endpoints) {
    this.endpoints = endpoints;
  }

  public boolean shouldFilter(String url) {
    for (Endpoint each : endpoints) {
      if (each.matches(url)) {
        return true;
      }
    }
    return false;
  }
}
```  
   * Да се напишат подходящи тестове на EndpointFilter обекта, чрез използване на мок обекти на Endpoint интерфейса
   * Да се нÐ°пише имплементация на Endpoint интерфейса StartsWithKeyword, която да представлява Endpoint, който матчва единствено когато адреса започва с подадената дума
   * Да се напишат тестове, които да проверяват че StartsWithEndpoint изпълнява нужното поведение за работата на EndpointFilter.  

2) Да се реализира приложение за изпращане на SMS съобщения чрез външна система.  

 Поради факта, че външната система не е реализирана, приложението трябва да може да работи и в тестов режим, който да му позволява да работи без външната система за разпращане на съобщенията - задачата трябва да се реализира Ñ TDD подход. Всяко съобщение трябва ба има получател, заглавие и текст ако едно от тях липсва- съобщението не може да бъде изпратено. Дължината на текста на съобщението трябва да бъде между 1 и 120 символа, в противен случай съобщението не може да бъде изпратено. Да се определят различните сценарии и да се тестват.

3) Да се реализира service клас, който изълнява следните функционалности:  

  * получава годините на човек под формата на String. Валидира този стринг посредством валидатор , като проверява дали стойността е валидна. Ако е валидна (валидни стойности: от 10 до 100), стойността може да бъде запазена в база данни.

  * извлича годините на човек от база данни. Ако стойността е по-голяма от 18- връща true. Ако е по-малка- връща false.

```java
// The service class
public class UserRepository {
  public UserRepository(UserDB userDB, Validator validator) {
    ..
  }
  public void registerUser(User user) {
    ...
  }

  public boolean isAdult(String name) {
       ````
  }
}
```

  **Забележка:** Да се тестват методите в изолация. Да не се създават реални имплементации на валидатора и класа за връзка с базата данни. Задачата да се реализира с TDD подход.
