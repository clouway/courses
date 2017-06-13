> IMPORTANT! Completed tasks are evaluate at the final result and the manner of applying the knowledge gained in the  course 

### Required Reading
[The Technical Skills You Will Need](https://dzone.com/articles/the-technical-skills-you-need-to-have-as-a-softwar)  
[Learning the Java Language](http://docs.oracle.com/javase/tutorial/java/index.html)  
[Object-Oriented Programming Concepts](http://docs.oracle.com/javase/tutorial/java/concepts/index.html)  
[Language Basics](http://docs.oracle.com/javase/tutorial/java/nutsandbolts/index.html)  
[Classes and Objects](http://docs.oracle.com/javase/tutorial/java/javaOO/index.html)  
[How to debug in IntelliJ IDEA](https://dzone.com/articles/how-to-debug-java-with-intellij-breakpoints-evalua)  

### Compilation Cheat Sheet
![Compilation Cheet Sheet](images/javac.png)
  
### Video Tutorials
* [Using Command Line Arguments](https://drive.google.com/file/d/0B9XARH7wTEN4OUdIa015VjBxVnc/view?usp=sharing)  

### Документиране на кода с JavaDoc  

Пример на документаран метод в Java:  

```java
/**
  * Calculates the sum of two numbers.
  *
  *@param a the first number to sum
  *@param b the second number to sum
  *@return the sum of the specified numbers
  */
  public int getSum(int a,int b){
    return a + b;
  }
```

Документацията на всички стандартни класове, методи и функции в Java, може да намерите от [Тук](http://docs.oracle.com/javase/7/docs/api/). 

Форматът за документиране на метод е следния:

```java
/**
* Първото изречение е резюме - какво прави метода. Започва с глагол (примерно Събира). От второто изречение са подробностите.
* @param име тип какво означава. Така за всеки един параметър.
* @return типа на връщания резултат. По възможÐ½ост се описва кога какъв резултат се връща.
* @throws име на Exception условие за exception. Така описание на всички изключения (exceptions).
*/
```

Как да ползвате Javadoc в Intellij IDEA ?  
За да документирате метод, следвайте стъпките:  
   * Поставете курсора в началото на декларацията на метода;  
   * Напишете /**;  
   * Натиснете бутона Enter.  
Средата автоматично ви генерира всички необходими тагове (@param, @return, @throws, и т.н.)  

Пример за структура на проекта

![Sample project structure.](https://github.com/freekman/images/blob/master/CorrectPackaging.png)
### Задачи   
1. Да се напише програма за намиране  на най - големия общ делител между две числа.  
Упътване: условието за излизане, е когато 2-те числа станат равни. В противен случай от по-голямото вадим по-малкото и резултата присвояваме на по-голямото.  

2. Да се разработи метод намиращ най-малко общо кратно (нок) на 2 числа.  
Упътване: използва се метода разработен от предишната подточка.  

3. Да се напише програма за обработка на масив.  
    Трябва да се избере подходящо име за обекта, който трябва да извърши тази обработка, като се има впредвид, че той трябва да има следните методи:  
  ```java
int getMinElement(int [] array); // връща най-малкия елемент от масива array;
int getSum(int [] array); //връща сумата от елементите на масива array;
void printArray(int [] array); //извежда на екрана елемeнтите на масива array.
  ```
  **Забележка:** Поставяйте всяка задача в отделен метод и го документирайте чрез Javadoc.  Коментарите на методите, трябва да са на английски език. Примерния фрагмент с коментари на български е даден с цел улеснение.  

3. Бързо сортиране на масив - QuickSort.  
4. Реверсиране на масив.  

  **Упътване:**  
  Целта е елементите на един масив да се прехвърлят в друг масив в обратна последователност. Целта е това да се направи само с един масив, т.е. последният и първият елемент разменят местата си, вторият с предпоследния, третия с този преди предпоследния и т.н.  

5. Програма за генериране на произволен стринг с настройваща се дължина.    
  Целта на задачата е динамично да може да се генерират различни стрингове с рачлични дължини. 
