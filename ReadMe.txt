open the command prompt and navigate to your spring boot project
and run the command
docker build -t spring-with-docker . 

the above command will create an image for the spring boot application

now to expose our application on port 8080 use the command
docker run -p 8080:8080 -t spring-with-docker

Now application is deployed with container name spring-boot-with-docker