# Produtos API

Uma API REST simples desenvolvida com **Spring Boot** para gerenciamento de produtos. Este projeto foi criado como parte dos meus estudos em Spring Boot, com foco nos fundamentos do desenvolvimento de APIs REST utilizando Java.

## Funcionalidades

- Cadastrar um produto
- Listar todos os produtos
- Buscar um produto por ID
- Atualizar um produto
- Remover um produto

## Tecnologias

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Banco de Dados H2
- Maven

## Estrutura do Projeto

```
src
├── controller
├── model
├── repository
└── resources
```

## Endpoints da API

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/produtos` | Lista todos os produtos |
| GET | `/produtos/{id}` | Busca um produto pelo ID |
| POST | `/produtos` | Cadastra um novo produto |
| PUT | `/produtos/{id}` | Atualiza um produto existente |
| DELETE | `/produtos/{id}` | Remove um produto |

## Como Executar o Projeto

Clone o repositório:

```bash
git clone https://github.com/lucascarvalho-oliveira/spring-boot-api-playground.git
```

Acesse a pasta do projeto:

```bash
cd spring-boot-api-playground/produtosApi
```

Execute a aplicação:

```bash
mvnw.cmd spring-boot:run
```

A aplicação será iniciada em:

```
http://localhost:8080
```

## Banco de Dados

Este projeto utiliza o **H2 Database** em memória para o ambiente de desenvolvimento.

## Objetivos de Aprendizagem

- Desenvolver APIs REST com Spring Boot
- Compreender o funcionamento do Spring MVC
- Utilizar o Spring Data JPA
- Implementar operações CRUD
- Aplicar Injeção de Dependência
- Mapear entidades com JPA
- Organizar projetos utilizando arquitetura em camadas

---

Desenvolvido por **Lucas Carvalho**.
