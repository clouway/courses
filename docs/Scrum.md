> IMPORTANT! Completed tasks are evaluate at the final result and the manner of applying the knowledge gained in the  course 

### Required reading  
  [Scrum and XP from the trenches](http://www.infoq.com/minibooks/scrum-xp-from-the-trenches)  
  User Stories applied for agile software development (Ebook)  
  [How you will probably learn to split features](http://www.jbrains.ca/permalink/how-youll-probably-learn-to-split-features)  
  [Three steps to a useful minimal feature](http://www.jbrains.ca/permalink/three-steps-to-a-useful-minimal-feature)  
  [Minimum Viable Product](http://blog.crisp.se/2016/01/25/henrikkniberg/making-sense-of-mvp)   

### Задачи  
1. Да се опише следното задание със user stories и да се определят тестови сценарии, по които да се тества  

  Искаме да реализираме финансово приложение, с което да си отчитаме разходите. Типовете рÐ°зходите трябва да могат да се описват в номенклатура (горива, ремонти и т.н), за да можем бързо и лесно да ги въвеждаме, тъй като на деня може да се случат въвеждане на повече от 100 разходни ордера за всеки служител, затова ни е нужно те да могат да са продуктивни. Трябва ни и справочна информация, по дни и месеци, за служителите и за цялата фирма какви разходи е натрупала.  

  **Забележка:** User Stories трябва да се напишат на английски, заедно със сценариите за тестване. Може  да се реализира чрез създаване на issue в Github, в което да е дефинирана информацията за user story'то.  

### Example User Story 

```
Scenario: Change PIN

Given that Joe already has a bank card
Given that Joe already has a PIN associated with the bank card
Given that we recognise Joe as the authorised holder of his bank card
When Joe says, "Change my PIN to 9876"
Then Joe sees, "Your PIN has been changed"
Then Joe sees that he can authorise a transaction with the PIN 9876"
```
