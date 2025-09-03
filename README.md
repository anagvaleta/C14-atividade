# 🧮 Calculadora - Projeto Maven com Testes Unitários

![Java](https://img.shields.io/badge/Java-17-blue?logo=java)
![Maven](https://img.shields.io/badge/Maven-3.8.8-red?logo=apache-maven)
![JUnit 5](https://img.shields.io/badge/JUnit-5.10.2-green?logo=junit5)
![Status](https://img.shields.io/badge/Status-Em%20Andamento-yellow)

---

## ✨ Descrição
Este é um **projeto simples de calculadora** desenvolvido em **Java** usando **Maven** como gerenciador de dependências.  
O foco principal é demonstrar **testes unitários completos** com **JUnit 5**

A calculadora realiza:

- ➕ Soma  
- ➖ Subtração  
- ✖️ Multiplicação  
- ➗ Divisão (com tratamento para divisão por zero)

---

## 🗂 Estrutura do Projeto

meu-projeto/
├─ pom.xml
└─ src/
├─ main/
│ └─ java/org/example/
│ ├─ Calculator.java
│ └─ Main.java
└─ test/
└─ java/org/example/
└─ CalculatorTest.java

---

## 🚀 Como Executar

### 🔹 Rodar a aplicação principal

```bash
mvn compile exec:java -Dexec.mainClass="org.example.Main"
