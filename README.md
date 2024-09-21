# ecommerce-order-system

---

## Desafio: Gerenciamento de Pedidos de E-commerce

### Contexto

Você foi encarregado de desenvolver uma API para gerenciar o processo de pedidos de uma loja online. A aplicação permitirá que usuários se registrem, realizem login, criem pedidos e visualizem o histórico de seus pedidos. A autenticação será realizada utilizando JWT, e o sistema enviará notificações de confirmação de pedidos através de JMS para filas de mensagens.

### Requisitos do Desafio

#### Autenticação e Autorização com JWT
- Implemente um sistema de registro e login de usuários.
- Proteja os endpoints que gerenciam pedidos, garantindo que apenas usuários autenticados possam criar e visualizar pedidos.
- Utilize JWT para gerar e validar tokens de autenticação.

#### Gerenciamento de Pedidos
- Um usuário autenticado deve ser capaz de:
  - Criar um novo pedido, incluindo produtos e suas quantidades.
  - Visualizar seus pedidos.
- Cada pedido deve conter as seguintes informações:
  - ID do pedido, ID do usuário, data do pedido e status (ex: PENDENTE, PROCESSADO, ENTREGUE).
  - Uma lista de produtos no pedido, onde cada produto possui: ID, nome, preço e quantidade.

#### Persistência com Hibernate/JPA
- Utilize o Hibernate para mapear entidades relacionadas a pedidos e usuários.
- Conecte a aplicação a um banco de dados relacional (MySQL, PostgreSQL ou H2 para testes).

#### Processamento Assíncrono com JMS
- Cada vez que um pedido for criado, envie uma mensagem de confirmação para uma fila JMS.
- Implemente um consumidor JMS que escute a fila de mensagens e processe as notificações de confirmação de pedidos.

#### API RESTful
Crie os seguintes endpoints para a API:
- `POST /api/auth/register`: Cadastro de novos usuários.
- `POST /api/auth/login`: Geração de JWT para login.
- `POST /api/orders`: Criação de um novo pedido.
- `GET /api/orders`: Listagem dos pedidos do usuário autenticado.

#### Validações
- Valide os dados de entrada nos endpoints (ex: verificar se o produto existe ao criar um pedido, se a quantidade é válida, etc.).

--- 
