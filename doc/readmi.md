#Currency Service
Данный сервис предоставляет актуальную информацию по курсам валют с сохранением  в базу данных и сравнением курса по отношению к рублю, так же при сравнении происходит отображение gif-анимации.
##Технологии:

- ***Spring Boot v2.4.1***
- ***Spring Cloud(Open Feign)***
- ***Spring DATA-JDBC v2.4.2***
- ***Jackson***  
- ***PostgreSQL v42.1.4***
- ***Freemarker***
- ***Bootstrap4***

##Обзор классов:

- [ClientFeign](.com/yakovlev/ServiceCurrency/ClientFeign)<br/>
**В данном пакете хранятся классы для связи с внешними сервисами используя API Open feign.**<br/>
  
- [Сonfig](com/yakovlev/ServiceCurrency/config)<br/>
**В данном пакете находятся конфигурационные классы**

- [Controller](com/yakovlev/ServiceCurrency/controller)<br/>
  **В данном пакете находится контроллер**
-  [DAO](com/yakovlev/ServiceCurrency/dao), [Domain](com/yakovlev/ServiceCurrency/domain)<br/>
  **В данных пакетах находятся классы для взаимодействия с бд**

-  [Model](com/yakovlev/ServiceCurrency/model)<br/>
   **В данных пакетах находятся классы для взаимодействия с API Open Feign и json**
   



