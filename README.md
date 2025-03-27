# 🚀 Desafio Backend Magalu – Notificações

Este repositório contém a implementação de um microserviço para o **Desafio Backend da Magalu**, focado no agendamento e
envio de notificações utilizando **Spring Boot**.


---

## 📌 Tecnologias Utilizadas

- **Java 21** + **Spring Boot 3.4.4**
- **Spring Data JPA** para acesso ao banco de dados
- **MySQL** como banco de dados relacional
- **Docker** para containerização do MySQL
- **Spring Scheduler** para agendamento de tarefas
- **SLF4J** para logging
- **Lombok** para reduzir código boilerplate
- **Spring Boot DevTools** para facilitar o desenvolvimento
- **Spring Boot Starter Test** para testes

---

## 📢 Funcionalidades Implementadas

✅ **Solicitação de Agendamento**

- API para criar um agendamento de notificação
- Persistência da solicitação no banco de dados

✅ **Consulta de Agendamento**

- API para verificar o status de uma notificação agendada

✅ **Cancelamento de Agendamento**

- API para cancelar uma notificação antes do envio

✅ **Envio Automático de Notificações**

- Rotina de checagem via **Spring Scheduler**
- Mock de envio de notificação com logging
- Atualização automática do status no banco de dados

---

## 🚀 Como Rodar o Projeto

### 📥 Pré-requisitos

Antes de começar, você precisará ter instalado em sua máquina:

- **Docker** e **Docker Compose**
- **Java 21**
- **Maven**

### 📌 Passos para executar

1️⃣ **Clone o repositório:**

```bash
git clone https://github.com/Guh-paixao/magalu-test-notification.git
cd magalu-test-notification
```

2️⃣ **Suba o banco MySQL com Docker:**

```bash
docker-compose up -d
```

3️⃣ **Configure o ambiente e rode o serviço:**

```bash
./mvnw spring-boot:run
```

4️⃣ **Testar as APIs no Postman ou via cURL:**

```bash
# Criar um novo agendamento de notificação
curl -X POST http://localhost:8080/api/notifications -H "Content-Type: application/json" -d '{"channel": "EMAIL", "message": "Olá!", "scheduleTime": "2025-03-26T12:00:00"}'

# Consultar um agendamento pelo ID
curl -X GET http://localhost:8080/api/notifications/{id}

# Cancelar um agendamento pelo ID
curl -X DELETE http://localhost:8080/api/notifications/{id}
```

---

## 📜 Estrutura do Projeto

```bash
📂 magalums
 ┣ 📂 .mvn             # Configurações do Maven
 ┣ 📂 docker           # Configuração do banco de dados no Docker
 ┣ 📂 src
 ┃ ┣ 📂 main
 ┃ ┃ ┣ 📂 java/br/com/gustavo/magalums
 ┃ ┃ ┃ ┣ 📂 config      # Configurações gerais do projeto
 ┃ ┃ ┃ ┣ 📂 controller  # Controllers das APIs
 ┃ ┃ ┃ ┣ 📂 entity      # Classes das entidades (Notification, Channel, Status)
 ┃ ┃ ┃ ┣ 📂 repository  # Interface de comunicação com o banco de dados
 ┃ ┃ ┃ ┣ 📂 Scheduler   # Tarefas agendadas com Spring Scheduler
 ┃ ┃ ┃ ┣ 📂 service     # Regras de negócio
 ┃ ┃ ┃ ┗ 📜 MagalumsApplication.java  # Classe principal do Spring Boot
 ┃ ┣ 📂 test  # Testes unitários
 ┣ 📂 target   # Saída da compilação
 ┣ 📜 pom.xml  # Configuração do Maven
 ┣ 📜 .gitignore
 ┣ 📜 README.md
```

---

## ✅ Próximos Passos

🔹 Implementação de autenticação JWT para segurança das APIs.  
🔹 Melhorar o mecanismo de retries para falhas no envio de notificações.  
🔹 Implementação de uma interface gráfica para gerenciar os agendamentos.

---

## 📄 Licença

Este projeto está sob a licença MIT.

