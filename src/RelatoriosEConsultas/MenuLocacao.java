package RelatoriosEConsultas;

import CadastroDeClientes.Cliente;
import CadastroDeVeiculos.SistemaVeiculos;
import CadastroDeVeiculos.TipoVeiculo;
import CadastroDeVeiculos.Veiculo;
import LocacaoDeVeiculos.LocacaoVeiculo;

import java.util.List;
import java.util.Scanner;

import static CadastroDeVeiculos.SistemaVeiculos.verificaDisponibilidadeVeiculos;

public class MenuLocacao {

    public static void exibirMenuDeLocacao(List<Veiculo> veiculos,List<Cliente> clientes, TipoVeiculo tipo, Scanner entrada){
        System.out.println("Veiculos " + tipo);

        LocacaoVeiculo locacao = new LocacaoVeiculo();
        List<Veiculo> veiculosDisponiveis = verificaDisponibilidadeVeiculos(veiculos);
        SistemaVeiculos.mostrarVeiculos(veiculosDisponiveis);

        boolean primeiraOpcaoMenu = true;
        while (primeiraOpcaoMenu) {
            System.out.println("Se desejar alugar um veículo, digite a placa: ");
            System.out.println("1. Verificar a lista de veiculos novamente.");
            System.out.println("2. Voltar");
            String segundaEscolha = entrada.nextLine().toUpperCase();


            if (segundaEscolha.equals("1")){
                veiculosDisponiveis = verificaDisponibilidadeVeiculos(veiculos);
                SistemaVeiculos.mostrarVeiculos(veiculosDisponiveis);
            }

            if (segundaEscolha.equals("2")) {
                primeiraOpcaoMenu = false;
            }

            Veiculo veiculoSelecionado = null;
            for (Veiculo veiculo : veiculosDisponiveis) {
                if (segundaEscolha.equals(veiculo.getPlaca())) {
                    veiculoSelecionado = veiculo;
                    break;
                }
            }

            if (veiculoSelecionado != null) {
                locacao.fazerLocacao(clientes.getFirst(), veiculoSelecionado, 30);
            }
        }
    }
}
