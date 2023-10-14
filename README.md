ture# Santander-dev-week-2023
desafio de código para o bootcamp Santander Becas na plataforma da DIO.me

##Diagrama de classes

```mermaid
classDiagram
class User {
  - id: long
  - name: string
  - account: Account
  - Feature: List<Resource>
  - card: Card
  - news: List<News>
}

class Account {
  - id: long
  - accountNumber: string
  - accountAgency: string
  - accountBalance: float
  - accountLimit: float
}

class Feature {
  - id: long
  - pixIcon: string
  - pixDescription: string
  - payIcon: string
  - payDescription: string
  - transferIcon: string
  - transDescription: string
}

class Card {
  - id: long
  - Number: string
  - Limit: float
}

class News {
  - id: long
  - newsIcon: string
  - newsDescription: string
}

User "1" *-- "1" Account
User "1" *-- "N" Feature
User "1" *-- "1" Card
User "1" *-- "1" News
```
