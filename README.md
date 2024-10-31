# Email Sender - Backend

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)

Esse é um projeto construído em  **Java com Spring Boot, Spring Data Jpa, Validation,  RabbitMQ, Java Mail e MySQL.** 

Projeto de um sistema de mensageria, sendo responsável pelo envio de e-mail para um fila do rabbitmq e sendo consumido pelo consumer. Ao receber essa mensagem no consumir, irá ser enviado um e-mail para o destinatário .
## Table of Contents

- [Instalação](#instalação)
- [Usabilidade](#usabilidade)
- [Contribuição](#contribuição)

## Instalação

1. Clone o repositório:

```bash
git clone https://github.com/samuel-melo1/emailSenderMicroservice
```

## Usabilidade
 
1. Inicie a aplicação com o Maven
2. A API estará disponível em http://localhost:8080
3. Instale o MySQL para utilizar o projeto https://www.mysql.com/downloads/

## Contribuição

Sugestões e/ou contribuições são bem-vindas! Se você encontrar qualquer questão ou tenha sugestões de melhorias, por favor, abra uma solicitação pull para o repositório. 


Ao contribuir para este projeto, siga o estilo de código existente, [commit conventions](https://www.conventionalcommits.org/en/v1.0.0/), e envie suas alterações em uma ramificação separada.
