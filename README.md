# Escola de Informática

Projeto para gerenciamento de uma escola de informática, desenvolvido com Spring Boot, PostgreSQL e Docker.

![image](https://github.com/user-attachments/assets/34f4606b-c068-4983-8e41-399dea1d32de)


## Descrição

Este projeto foi desenvolvido para manter um controle do funcionamento de uma escola de informática. A aplicação permite gerenciar alunos, professores e turmas, com todas as informações relevantes para cada entidade.

## Funcionalidades

- **Gerenciamento de Alunos**: cadastro, atualização, listagem e remoção de alunos.
- **Gerenciamento de Professores**: cadastro, atualização, listagem e remoção de professores.
- **Gerenciamento de Turmas**: cadastro, atualização, listagem e remoção de turmas.
- **Validação de Dados**: utilizando Bean Validation.
- **Integração com Banco de Dados**: PostgreSQL.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.4.1**
  - Spring Web
  - Spring Data JPA
  - Spring Boot Starter Validation
- **PostgreSQL**
- **Docker**
- **Lombok**

## Configuração do Ambiente

### Pré-requisitos

- Docker
- Java 17
- Maven

### Configuração do Banco de Dados

O projeto utiliza um contêiner Docker para o banco de dados PostgreSQL. Para configurar o banco de dados, siga os passos abaixo:

1. Certifique-se de que o Docker está instalado e em execução.
2. Na raiz do projeto, execute o comando abaixo para iniciar o contêiner PostgreSQL:
   ```bash
     docker-compose up -d
   
   ```
3. As configurações do banco de dados estão definidas no arquivo application.properties:
     ```bash
        spring.datasource.url=jdbc:postgresql://localhost:5432/escolainfo
        spring.datasource.username=postgres
        spring.datasource.password=postgres
        spring.jpa.hibernate.ddl-auto=update
        spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
     
   ```

## Executando a Aplicação
   - Clone o repositório:
      ```bash
        git clone https://github.com/teofilonicolau/escola_informatica_java.git
 
     ```

   - Navegue até o diretório do projeto:

      ```bash
        cd escola_informatica_java

 
     ```

   - Compile e execute a aplicação utilizando Maven:

      
      ```bash
        ./mvnw spring-boot:run


 
     ```

    
    

