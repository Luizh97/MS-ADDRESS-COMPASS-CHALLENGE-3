# Microservice Endereço
 
# Descrição

O microserviço recebe um id e um cep atrvés de outro microserviço, faz as validações do endereço e salva no banco de dados.


## Desenvolvido por
Luiz Henrique Brandâo Dias
 
## O que é necessário para o funcionamento? 
 
- Java 17 
- Banco de dados MySQL
- Spring Boot
 
## Como utilizar?
 
1. Primeiro clone o repositório:

git clone https://github.com/Luizh97/MS-ADDRESS-COMPASS-CHALLENGE-3.git

2. O banco de dados deve ser configurado na pasta `application.properties`.
 
3. Aplicação pronta para ser executada
 
 
Documentação: localhost:8080/docs-msaddress.html
 
## Endpoints disponíveis no microserviço
 

 
### `POST /{cep}/usuario`
 
Salva um endereço junto ao id do usuáro que enviou a requisição.
 

 
### `Dificuldades:`

Neste desenvolvimento eu não tive tanta dificuldade, após a sincronização com o via cep, o restante foi tranquilo. Faltaram testes e documentação. Farei posteriormente.


