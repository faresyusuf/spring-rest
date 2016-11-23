# spring-rest


curl -X POST --header 'Content-Type: application/json' -d '{ "password": "admin","login": "fares","email":"fares@gmail.com","firstName":"fares","lastName":"yusuf"}' 'http://localhost:8080/api/register'

curl -X POST --header 'Content-Type: application/json' -d '{ "password": "admin","username": "admin"}' 'http://localhost:8080/api/authenticate'