> IMPORTANT! Completed tasks are evaluate at the final result and the manner of applying the knowledge gained in the  course 

### Required reading  
[XML Basics](http://www.w3schools.com/xml/default.asp)  
[SAX Basics](http://en.wikipedia.org/wiki/Simple_API_for_XML)  
[DOM Basics](http://www.w3schools.com/xml/dom_intro.asp)  
[Java SAX XML Proccessing](http://java.sun.com/j2ee/1.4/docs/tutorial/doc/JAXPSAX.html)  
[Java DOM XML Proccesing]( http://java.sun.com/j2ee/1.4/docs/tutorial/doc/JAXPDOM.html)  


[JSON Basics](http://www.w3schools.com/js/js_json_intro.asp)  
https://github.com/google/gson - json parsing lib

[Yaml](http://www.yaml.org/start.html)

### Задачи  


**1.** Да се направи приложение, което трансформира обекти в текстови съобщения и обратното.
Изходният формат трябва да бъде конфигурируем:  JSON или XML.
 - Приложението да се пакетира в jar, за може да се използва като библиотека.
 - За всяка една имплементация (JSON, XML) да се напишат тестови сценарии, които да показват тяхното поведение 
Сценариите за 2'те имплементации трябва да се отделени в отделни класове и трябва да показват ясно как се използват създадените класове. 
 - Да се приложат сценарии с голям обем от данни.
 - Да се направи сравнителен анализ между 2'та формата в писмена форма (може да се използва и Markdown)
    - Размер на съобщенията
    - Използвани ресурси
    - Бързодействие 
    - Популярност

_Упътване:_
Може  да се използва полиморфизъм (примеÑно интерфейс MessageCodec с имплементации JSONCodec и XMLCodec).Алтернативен и инновативен вариант е също приемлив. 

**2.** Да се направи приложение, което да ползва сериализацията от предната задача и се пакетира в изпълним Jar за да може да се изпълнява със следната команда : 

```text
java -jar messagepreview.jar -type json message.json --printAverageStats
```

където message.json: 

```text
[{firstName: “John”, lastName: “Smith”, age: 34},{firstName: “John”, lastName: “Smith”, age: 34},{firstName: “John”, lastName: “Smith”, age: 34},{firstName: “John”, lastName: “Smith”, age: 34},{firstName: “John”, lastName: “Smith”, age: 34},{firstName: “John”, lastName: “Smith”, age: 34},{firstName: “John”, lastName: “Smith”, age: 34}]
```

a резултатът Ðµ статистически данни за обектите, който се печата в конзолата 

```text
Users Count: 7
Average Age: 34 
```
