# kafka-springboot-project
This is a spring boot kafka project in which we are constantly fetching data from wikimedia and sending messages through producer and receiving through consumer


Steps to run the project:

Run zooperkeeper server and kafka server both before starting project:

1) .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

2) .\bin\windows\kafka-server-start.bat .\config\server.properties


There are two modules in this project one is producer and another one is consumer module .

a)First run the producer module application this one will run on port 8080

b)secondly run consumer module application this one will run on port 8081
