# Projeto Final - Bootcamp Mercado Livre

Este repositório contém o **Projeto Final** desenvolvido durante o Bootcamp Mercado Livre, com o objetivo de criar uma solução de e-commerce escalável e eficiente. Este projeto envolve a implementação de funcionalidades principais para uma plataforma de marketplace, simulando o ambiente do Mercado Livre.

## Tecnologias Utilizadas

- **Java**: Linguagem principal utilizada para o desenvolvimento do backend.
- **Spring Boot**: Framework que facilita a criação de APIs RESTful e microserviços.
- **MySQL**: Banco de dados relacional utilizado para armazenar informações de usuários, produtos e transações.
- **Hibernate/JPA**: Framework de persistência para interação com o banco de dados.
- **Thymeleaf**: Template engine para renderização de páginas HTML no servidor.
- **Maven**: Utilizado para gerenciamento de dependências e build do projeto.
- **JUnit**: Ferramenta de testes para garantir a qualidade do código.

## Funcionalidades

- **Cadastro de Usuários**: Registro de novos usuários e autenticação.
- **Listagem de Produtos**: Exibição de produtos cadastrados na plataforma.
- **Carrinho de Compras**: Adicionar/remover produtos ao carrinho e cálculo do valor total.
- **Finalização de Compras**: Simulação de um processo de compra e integração com sistemas de pagamento.
- **Avaliação de Produtos**: Sistema de reviews e avaliação de produtos pelos clientes.

## Como Executar o Projeto

### Pré-requisitos

- **Java 11** ou superior
- **Maven** instalado
- **MySQL** ou outro banco de dados compatível
- Configurar o arquivo `application.properties` com as credenciais do banco de dados.

### Passos para Execução

1. Clone o repositório:
   ```bash
   git clone https://github.com/SeuUsuario/Projeto-Final-Bootcamp-MercadoLivre.git
Navegue até o diretório do projeto:

bash
Copiar código
cd Projeto-Final-Bootcamp-MercadoLivre
Compile e execute o projeto utilizando o Maven:

bash
Copiar código
mvn clean install
mvn spring-boot:run
Acesse a aplicação no navegador:

arduino
Copiar código
http://localhost:8080
Estrutura do Projeto
src/main/java: Contém o código-fonte da aplicação, dividido em controllers, services, models e repositories.
src/main/resources: Contém os templates Thymeleaf e o arquivo application.properties para configuração da aplicação.
pom.xml: Arquivo de configuração do Maven, onde as dependências e plugins estão definidos.
Testes
Para rodar os testes unitários e de integração:

bash
Copiar código
mvn test
Contribuição
Contribuições são bem-vindas! Para contribuir, siga os passos:

Faça um fork do repositório.
Crie uma nova branch para a sua feature (git checkout -b minha-feature).
Commit suas mudanças (git commit -m 'Adicionando nova feature').
Envie o pull request.
