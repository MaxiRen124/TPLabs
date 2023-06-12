	Для работы web-приложения необходимо:
1. Установить приложение MAMP для создания локального сервера.
2. В папке, где установлена программа (C:\MAMP) заменить папку htdocs на текущую.
3. Запустить локальный сервер через приложение MAMP.
4. Открыть phpMyAdmin.
5. Нажать на кнопку "New" для создания новой БД.
6. Написать название - star_catalog, нажать "Create".
7. Нажать кнопку "SQL" для ввода SQL-кода.
8. Ввести приведенный код ниже и нажать "Go".
CREATE TABLE `star_catalog`.`stars` ( `star_name` VARCHAR(50) NOT NULL , `constellation` VARCHAR(50) NOT NULL , `distance` FLOAT NOT NULL , `weight_sun` FLOAT NOT NULL , PRIMARY KEY (`star_name`)) ENGINE = InnoDB;
INSERT INTO stars VALUES 
  ('Alpha Centauri', 'Centaurus', 4.36, 0.123),
  ('Sirius', 'Big Dog', 8.60, 2),
  ('Aldebaran', 'Taurus', 65, 2.5),
  ('Rigel', 'Orion', 850, 3.58),
  ('Antares', 'Scorpion', 600, 12.4/10),
  ('Betelgeuse', 'Orion', 650, 18);
9. Ввести в строке браузера "localshost", после чего всё должно заработать.