> IMPORTANT! Completed tasks are evaluate at the final result and the manner of applying the knowledge gained in the  course 

### Required reading  
[Java Concurrency](http://docs.oracle.com/javase/tutorial/essential/concurrency/index.html)  
[Locks](http://docs.oracle.com/javase/tutorial/essential/concurrency/newlocks.html) &
[Lock](http://docs.oracle.com/javase/7/docs/api/java/util/concurrent/locks/Lock.html)  
[Producer Consumer Pattern Explained](http://docs.oracle.com/javase/tutorial/essential/concurrency/guardmeth.html)    
[Monitor vs Reentrant Lock vs Synchronized](http://docs.guava-libraries.googlecode.com/git/javadoc/com/google/common/util/concurrent/Monitor.html)    
[Java Concurrency in Practice](https://drive.google.com/file/d/0B9XARH7wTEN4amJDYk1GZmtoaDA/view?usp=sharing)

### Задачи  

1. Да се направи програма, в която се стартира нишка отброяваща до зададена стойност.  
След стартирането на нишката, в главната прорама да се чака въвеждането на символ от кÐ»авиатурата. След прочитането на символа да се спира нишката и да се извежда до коя стойност е стигнало отброяването.  
  
2. Да се направят 2 нишки броячи - броят от начална до крайна стойност.
  
 * На всяко отброяване да се извежда стойността на брояча.  
 * На едната нишка се задава да брои до по-малка стойност от другата.   
 * Когато една от нишките преброи до зададената стойност спира другата и завършва изпълнението си.   
 * Да се пуснат нишките с малко различаващи се стойности и със стойности с голяма разлика.   
   
   **Забележка:** Програмата има само един клас нишка  
3. Да се модифицират нишките от предната задача така, че след всяко отброяване съответната нишка да спира и да позволява на другата да брои.  

  **Пример:**  Ако двете нишки (наречени примерно Thread1 и Thread2) трябва да броят до 5, то на конзолата да се извежда:  

  ``` 
Thread1- 1
Thread2- 1 
Thread1- 2
Thread2- 2  
Thread1- 3  
Thread2- 3  
Thread1- 4  
Thread2- 4  
Thread1- 5  
Thread2- 5  
  ```

4. Да се модифицира задача 4 от Exceptions.  
Да се направи така, че достъпът до методите на класа да е синхронизиран. Да се направят две отделни нишки за методите add и remove така, че при едновременно извикване на няколко такива нишки да не възникнат проблеми:  
 * При викане на remove при вече празен списък, не трябва да възникне грешка, а да се чака да се въведе елемент;  
 * При викане на add при пълен списък не трябва да възникне грешка, а да се чака да се махне елемент.  
 * Да се ползва wait() и notify()  
 * Да се разгледа стандартния примитив за реализация в Java (Blocking Queue )  
  
5. Да се направи клас TimeoutHashtable, който съхранява елементи за известен период от време.  
Класът съдържа Hashtable със стойности. За стойностите зад всеки ключ се следи времето, за което не са използвани (т.е. за ключа не са извиквани методите put() и get()). При неизползване на даден ключ за определен предварително зададен интервал от време той да се изтрива от таблицата.  
Има следните методи:  
 * put(K key, T value) - при въвеждане на стойност с вече съществуващ ключ, то стойността се замества с новата;  
 * T get(K key) - връща обект по ключ, ако го няма - null;  
 * remove(K key) - маха елемент по ключ, ако го няма връща null.  

