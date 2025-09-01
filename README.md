# 🌱 Spring Beans Example Project

Демонстрационный проект Spring Boot, показывающий различные способы конфигурации бинов:
- **Java-based конфигурация** ⚙️
- **XML-based конфигурация** 📄
- **Автоконфигурация Spring Boot** 🤖

## 🚀 Технологии

- Java 21
- Spring Boot 3.0+
- Maven
- Spring Web MVC

## 📦 Зависимости

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
</dependencies>
```

## 🏃 Запуск приложения

1. Клонируйте репозиторий
2. Соберите проект:
```bash
mvn clean package
```
3. Запустите приложение:
```bash
java -jar target/spring-beans-0.0.1-SNAPSHOT.jar
```

Приложение будет доступно по адресу: http://localhost:8080

## 📡 API Endpoints

### Java Config Endpoint
```http
GET /java
```
Возвращает приветствие с временем инициализации бина и днём месяца

### XML Config Endpoint
```http
GET /xml
```
Возвращает дублированное приветственное сообщение через XML-сконфигурированный бин

## 🏗️ Структура конфигурации

### Java Config (org.example.springbeans.config.JavaConfig)
- `FullJavaConfigService` - primary бин с полной конфигурацией
- `JavaConfigService` - альтернативный бин

### XML Config (src/main/resources/application-context.xml)
- `helloXmlService` - бин с инжекцией зависимости через setter
- `utilsService` - вспомогательный сервис

## 🔧 Особенности реализации

- Использование `@Primary` для разрешения неоднозначностей
- Setter-based инжекция зависимостей для XML-бинов
- Constructor-based инжекция для Java-бинов
- Комбинирование Java и XML конфигураций через `@ImportResource`

## 📝 Примеры ответов

**Запрос GET /java:**
```json
"Hello from JavaConfig! time:2023-11-15T10:30:00.123Z dayOfMonth: 15"
```

**Запрос GET /xml:**
```json
"hello from Xml  hello from Xml"
```

---

## 📄 Лицензия

Этот проект создан в учебных целях.
