# Atividade Prática: Consumo de API com Spring Boot

Este projeto foi desenvolvido como parte de uma atividade prática para aprendizado em **consumo de APIs externas utilizando Spring Boot**. O objetivo principal é compreender como realizar requisições HTTP, processar as respostas e integrar esses dados em uma aplicação Java.

---

## 📌 Objetivos do Projeto
- Consumir dados de uma API externa.
- Utilizar **HttpClient** e recursos do **Spring Boot** para integração.
- Converter dados recebidos em **JSON** para objetos Java utilizando **Jackson**.
- Organizar o código em camadas de **controller**, **service** e **client** para boas práticas de arquitetura.

---

## 🚀 Tecnologias Utilizadas
- **Java 17**
- **Spring Boot** (REST, Web)
- **HttpClient** (para requisições HTTP)
- **Jackson** (para serialização/deserialização de JSON)
- **Maven** (gerenciador de dependências)
- **IDE** (IntelliJ IDEA / Eclipse / VS Code)

---

## 📂 Estrutura do Projeto

```
Atividade_Pratica_Consumo_de_API_com_Spring/
├── src/
│   ├── main/
│   │   ├── java/br/edu/fatecpg/minhaapi/
│   │   │   ├── controller/       # Controladores REST
│   │   │   ├── service/          # Lógica de negócio
│   │   │   ├── client/           # Consumo da API externa
│   │   │   └── model/            # Classes de modelo (DTOs)
│   │   └── resources/
│   │       └── application.properties  # Configurações
│   └── test/                     # Testes automatizados
└── pom.xml                       # Dependências e build
```

---

## 🔧 Como Executar o Projeto

1. **Clonar o repositório:**
   ```bash
   git clone https://github.com/thialms/Atividade_Pratica_Consumo_de_API_com_Spring.git
   ```

2. **Acessar a pasta do projeto:**
   ```bash
   cd Atividade_Pratica_Consumo_de_API_com_Spring
   ```

3. **Compilar e rodar o projeto:**
   ```bash
   mvn spring-boot:run
   ```
---

## 📖 Funcionalidades Implementadas
- Consumo de API externa via **HttpClient**.
- Conversão automática de JSON em objetos Java.
- Exposição de dados via **endpoints REST**.
- Organização em camadas para fácil manutenção.

---

## 👨‍💻 Autor
Projeto desenvolvido por **Thiago Almeida** como parte das atividades práticas da disciplina de **Técnicas de Programação 2** na FATEC Praia Grande.

---

## 📜 Licença
Este projeto é apenas para fins educacionais e não possui licença específica.
