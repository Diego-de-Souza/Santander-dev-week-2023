# Santander-dev-week-2023
desafio de código para o bootcamp Santander Becas na plataforma da DIO.me

##Diagrama de classes

```mermaid
class User {
  - name: string
  - account: Account
  - resources: List<Resource>
  - card: Card
  - news: List<News>
}

class Account {
  - accountNumber: string
  - accountAgency: string
  - accountBalance: float
  - accountLimit: float
}

class Resource {
  - pixIcon: string
  - pixDescription: string
  - payIcon: string
  - payDescription: string
  - transferIcon: string
  - transDescription: string
}

class Card {
  - Number: string
  - Limit: float
}

class News {
  - newsIcon: string
  - newsDescription: string
}

User --> Account: has
User --> Resource: has
User --> Card: has
User --> News: has
```
