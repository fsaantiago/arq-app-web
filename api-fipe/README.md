## Projeto de API de Tabela Fipe

## Atenção!
Esta API foi criada utilizando configurações da API disponibilizada antecipadamente. Você poderá consult-la clicando [neste link](https://github.com/joaopauloaramuni/arquitetura-de-aplicacoes-web/tree/main/PROJETOS/Fipe_RestAPI).

No entanto, não foi possível executar todos os métodos corretamente. Por algum motivo, que ainda não foi identificado, meu projeto parou de funcionar corretamente.
Nenhuma mudança crítica foi realizada no código de forma a impedir o correto funcionamento. No entanto, aqui está o método `GET` realizado antes de parar de funcionar e acredito que ainda é interessante avaliar o projeto.

A coleção criada no Mongo DB está estruturada da seguinte forma:

<img src="/api-fipe/images/fipe-collection.png">

Da mesma forma é possível saber como está estruturada pela IDE utilizada, como pode ver, abaixo:

<img src="/api-fipe/images/collection-fipe-ide.png">

Após a construção do projeto estes sé o teste de CRUD (`GET`, `POST`, `PUT` e `DELETE`)realizado.

### GET

<img src="/api-fipe/images/get-fipe.jpeg">


### Observação:

A coleção criada pode ser visualizada clicando [neste link](https://github.com/fsaantiago/arq-app-web/blob/main/api-fipe/fipe.collection.json).


## Tecnologias Utilizadas:

**Linguagem de Programação:** Java

**Framework:** Spring Boot

**Banco de Dados:** Mongo DB

**Ferramentas de Desenvolvimento:** IntelliJ IDEA, Postman
