package LocacaoDeVeiculos;

import CadastroDeClientes.Cliente;
import CadastroDeVeiculos.Veiculo;
import java.util.ArrayList;
import java.util.List;

public class LocacaoVeiculo {
    private static List<Locacao> locacoes = new ArrayList<>();

    public void fazerLocacao(Cliente cliente, Veiculo veiculo, int diasDeLocacao) {
        if (veiculo.isDisponivel()) {
            veiculo.setDisponivel(false);
            Locacao locacao = new Locacao(cliente, veiculo, diasDeLocacao);
            locacoes.add(locacao);
            System.out.printf("Locação feita para %s\nNo valor de R$ %.2f\n\n", cliente.getNome(), locacao.receberValorDaLocacao());
        } else {
            System.out.println("Veículo Indisponível");
        }
    }

    public static List<Locacao> getAlugados() {
        return locacoes;
    }

}
