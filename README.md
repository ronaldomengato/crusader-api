# The crusader app

This is an experimental app for testing and learning some new cool stuff. The main goal is to use spring boot with MongoDB and Docker.
PS: I know that the database credentials should be put on env vars or secrets.

### How to run

`docker-compose up --build`

### API endpoints

| Mehtod | Path                      | Description                   |
| ------ | ------------------------- | ----------------------------- |
| GET    | `/trips?username={value}` | Lists all the user's trips    |
| GET    | `/trips/recommend`        | Recommends a country to visit |
| POST   | `/trips`                  | Saves a new trip record       |

_Paylod for the save method_

```json
{
  "username": "crusader@travelers.com",
  "title": "Christmas 2020",
  "description": "Christmas at grandmother's house",
  "country": "CANADA",
  "date": "2020-12-25"
}
```

|
