> IMPORTANT! Completed tasks are evaluate at the final result and the manner of applying the knowledge gained in the  course 

### Required Reading  
 * [Java Collections](http://docs.oracle.com/javase/tutorial/collections/index.html)  
 * [Linked Hashmap is always better then Hashmap](https://publicobject.com/2016/02/08/linkedhashmap-is-always-better-than-hashmap/)  
 * [Java Hashcode and Equals](https://dzone.com/articles/java-hashcode-and-equals-deep-dive)  
 * [Using and Avoiding Null](https://github.com/google/guava/wiki/UsingAndAvoidingNullExplained)  

### Video Tutorials

Collections - [Part 1](https://drive.google.com/open?id=0B9XARH7wTEN4Vlc2c0hhVXhFdFE), [Part 2](https://drive.google.com/open?id=0B9XARH7wTEN4WWlHaGF1V25sSW8)  

### Задачи  
1. PageBean.  Да се направи клас, който получава списък от елементи и го разделя на страници. Дефиниран е размер на страницата (pageSize) - по колко елемента от списъка се показват наведнъж.  
 Класът има следните методи:  
 * next() - връща следващите няколко елемента от списъка;
 * previous() - връща предишните няколко елемента на списъка;
 * hasNext() - връща дали има следващи елементи;
 * hasPrevious() - връща дали има предишни елементи;
 * firstPage() - връща първата страница и я прави текуща;
 * lastPage() - връща последната страница и я прави текуща;
 * getCurrentPageNumber() - връща номера на текущата страница.

**Допълнителни условия:**
 * При стартиране на програмата да се показва първата страница от списъка чрез извикване на next().  
 * Методите next() и previous() да могат да се извикват от конзолата.  
 * Когато е показана първата страница (първите няколко елемента от списъка) и се извика метода previous () - да се изписва съобщение за грешка.
 * Ако последната страница на списъка е с по-малко от pageSize елементи и се извика метода next () да НЕ се получава грешка.  

```java
public class PageBean {
   public List<T> next() {
    ..
   }
   public List<T> previous() {
    ..
   }
   public boolean hasNext() {
      ...
   }
  
   public boolean hasPrevious() {
      ...
   }
   
   public List<T> firstPage() {
    ..
   }
   
   public List<T> lastPage() {
    ..
   }

   public List<T> getCurrentPageNumber() {
    ..
   }
}
```
.  
2. Да се направи клас, за обработване на думите в изречение. Трябва да се реализират следните функционалности: 
 * Намиране на честотата на срещане на всяка една дума текста.  
   **Пример:**   
   За следния текст: "aa cc aa ff gg hh ff" трябва да се върне "aa: 2, cc: 1, ff: 2, gg: 1, hh: 1".  
 * Намиране на буквата, която се среща най - често в дадено изречение.  
   **Пример:**   
   За следния текст: "Ники Илиев" трябва да се върне резултат "и", тъй като тя се среща 3 пъти.  
