Hello there!

For launch this project in Docker, you are must:

1) Have a docker.
2) Download the docker-compose 
https://github.com/RustamSaydam/TestEFFECTIVEmobile/blob/saidam_back_beta/docker-compose.yml , 
3) When you download  the docker-compose, 
you are must find this String:
_________________________________
version: '2'

services:
  app:
    image: 'myorg/myapp:latest'
    build:
      context: .
    container_name: app
    ports:
      - 8080:8080
    depends_on:
      - db
    environment:

_________________________________
And change the code like below
_________________________________

version: '2'

services:
  app:
    image: 'saydamrustam/myapp'
    container_name: app
    ports:
      - 8080:8080
    depends_on:
      - db
    environment:

_______________________________
4) Run this command: docker-compose up
