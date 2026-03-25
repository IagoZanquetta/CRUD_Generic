# CRUD Generic

Projeto de API REST para gerenciamento de produtos com operações completas de CRUD.

## Visão Geral

Este projeto consiste no desenvolvimento de uma API CRUD para gerenciamento de produtos. A aplicação permite realizar operações de criação, leitura, atualização e exclusão de registros, oferecendo uma estrutura básica e funcional para manipulação de dados por meio de requisições HTTP.

A proposta principal do projeto é demonstrar a implementação de uma API REST simples, organizada e voltada para operações fundamentais de persistência e consulta de dados.

## Objetivo do Projeto

Desenvolver uma aplicação CRUD funcional para gerenciamento de produtos, permitindo executar operações de criação, leitura, atualização e exclusão de forma estruturada e consistente.

## Resultado

Implementação de uma API capaz de gerenciar produtos por meio de endpoints específicos para cadastro, edição, exclusão, alteração de nome e filtragem de registros. O projeto permite demonstrar a estrutura básica de uma aplicação CRUD e a organização de rotas voltadas para manipulação de dados.

## Ferramentas Utilizadas

- API REST
- HTTP
- JSON
- ambiente de execução local em `localhost:8080`

> Caso deseje, esta seção pode ser refinada com a stack exata utilizada no projeto, como linguagem, framework e banco de dados.

## O que foi aprendido

Desenvolvimento e consolidação de habilidades em:
- estruturação de operações CRUD
- organização de endpoints para manipulação de dados
- envio e recebimento de dados em formato JSON
- construção de requisições HTTP para diferentes operações
- documentação básica de uma API REST

## Melhorias Futuras

Possibilidades de evolução do projeto:
- inclusão de validação de dados de entrada
- implementação de tratamento de erros mais detalhado
- adição de autenticação e autorização
- melhoria da padronização das rotas e respostas da API
- inclusão de documentação interativa com Swagger ou ferramenta equivalente
- adição de testes automatizados

## Endpoints da API

### Criação de Produto

**URL**  
`localhost:8080/RestApi/product/save`

**Request Body (JSON)**

```json
{
  "name": "caneta",
  "price": "10"
}
````

---

### Edição de Produto

**URL**
`localhost:8080/RestApi/product/edit/{id}`

**Request Body (JSON)**

```json
{
  "name": "caneta",
  "price": "10"
}
```

---

### Exclusão de Produto

**URL**
`localhost:8080/RestApi/product/delete/{id}`

**Request Body (JSON)**

```json
{
  "name": "caneta",
  "price": "10",
  "id": "1"
}
```

---

### Edição de Nome de Produto

**URL**
`localhost:8080/RestApi/product/editName/{id}/{name}`

**Request Body (JSON)**

```json
{
  "name": "caneta"
}
```

---

### Filtrar Produto

**URL**
`localhost:8080/RestApi/productsDefault/`

**Request Body (JSON)**

```json
{
  "id": "1"
}
```

## Estrutura do Projeto

```text
crud-generic/
├── README.md
└── código-fonte da aplicação
```

## Como Executar

1. Clonar este repositório:

   ```bash
   git clone https://github.com/seu-usuario/crud-generic.git
   ```

2. Acessar a pasta do projeto:

   ```bash
   cd crud-generic
   ```

3. Instalar ou configurar as dependências necessárias do projeto.

4. Executar a aplicação localmente para disponibilizar a API em:

   ```text
   localhost:8080
   ```

## Autor

**Iago Zanquetta**
