# Agenda API

API REST simples para gerenciar contatos (CRUD) usando Java + Spring Boot + PostgreSQL.

## Funcionalidades

- Criar contato
- Listar todos os contatos
- Buscar contatos por nome

## Tecnologias

- Java 21  
- Spring Boot 3.5.4  
- PostgreSQL  
- Maven  

## Como rodar localmente

1. Configure o PostgreSQL e crie um banco chamado `agenda`.  
2. Ajuste as configurações no `src/main/resources/application.properties`.  
3. Execute o projeto com o comando:  
   ```bash
   mvn spring-boot:run

## Melhorias recentes

- Validação de campos obrigatórios com `@Valid`
- Tratamento global de erros com `@ControllerAdvice`
