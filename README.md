#noteBookNoteProgram

Создание структуры для ввода данных с командной строки с помощью регулярных выражений 

-	написать необходимую структуру ввода данных из командной строки и передать результат ввода в соответствующую сущность. Оформить согласно JCC,  написать JavaDOC;
-	эта структура должна проверять на правильность ввод данных (сохраняя правильно введенные) и в случае полной валидности всех данных – передает их в соответствующий класс в модели.

1.	Фамилия абонента 
2.	Имя абонента
3.	Отчество абонента
4.	Сформировать из введенных данных: Фамилия + Пробел + Первая буква Имени + точка
5.	Никнейм 
6.	Комментарий 
7.	Группы в которую занесен абонент (Enum с названиями групп).
8.	Телефон дом
9.	Телефон моб.
10.	Телефон моб. 2 (может отсутствовать)
11.	Е-майл
12.	Скайп
13.	Адрес, состоящий из:
- Индекс
- город проживания
- улица
- номер дома
- номер квартиры
14.	Строка полного адреса сформированного из данных п.13.
15.	Даты внесения записи в записную книжку
16.	Даты последнего изменения записи

Создание собственного исключения.

Использовать код программы из задания «Создание структуры для ввода данных с командной строки с помощью регулярных выражений».
Сымитировать ситуацию, когда запись, поступающая в записную книжку, содержит поле логин,  существующий в данной записной книжке. 
Исключительная ситуация должна вернуть данные в контроллер (и, например, опубликовать их) и попросить пользователя сменить логин на другой. 
После соответствующего ввода, запись должна повторно поступить в модель.
