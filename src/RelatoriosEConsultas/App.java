package RelatoriosEConsultas;

import CadastroDeClientes.*;
import CadastroDeVeiculos.*;
import LocacaoDeVeiculos.LocacaoVeiculo;

import static RelatoriosEConsultas.MenuLocacao.exibirMenuDeLocacao;

import java.util.List;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<Veiculo> veiculos = SistemaVeiculos.gerarVeiculos(2,3,5,2,1);
        List<Veiculo> veiculosComuns = SistemaVeiculos.verificaVeiculosPorTipo(veiculos, TipoVeiculo.COMUM);
        List<Veiculo> veiculosLuxo = SistemaVeiculos.verificaVeiculosPorTipo(veiculos, TipoVeiculo.LUXO);

        List<Cliente> clientes = SistemaClientes.geradorDeClientes(2,2);

        boolean executando = true;
        System.out.println("Bem-vindo ao sistema de Locação De Veiculos");
        while(executando){
            System.out.println("Digite a opção desejada (1,2,3,4)");
            System.out.println("1. Veiculos Comuns");
            System.out.println("2. Veículos Alugados");
            System.out.println("3. Veículos de Luxo");
            System.out.println("4. Encerrar programa");

            String primeiraEscolha = entrada.nextLine();

            switch (primeiraEscolha){
                case "1"-> {
                    exibirMenuDeLocacao(veiculosComuns, clientes, TipoVeiculo.COMUM, entrada);
                }
                case "2"-> {
                    System.out.println("Veiculos alugados: ");
                    System.out.println(LocacaoVeiculo.getAlugados());
                    boolean primeiraOpcaoMenu = true;
                    while (primeiraOpcaoMenu) {
                        System.out.println("1. Voltar");
                        String segundaEscolha = entrada.nextLine();

                        if (segundaEscolha.equals("1")) {
                            primeiraOpcaoMenu = false;
                        }else {
                            System.out.println("Incorreto! Tente novamente..");
                        }
                    }
                }
                case "3"-> {
                    exibirMenuDeLocacao(veiculosLuxo, clientes, TipoVeiculo.LUXO, entrada);
                }
                case "4"->{
                    System.out.println("Encerrando o programa...");
                    executando = false;
                }
                default -> System.out.println("Digite o número correto!");

            }
        }
        entrada.close();
    }
}
