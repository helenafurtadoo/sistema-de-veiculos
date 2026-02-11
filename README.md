🚗 Sistema de Veículos (Java)

Projeto desenvolvido em Java com foco em Programação Orientada a Objetos (POO), simulando um sistema simples de gerenciamento de veículos.

📌 Objetivo

Aplicar os principais conceitos de POO, como:

✔️ Abstração

✔️ Encapsulamento

✔️ Herança

✔️ Polimorfismo

✔️ Organização em pacotes

O sistema modela diferentes tipos de veículos e suas características específicas.

🏗️ Estrutura do Projeto
sistema-de-veiculos-main/
│
├── src/
│   ├── module-info.java
│   └── sistemaVeiculos/
│       ├── Veiculo.java
│       ├── Carro.java
│       ├── Moto.java
│       ├── Caminhao.java
│       └── Principal.java

🚘 Classes do Sistema
🔹 Veiculo (Classe Base)

Classe principal que representa um veículo genérico.

Possui atributos como:

Marca

Modelo

Ano

Outros atributos comuns

Serve como base para as demais classes.

🔹 Carro

Herda de Veiculo e pode conter atributos específicos como:

Número de portas

Tipo de combustível

🔹 Moto

Herda de Veiculo e representa motocicletas.

🔹 Caminhao

Herda de Veiculo e pode incluir:

Capacidade de carga

Número de eixos

🔹 Principal

Classe responsável por executar o programa (main), onde os objetos são instanciados e os métodos são testados.

🧠 Conceitos Aplicados

Uso de extends para herança

Sobrescrita de métodos (polimorfismo)

Organização em pacotes

Estrutura modular (module-info.java)

Boas práticas de organização de código

🛠️ Tecnologias Utilizadas

Java

Programação Orientada a Objetos

Eclipse ide

📚 Finalidade Acadêmica

Este projeto foi desenvolvido com fins de aprendizado para reforçar os conceitos fundamentais de Java e POO.
