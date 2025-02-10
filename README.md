# Explicação do Projeto, Métodos e Lógica

## Visão Geral
Este projeto é um sistema de locação de veículos que permite ao usuário ver uma lista de veículos (divididos em COMUM e LUXO), selecionar um veículo disponível e alugá-lo. Além disso, o sistema gerencia os clientes e exibe tudo de forma organizada num menu interativo.

## Componentes do Projeto

### 1. CadastroDeClientes
- **Cliente.java:**  
  Guarda as informações de cada cliente: nome, documento, endereço, telefone e um ID único.  
  - **Métodos importantes:**  
    - *Getters:* Para acessar os dados do cliente (por exemplo, `getNome()`, `getIdCliente()`).
    - *toString():* Exibe os dados do cliente de forma organizada.

### 2. CadastroDeVeiculos
- **SistemaVeiculos.java:**  
  Essa classe tem vários métodos:
  - **gerarVeiculos:** Cria uma lista com veículos (caminhões, motos, carros comuns, carros premium e SUVs) com nomes e placas numeradas.
  - **verificaVeiculosPorTipo:** Filtra os veículos por tipo (COMUM ou LUXO) usando o enum.
  - **verificaDisponibilidadeVeiculos:** Retorna apenas os veículos que estão disponíveis para locação.
  - **mostrarVeiculos:** Exibe os veículos no terminal de maneira organizada.
- **TipoVeiculo.java (enum):**  
  Define dois tipos de veículos: `COMUM` e `LUXO`.

### 3. LocacaoDeVeiculos
- **Locacao.java:**  
  Representa uma locação, armazenando o cliente, o veículo alugado, o período de locação e o valor total da locação.
- **LocacaoVeiculo.java:**  
  Gerencia a locação dos veículos. Verifica se o veículo está disponível, aluga-o (tornando-o indisponível) e registra a locação.

### 4. RelatoriosEConsultas
- **App.java:**  
  É o ponto de entrada do programa. Contém o método `main()` que mostra um menu interativo onde o usuário pode:
  - Ver veículos comuns
  - Ver veículos alugados
  - Ver veículos de luxo
  - Listar os clientes
  - Encerrar o programa
  O menu usa um `while` com um `switch` para executar a ação escolhida.
- **MenuLocacao.java:**  
  Apresenta um sub-menu para locação. Exibe os veículos disponíveis, permite ao usuário digitar a placa do veículo que deseja alugar e chama a lógica de locação.

### 5. ServicoDeLuxo.java

- Responsabilidade: Controlar os serviços de luxo dos veículos de luxo, com métodos para ativar ou desativar o serviço, conforme os requisitos do sistema.

## Lógica do Sistema
1. **Geração e Exibição dos Veículos:**  
   O método `gerarVeiculos` cria uma lista com veículos de vários tipos, que depois são filtrados por disponibilidade ou tipo (COMUM/LUXO) e exibidos no terminal.
2. **Interação com o Usuário:**  
   O `App.java` apresenta um menu com várias opções. O usuário escolhe uma opção e o programa executa a função correspondente (por exemplo, mostrar veículos ou alugar um veículo).
3. **Locação de Veículos:**  
   Ao escolher alugar um veículo, o `MenuLocacao.java` exibe os veículos disponíveis. O usuário informa a placa do veículo desejado e, se ele estiver disponível, a locação é registrada, e o veículo se torna indisponível.
4. **Seleção de Clientes:**  
   Os clientes são gerados e listados para que o usuário possa identificar quem está alugando o veículo.


