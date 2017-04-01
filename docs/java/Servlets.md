> IMPORTANT! Completed tasks are evaluate at the final result and the manner of applying the knowledge gained in the  course 

### Required reading

[The Java EE 5 Tutorial ]( http://docs.oracle.com/javaee/5/tutorial/doc/bnadp.html)  
[The Definitive Guide to HTML5 WebSockets](https://www.websocket.org)  
[Handling form data with Servlet](http://www.codejava.net/java-ee/servlet/handling-html-form-data-with-java-servlet)  
[Preventing Double Form Submission from the Client](http://www.the-art-of-web.com/javascript/doublesubmit/)  
[Post/Redirect/Get](https://en.wikipedia.org/wiki/Post/Redirect/Get)  
[REST API Rulebook](https://drive.google.com/open?id=0B9XARH7wTEN4NTZoMWtvSjVKY0k)  

**Remarks:** Stick to Servlet API 2.5 for now.  

**Забележка**: Използвайте [примерни теми](http://getbootstrap.com/getting-started/#examples), с които да подобрите визуализацията на потребителския интерфейс

### Задачи

1. Да се направи страница съдържаща 3 линка.
До всеки линк да се изписва броят пъти които е натиснат. Броенето да става от Servlet който връща необходимата информация обратно на същата страница. Да се използва GET метода за изпращане на заявката до Servlet-а.

2. Да се направят 3 страници изпращащи request само до един Servlet, който трябва да разпознава от коя страница получава request и да предават името й на друга страница, която да го визуализира.

3. Да се направят 4 страници.
  Една от тях съдържаща 3 радиобутона - съответстващи на другите 3 страници. При избор на радиобутон да се праща информация до Servlet и той да отваря избраната страница. На всяка страница да се изписва поздравително съобщение само когато се отваря за първи път.

4. Да се направи сайт за интернет банкиране, предлагащ следната функционалност:
  * Регистриране на нов потребител (въвежда се само username и password)
  * Проверка текущото състояние на сметката
  * Добавяне на пари в сметката
  * Теглене на пари от сметката
  * Показване на всичките транзакции във формат (Дата, Потребител, Операция(Deposit/Withdraw), Amount) 
  * Транзакациите трябва да се показват на страници (20 на страницата с next,prev бутони или с номериране ако е възможно)
  * Да се реализира запазване на информацията в база данни.
  * да се имплементира authentication и authorization (потребител, който не eвлязъл в системата да няма 	достъп до функционалност, която изисква логин).
  * при показване на главната 	страница да се пoказва колко потребителя рабoтят със системата
  * валидациите трябвa да се направят с 	регулярни изрази и да са от страна на 	сървъра ( server side validations)  
  * за реализацията на приложението да се ползва MySQL  

  **Забележка:** Да се прихващат възникналите изключения и адекватно да се обработват (примери за изключения: опит за логване на нерегистриран потребител, вписване на невалидни данни във формата и т.н.). Да се помисли за начина на визуализиране на грешките на потребителя. Да се разгледа стандартния начин за обработка и визуализиране на грешки (Error Page).

### Helper Snippets 

#### Serving Static content from Embedded Jetty 
```java
public final class Jetty {
  private final Server server;

  public Jetty(int port) {
    this.server = new Server(port);
  }

  public void start() {
    ServletContextHandler servletContext = new ServletContextHandler(ServletContextHandler.SESSIONS);
    servletContext.setContextPath("/");

    servletContext.addEventListener(new ServletContextListener() {

      public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();

        servletContext.addServlet("homeServlet", new HttpServlet() {
          @Override
          protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            PrintWriter writer = resp.getWriter();
            writer.println("Hello!");
            writer.flush();
          }
        }).addMapping("/");
      }

      public void contextDestroyed(ServletContextEvent servletContextEvent) {

      }
    });

    ContextHandler staticResourceHandler = new ContextHandler();
    staticResourceHandler.setContextPath("/assets");
    ResourceHandler resourceHandler = new ResourceHandler();
    resourceHandler.setResourceBase("static");

    staticResourceHandler.setHandler(resourceHandler);

    HandlerList handlers = new HandlerList();
    handlers.setHandlers(new Handler[]{staticResourceHandler, servletContext});

    server.setHandler(handlers);
    try {
      server.start();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }  
}
```

The snipped shown above requires the following folder structure: 
```
src/main/java
static/app.css 
```
So the "/" renders result of Home Servlet whether the "/assets/app.css" renders the CSS stored in the static folder. 

#### Serving HTML Page from Servlet
```java
PrintWriter writer = resp.getWriter();
resp.setContentType("text/html");
ServletContext context = getServletContext();
byte[] content = ByteStreams.toByteArray(context.getResourceAsStream("/WEB-INF/LoginPage.html"));
String pageContent = new String(content, "UTF-8");
writer.println(pageContent);
writer.flush();
```

The complete example could be found [Here](https://gist.github.com/mgenov/6ad2a4919a4f4207ae1351e8e4bc2985)

#### Video tutorials: 
Servlets - [From Practicals and Projects](https://drive.google.com/file/d/0B3ffUVx4XrJkZ0hJdFJ4UEtETDg/view?usp=sharing) , [Learn Web Applications With Java](https://drive.google.com/file/d/0B3ffUVx4XrJkdDNkblRhSHVxMTA/view?usp=sharing) 
