🚀 CRUD de Usuários com Spring Boot

Projeto backend desenvolvido em Java com Spring Boot, com foco em API REST, CRUD completo e integração com banco de dados MySQL.
Ideal para estudos, portfólio e consolidação dos fundamentos de desenvolvimento backend.

📌 Funcionalidades

Criar usuário (Create)

Listar usuários (Read)

Buscar usuário por ID (Read)

Excluir usuário (Delete)

API REST seguindo boas práticas

Integração com banco de dados relacional

🛠️ Tecnologias Utilizadas

Java 21

Spring Boot

Spring Web

Spring Data JPA

MySQL

Maven

Apache Tomcat (embutido)

```
📂 Estrutura do Projeto
src
 └── main
     ├── java
     │   └── com.user.crud_user
     │       ├── controller
     │       │   └── UserController.java
     │       ├── entity
     │       │   └── User.java
     │       ├── repository
     │       │   └── UserRepository.java
     │       └── service
     │           └── UserService.java
     └── resources
         └── application.properties
```
🔗 Endpoints da API
➕ Criar usuário

POST

/test/test

Body (JSON):

{
  "nome": "Gustavo",
  "email": "gustavo@email.com"
}
📄 Listar usuários

GET

/test
🔍 Buscar usuário por ID

GET

/test/{id}
❌ Deletar usuário

DELETE

/test/{id}

⚙️ Configuração do Banco de Dados

No arquivo application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_banco
spring.datasource.username=root
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
▶️ Como Executar o Projeto

Clone o repositório:

git clone https://github.com/Gustavo-SX/nome-do-repositorio.git

Acesse a pasta do projeto:

cd nome-do-repositorio

Execute a aplicação:

mvn spring-boot:run

A API estará disponível em:

http://localhost:8080

🧪 Testes da API

Os endpoints podem ser testados utilizando:

Postman

Insomnia

Navegador (para requisições GET)

📈 Aprendizados do Projeto

Criação de API REST com Spring Boot

Separação de camadas (Controller, Service, Repository)

Uso do Spring Data JPA

Integração com MySQL

Boas práticas de organização de código

👤 Autor

Gustavo
GitHub: 👉 https://github.com/Gustavo-SX

📄 Licença

Projeto de uso livre para fins educacionais e de portfólio.
