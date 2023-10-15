# SpringBootProject

# Sobre o projeto

Projeto utilizando o Spring Boot para criação de uma API REST responsável pelo cadastro de clientes em uma aplicação de compras fictícia.

## EndPoints
![image](https://github.com/Emanuelsmcastro/SpringBootProject/assets/93106680/02940507-1244-4b58-89ae-f1ea7724c5d8)
- Retorna todos os clients.

![image](https://github.com/Emanuelsmcastro/SpringBootProject/assets/93106680/6c598ff8-262b-4771-ab19-7c863b547035)
- Retorna informações do cliente pelo ID.

Esse modelo de url foi adotado para as demais entidades do projeto, como por exemplo: /products, /products/{ID}, /categories, /categories/{ID}, /orders, /orders/{ID}.

### Métodos PUT, DELETE, POST:
![image](https://github.com/Emanuelsmcastro/SpringBootProject/assets/93106680/7eec343b-ef35-4066-a52a-6780190587c8)
- Cadastro de usuário.

![image](https://github.com/Emanuelsmcastro/SpringBootProject/assets/93106680/adf167d2-8564-401b-bad4-60e43035cddb)
- Atualizar um usuário.

![image](https://github.com/Emanuelsmcastro/SpringBootProject/assets/93106680/4514a36c-3239-4657-acad-4486f2b59f69)
- Apagar um usuário.

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
  
# Como executar o projeto

## Back end
Pré-requisitos: Java 17

```bash
# clonar repositório
git clone https://github.com/Emanuelsmcastro/SpringBootProject.git

# entrar na pasta do projeto back end
cd backend  #-> Diretório que contém o repositório clonado.

# executar o projeto
./mvnw spring-boot:run
```
