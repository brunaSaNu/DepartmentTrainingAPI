# API REST de Gerenciamento de Usuários

API REST desenvolvida em Java com Spring Boot e JPA para gerenciar usuários de um departamento. Utiliza um banco de dados em memória (H2) para testes durante o desenvolvimento.

## Endpoints

### 1. Buscar Todos os Usuários
- **Método:** GET
- **URL:** `/usuarios`
- **Descrição:** Retorna uma lista de todos os usuários cadastrados.

### 2. Buscar Usuário por ID
- **Método:** GET
- **URL:** `/usuarios/{id}`
- **Descrição:** Retorna os detalhes de um usuário com base no ID fornecido.

### 3. Adicionar Novo Usuário
- **Método:** POST
- **URL:** `/usuarios`
- **Descrição:** Adiciona um novo usuário ao sistema. O corpo da requisição deve conter os dados do usuário no formato JSON.

## Tecnologias Utilizadas

- Java
- Spring Boot
- JPA (Java Persistence API)
- H2 Database (banco de dados em memória)

## Como Executar

1. Clone o repositório.
2. Execute a aplicação Spring Boot.
3. Utilize os endpoints conforme descrito acima.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
