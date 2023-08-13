This is pet project for test rabbitMq possibilities and performance

Get started:

1. run "docker compose up" in console in package "\resources" for start image rabbit mq
2. configurate app in application.properties for yoru PC
3. run app
4. open "http://127.0.0.1:15672/" username: rmuser, pass: rmpassword
5. send some message in endpoint "http://localhost:8081/rabbit/v1/send", attaching message in JSON body
6. watch for performance

convention: the product is distributed as is and the developer is not responsible for any problems
that arise during the operation of the program