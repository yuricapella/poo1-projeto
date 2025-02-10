# Sistema de Locação de Veículos

## Descrição  

Este projeto é um sistema para alugar carros. Ele mostra uma lista de veículos separados em dois tipos: **COMUM** e **LUXO**. O usuário pode escolher um carro disponível e alugá-lo.  

Se quiser ver os carros que já foram alugados, o sistema também mostra:  
- Qual carro foi alugado  
- Quem alugou  
- O preço da diária  
- Quantos dias foi alugado  
- O valor total do aluguel  

Tudo isso aparece de forma organizada em um menu fácil de usar.

## Enunciado do Projeto

Para detalhes completos sobre o enunciado do projeto, consulte o arquivo [ENUNCIADO.md](ENUNCIADO.md).

## Funcionalidades

- Exibição de veículos disponíveis, filtrados por tipo (COMUM ou LUXO) e disponibilidade.
- Realização de locações, que registram o veículo alugado, o cliente que efetuou a locação, o período e o valor total.
- Exibição dos veículos alugados juntamente com o cliente que os alugou.
- Menu interativo que permite ao usuário escolher entre visualizar veículos comuns, veículos de luxo, veículos alugados ou encerrar o programa.
- Controle dos serviços de luxo dos veículos de luxo, com métodos para ativar ou desativar esses serviços.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para o desenvolvimento do projeto.
- **Scanner**: Utilizado para capturar a entrada do usuário.
- **Enums**: Para definir os tipos de veículos (COMUM e LUXO) e os tipos de clientes (PESSOA_FISICA e PESSOA_JURIDICA).

## Como Rodar o Projeto

### Pré-requisitos

- **JDK 15 ou superior instalado**  
  *Nota*: Recomenda-se o uso de JDK 15 ou superior para evitar problemas.

### Passos

1. Clone o repositório:
    ```bash
    git clone https://github.com/yuricapella/poo1-projeto.git
    ```

2. Navegue até o diretório do projeto:
    ```bash
    cd poo1-projeto
    ```

3. Compile e execute o projeto:
    ```bash
    javac App.java
    java App
    ```

4. O programa exibirá um menu interativo, onde o usuário pode:
    - Visualizar veículos comuns
    - Visualizar veículos de luxo
    - Visualizar veículos alugados (com os clientes que efetuaram as locações)
    - Encerrar o programa

## Estrutura do Projeto

- **Cadastro de Clientes:**
  - **Cliente.java**: Armazena as informações dos clientes, como nome, documento, endereço, telefone e um ID único.
  - **SistemaClientes.java**: Gerencia a criação, filtragem por tipo e a exibição dos clientes.
  - **TipoCliente.java (enum):** Define os tipos de clientes, como PESSOA_FISICA (CPF) e PESSOA_JURIDICA (CNPJ).

- **Cadastro de Veículos:**
  - **SistemaVeiculos.java**: Gerencia a geração de veículos, filtragem por tipo e disponibilidade, e a exibição dos veículos.
  - **TipoVeiculo.java (enum):** Define os tipos de veículos: COMUM e LUXO.

- **Locação de Veículos:**
  - **Locacao.java**: Representa uma locação, contendo informações sobre o cliente, o veículo alugado, o período de locação e o valor total.
  - **LocacaoVeiculo.java**: Gerencia o processo de locação, verificando a disponibilidade do veículo e registrando a locação.

- **Relatórios e Consultas:**
  - **App.java**: Classe principal que contém o método `main()` e apresenta o menu interativo para o usuário.
  - **MenuLocacao.java**: Exibe um sub-menu para a locação de veículos, permitindo que o usuário digite a placa do veículo desejado e registre a locação.

- **Serviço de Luxo:**
  - **ServicoDeLuxo.java**: Controla os serviços de luxo dos veículos de luxo, oferecendo métodos para ativar ou desativar esses serviços conforme os requisitos do sistema.
