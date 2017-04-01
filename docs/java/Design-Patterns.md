> IMPORTANT! Completed tasks are evaluate at the final result and the manner of applying the knowledge gained in the  course 

### Required Reading  
 * [Prentice Hall - Applied Java Patterns](https://drive.google.com/open?id=0B9XARH7wTEN4TGQxTUpmSEdCbmM)  
 * [Effective Java - 2nd edition](https://drive.google.com/open?id=0B9XARH7wTEN4NDNYdXE3WmFCT3M)  
 * Design Patterns - Elements of Reusable Object-Oriented Software
 * James Cooper - The Design Patterns Java Companion  
 * [Big Transitions in small Steps](http://channel9.msdn.com/Events/Patterns-Practices-Symposium-Online/Patterns-Practices-Symposium-Online-2012/Closing-Keynote-Big-Transitions-in-Small-Steps)  
 * [Use your singletons wisely](http://blog.thecodewhisperer.com/permalink/use-your-singletons-wisely-ten-years-later)  

### Must Read  
 * Builder Pattern (Well described in Effective Java, 2nd edition)
 * Command Pattern (Will help in web development)
 * Chain of Responsibility Pattern (Will help in web development - Servlet Filters)
 * Model View Controller (described In Applied Java Patterns)

### Задачи  
1. Factory  
  Create an CodecFactory which should be responsible for the creation of different type of Codec objects (JSONCodec, XMLCodec) 
  There should be 2 implementations of this Factory:
   * By using regular instantiation with "new"  
   * By using Reflection
  
2. Singleton  
  The Design Pattern Singleton should be realized. Create a class called Singleton*.*The class should have a private constructor only. The class should be implemented in an appropriate way such that only a single instance of it should be created (i.e. no more than one instance should be instantiated in the memory).  
  ```java
  //constructor  
  private Singleton() {  
    System.out.println("Singleton created");  
  }  
  ```

3. Да се направи Builder, който e отговорен за създаването на следния обект:
  ```java
  public final class Order {
    private Long orderId;
    private String customerName;
    private String customerAddress;
    private Date orderCreationDate; 
    private Date orderDeliveryDate; 
    private List<OrderItem> items;
  }

  public final class OrderItem {
    private String productName; 
    private String measureUnit;
    private Double quantity; 
    private Double price; 
  }
  ```

  **Описание**: Да се напише тест на метод, който определя дали order'a е доставен със забавяне или не.

4. Да се направи Adapter на InputStream, който да позволява използването единствено на int read(byte[] buf, int offset, int length) метода.  

5. Observer  
  Да се направи програма за поддържане на статистика на стоки. Трябва да има един клас, който да поддържа статистика за наличните стоки и един, в който има списък с продÐ°дените стоки (тези, които вече не са налични). Класът който е регистриран като слушател да следи за премахване на стари или добавяне на нови стоки.  
