# Projeto Farmácia — API RESTful (Spring Boot)

API REST desenvolvida como projeto de avaliação do Bloco 02 do Bootcamp da Generation Brasil. O objetivo da aplicação é gerenciar o catálogo de produtos e categorias de um e-commerce de farmácia, implementando operações completas de CRUD e relacionamento entre entidades.

---

## Tecnologias e Ferramentas

* **Java 17**
* **Spring Boot 3**
  * Spring Data JPA
  * Spring Web
  * Validation (Bean Validation)
* **MySQL** (Banco de dados relacional)
* **Spring Tool Suite (STS)** / IntelliJ IDEA
* **Insomnia** (Testes de requisições HTTP)
* **Git & GitHub** (Versionamento de código)

---

##  Estrutura do Banco de Dados e Relacionamento

A aplicação conta com duas entidades principais conectadas por um relacionamento **1:N (Um para Muitos)**:

* **Categoria (`tb_categorias`)**: Representa as seções da farmácia (ex: *Medicamentos*, *Higiene*, *Cosméticos*).
* **Produto (`tb_produtos`)**: Representa os itens comercializados, vinculados obrigatoriamente a uma categoria.

> **Regra de Negócio:** Uma categoria pode conter vários produtos, mas cada produto pertence a apenas uma categoria (`@ManyToOne` em Produto e `@OneToMany` em Categoria com suporte a `CascadeType.REMOVE`).

---

##  Endpoints da API

Abaixo estão os endpoints disponíveis na aplicação para realização do CRUD em ambos os recursos.

###  Recurso Categoria (`/categorias`)

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| `GET` | `/categorias` | Lista todas as categorias cadastradas |
| `GET` | `/categorias/{id}` | Busca uma categoria pelo ID |
| `GET` | `/categorias/nome/{nome}` | Busca categorias por nome/tipo (IgnoreCase/Containing) |
| `POST` | `/categorias` | Cadastra uma nova categoria |
| `PUT` | `/categorias` | Atualiza os dados de uma categoria existente |
| `DELETE` | `/categorias/{id}` | Remove uma categoria pelo ID |

### Recurso Produto (`/produtos`)

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| `GET` | `/produtos` | Lista todos os produtos cadastrados |
| `GET` | `/produtos/{id}` | Busca um produto pelo ID |
| `GET` | `/produtos/nome/{nome}` | Busca produtos pelo nome (IgnoreCase/Containing) |
| `POST` | `/produtos` | Cadastra um novo produto (requer ID da Categoria) |
| `PUT` | `/produtos` | Atualiza os dados de um produto existente |
| `DELETE` | `/produtos/{id}` | Remove um produto pelo ID |

---
