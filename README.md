# 🚀 Projeto Spring Boot - Gerenciamento de Clientes com Integração ViaCEP

Este projeto é uma API RESTful desenvolvida em Spring Boot para gerenciar clientes e seus respectivos endereços, com integração automática ao serviço ViaCEP para consulta e persistência de endereços via CEP.

---

## 🎯 Funcionalidades

- 🧑‍💼 **CRUD completo para Clientes**  
  Criação, leitura, atualização e exclusão de clientes com persistência em banco de dados.

- 📨 **Integração com ViaCEP**  
  Ao inserir ou atualizar um cliente, a aplicação consulta o endereço via CEP no serviço ViaCEP e armazena localmente.

- ⚠️ **Tratamento global de exceções**  
  Exceções como recurso não encontrado são tratadas e retornam mensagens customizadas com código HTTP adequado.

---

## 🛠️ Tecnologias Utilizadas

- ☕ Java 17+  
- 🌱 Spring Boot  
- 📦 Spring Data JPA  
- 🌐 Feign Client (para integração HTTP com ViaCEP)  
- 💾 Banco de Dados relacional
- 📚 Maven
- 🧪 Postman (para teste e documentação dos endpoints)
---

## 🏗️ Estrutura do Projeto

- **Controller**  
  `ClienteRestController` expõe os endpoints REST para operações com clientes.

- **Model**  
  Classes `Cliente` e `Endereco` representam as entidades do domínio.

- **Repository**  
  Interfaces `ClienteRepository` e `EnderecoRepository` extendem `CrudRepository` para operações CRUD no banco.

- **Service**  
  `ClienteService` define os métodos de negócio e `ClienteServiceImpl` implementa a lógica, incluindo integração com ViaCEP.

- **ViaCepService**  
  Interface Feign Client que consulta o serviço externo ViaCEP para obter dados de endereço a partir do CEP.

- **Tratamento de exceções**  
  `GlobalExceptionHandler` captura exceções específicas e formata as respostas de erro.

---

## 🛣️ Endpoints Principais

| Método | Endpoint          | Descrição                    |
|--------|-------------------|------------------------------|
| GET    | /clientes         | Listar todos os clientes     |
| GET    | /clientes/{id}    | Buscar cliente por ID        |
| POST   | /clientes         | Inserir novo cliente         |
| PUT    | /clientes/{id}    | Atualizar cliente existente  |
| DELETE | /clientes/{id}    | Deletar cliente por ID       |