package RelatoriosEConsultas;

import CadastroDeVeiculos.Veiculo;

import java.util.ArrayList;
import java.util.List;

import static RelatoriosEConsultas.VeiculosAlugados.mostrarVeiculosAlugados;
import static RelatoriosEConsultas.VeiculosDeLuxo.mostrarVeiculosDeLuxo;
import static RelatoriosEConsultas.VeiculosDisponiveis.mostrarVeiculosDisponiveis;


public class SistemaLocacaoVeiculos {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();

        mostrarVeiculosDisponiveis(veiculos);
        mostrarVeiculosAlugados(veiculos);
        mostrarVeiculosDeLuxo(veiculos);
    }
}