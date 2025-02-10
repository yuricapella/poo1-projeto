# ENUNCIADO  

## Sistema de Locação de Veículos  

### Descrição Geral  

O objetivo deste projeto é desenvolver um sistema para uma locadora de veículos, aplicando os conceitos de **Programação Orientada a Objetos (POO)** em **Java**.  

O sistema permitirá:  
- Cadastro de veículos, clientes e locações  
- Gerenciamento de serviços adicionais para veículos de luxo  
- Aplicação de conceitos como **encapsulamento, herança, polimorfismo e interfaces**  
- Divisão de responsabilidades do projeto em equipe  

---

## Requisitos Funcionais  

### Cadastro de Veículos  
- Os veículos podem ser dos seguintes tipos:  
  - **CarroComun**  
  - **CarroPremium**  
  - **SUV**  
  - **Moto**  
  - **Caminhão**  
- Apenas **CarroPremium** e **SUV** podem oferecer serviços de luxo.  
- Cada veículo possui:  
  - **Modelo**  
  - **Placa**  
  - **Valor da diária**  
  - **Disponibilidade**  

### Cadastro de Clientes  
- Dois tipos de clientes:  
  - **Pessoa Física** (CPF)  
  - **Pessoa Jurídica** (CNPJ)  
- Informações comuns para ambos:  
  - **Nome**  
  - **Documento** (CPF/CNPJ)  
  - **Endereço**  
  - **Telefone**  

### Locação de Veículos  
- Um cliente pode alugar um veículo por um período específico.  
- O sistema deve calcular o **valor total da locação** com base nos dias alugados e na tarifa diária do veículo.  
- O sistema deve verificar se o veículo está **disponível** antes de confirmar a locação.  

### Serviços de Luxo  
- Apenas veículos premium (**CarroPremium** e **SUV**) podem oferecer serviços adicionais.  
- Implementação do método **oferecerServicoPremium()** para esses veículos.  

### Relatórios e Consultas  
- **Listagem de veículos disponíveis**  
- **Listagem de veículos alugados**  
- **Listagem de veículos de luxo**  

---

## Participantes  

**GRUPO 5**  
- Carlos Alberto  
- Guilherme Bonfim  
- Jeverson Santos  
- Well Christina  
- Yuri Capella  
