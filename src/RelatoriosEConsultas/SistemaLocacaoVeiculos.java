package RelatoriosEConsultas;

import CadastroDeVeiculos.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class SistemaLocacaoVeiculos {
    public void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();

        mostrarVeiculosDisponiveis(veiculos);
        mostrarVeiculosAlugados(veiculos);
        mostrarVeiculosDeLuxo(veiculos);
    }
}