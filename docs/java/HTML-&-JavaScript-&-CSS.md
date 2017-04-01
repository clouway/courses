> IMPORTANT! Completed tasks are evaluate at the final result and the manner of applying the knowledge gained in the  course 

### HTML & JavaScript & CSS

### Required reading
 * [HTML](http://w3schools.com/html/default.asp)  
 * [CSS](http://w3schools.com/css/default.asp)  
 * [Bootstrap](http://getbootstrap.com/)  
 * [JavaScript](http://w3schools.com/js/default.asp)  
 * [Simple JavaScript testing](https://github.com/mjackson/expect)
 * [JavaScript Best Practices](https://github.com/airbnb/javascript)  
 * [Ajax Intro](http://www.w3schools.com/xml/ajax_intro.asp)
 * [Introduction to Unit Testing in JS](http://tutorials.pluralsight.com/front-end-javascript/introduction-to-test-driven-development-in-javascript)  
 * [ReactJS](https://facebook.github.io/react/)  

**Инструменти за разработка:** [WebStorm](https://www.jetbrains.com/webstorm/), [Sublime Text](http://www.sublimetext.com/), [VIM](http://www.vim.org/)       
**Hosting:** Pages could be hosted using [Github](https://pages.github.com/)  

**Забележка**: Използвайте [примерни теми](http://getbootstrap.com/getting-started/#examples) за задачи 6 и 7, с които да подобрите визуализацията на потребителския интерфейс

### Задачи 
1. Да се направи HTML страница съдържаща линкове към:
 * Директория от локалния компютър
 * Текстов документ
 * HTML страница на локалния компютър
 * Website 

  Линковете трябва да се отварят в нов прозорец.

2. Да се направи HTML страница в която да има бутон, който след като се натисне да се показва съдържание от външен ресурс (JSON, XML) в панел, който да се намира под него. За зареждането на външния ресурс трябва да се използва AJAX.

3. Да се направи HTML страница съдържаща форма за въвеждане на данни за потребител (first name, last name, EGN , age, address, password, confirm password) и да се извършат следните JavaScript (client side) валидации: 
 * first name - от 1 до 15 символа
 * lastname - от 1 до 15 символа
 * EGN- точно 10 цифри
 * аge- от 18 до 118
 * address- от 1 до 100 символа
 * password- от 6 до 18 символа и съдържа само латински букви и цифри.

4. Да се направи калкулатор на JavaScript за смятане на цели числа. Трябва да има графичен интерфейс и следните функции:
 * Поле за числото (въвеждането на числото става само чрез натискане на бутон от интерфейса, не от клавиатурата.
 * Бутони с цифрите от 0 до 9;
 * Бутони с възможните операции: +, -, *, /, = ;
 * Бутон за изтриване на последната въведена цифра
 * Бутон за изчистване на цялото поле.Забележка: Всички страници трябва да изпозват външен CSSфайл, в който да се дефинират
 * цветовете на линковете във всичките им възможни състояния
 * цвят на фона
 * изглед на таблиците, полетата, бутоните и т. н.

5. Да се направи валидатор на JavaScript за дробни числа, който проверява дали числото има максимална дължина на цялата част от 10 символа и на дробната част - от 5 символа(не е задължителна), като дробната и цялата част са отделени със запетая или точка.

### JS Testing Tips 

_test.html_
```html
<!DOCTYPE html>
<html>
	<head>
		<title>Fraction Tests</title>
	</head>
	<body>
		<script src="https://unpkg.com/expect/umd/expect.min.js"></script>
		<script src="fraction.js"></script>
		<script language="javascript">
			var exp = [
				['23', true],
				['23.23', true],
				['12,34', true],
				['-10,12', true],
				['0.20', true],
				['1200.20', true],
				['1200.2033', true],
				['1231231312313', false],
				['1.1231231231312', false],
				['11.23.23', false],
				['abc', false],
				['12,34,', false],
				['12,11,12', false],
			];

			exp.forEach(function(test) {
				var res = isFraction(test[0]);				
				window.expect(res).toBe(test[1], "expected isFraction('" + test[0] + "') to be " + test[1] + ", but was: " + res);

			});
		</script>
	</body>
</html>
```


