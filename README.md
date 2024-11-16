# DSLIST

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)

This project is an API built using Java, Spring Boot, and H2 as the database.

The Game List API was developed during the Java Spring Intensive by [Nélio Alves](https://github.com/acenelio). The project's goal is to allow users to create and manage their game collections, with functionalities to create, retrieve, update, and reorder game lists. Users can interact with the system through RESTful API endpoints, allowing them to organize games into different lists and efficiently view details about them.

## Functionalities

- **Create and Manage Game Lists: Users can create their own game lists and manage the games within them.**

- **View Games: Retrieve details about games stored in the system, including the game’s title, year, genre, platform, and a brief description.**

- **Reorder Games in a List: Users can reorder the games within a specific list to arrange them according to preference.**

- **Retrieve Games by List: Fetch all games in a specific game list by its ID.**

- **Get Detailed Information about a Game: Retrieve complete information about a game, including a detailed description.**

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Database](#database)

## Installation

1. Clone the repository:

```bash
git clone https://github.com/LuisGustavoDev/dslist.git
```

2. Install dependencies with Maven

## Usage

1. Start the application with Maven
2. The API will be accessible at http://localhost:8080

## API Endpoints
The API provides the following endpoints:

**GET GAMES**

```markdown
GET /games - Retrieve all games in the system.
```
```json
[
    {
        "id": 1,
        "title": "The Witcher 3",
        "year": 2015,
        "genre": "RPG",
        "platform": "PC, PS4",
        "imgUrl": "https://example.com/witcher.jpg",
        "shortDescription": "A story-driven RPG with vast open-world exploration."
    },
    {
        "id": 2,
        "title": "Minecraft",
        "year": 2011,
        "genre": "Sandbox",
        "platform": "PC, PS5",
        "imgUrl": "https://example.com/minecraft.jpg",
        "shortDescription": "A sandbox game where players can build and explore worlds."
    }
]
```

**GET GAME BY ID**

```markdown
GET /games/{id} - Retrieve details of a specific game by its ID.
```

```json
{
    "id": 1,
    "title": "The Witcher 3",
    "year": 2015,
    "genre": "RPG",
    "platform": "PC, PS4",
    "imgUrl": "https://example.com/witcher.jpg",
    "shortDescription": "A story-driven RPG with vast open-world exploration.",
    "longDescription": "Geralt of Rivia is a monster hunter searching for his adopted daughter, who is on the run from the Wild Hunt."
}
```

**GET GAMES BY LIST**
```markdown
GET /lists/{listId}/games - Retrieve all games in a specific list.
```

```json
[
    {
        "id": 1,
        "title": "The Witcher 3",
        "year": 2015,
        "genre": "RPG",
        "platform": "PC, PS4",
        "imgUrl": "https://example.com/witcher.jpg",
        "shortDescription": "A story-driven RPG with vast open-world exploration."
    }
]
```

**POST MOVE GAME**
```markdown
POST /lists/{listId}/replacement - Move a game within a list (reorder games).
```

```json
{
    "sourceIndex": 0,
    "destinationIndex": 1
}
```

## Database

The project uses [H2 Database](https://www.h2database.com/html/main.html) for testing purposes. For production environments, [PostgreSQL](https://www.postgresql.org/docs/) can be configured.

## H2 Database (Testing)

The project uses **H2 Database** for **testing purposes**. It runs an in-memory database during the tests, meaning the data will not persist when the application is stopped or the tests are finished.

**To access the H2 Console for testing:**

1. Go to `http://localhost:8080/h2-console` after starting the application.
2. Use the following default settings:
    - **JDBC URL**: `jdbc:h2:mem:testdb`
    - **User**: `sa`
    - **Password**: (empty)
 
## PostgreSQL Database (Development)

For **development**, **PostgreSQL** is used. You need to configure the database connection in the `application-dev.properties` file.

**Set up the PostgreSQL connection:**

1. Create a PostgreSQL database in your environment (e.g., `game_list_db`).
2. Update your `application-dev.properties` with the following:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/game_list_db
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
spring.jpa.hibernate.ddl-auto=none
```
3. The data will be persisted in the PostgreSQL database when using the development profile.

## Switching Between Databases

You can switch between H2 (for testing) and PostgreSQL (for development) by setting the appropriate profile when starting the application.

- For **H2 (Testing)**:

```properties
spring.profiles.active=${APP_PROFILE:test}
```

- For **PostgreSQL (Development)**:

```properties
spring.profiles.active=${APP_PROFILE:dev}
```
This allows you to easily switch environments depending on your setup.

## Important Notes: 

- When using H2, the database is in-memory, meaning all data will be lost when the application is stopped.

- Ensure your PostgreSQL database is configured correctly before running the application in development.

