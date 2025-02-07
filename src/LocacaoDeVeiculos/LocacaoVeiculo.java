package LocacaoDeVeiculos;

import CadastroDeClientes.Cliente;
import CadastroDeVeiculos.Veiculo;
import java.util.ArrayList;
import java.util.List;

public class LocacaoVeiculo {
    private List<Locacao> locacoes = new ArrayList<Locacao>();

    public void fazerLocacao(Cliente cliente, Veiculo veiculo, int diasDeLocacao) {
        if (veiculo.isDisponivel()) {
            veiculo.setDisponivel(false);
            Locacao locacao = new Locacao(cliente, veiculo, diasDeLocacao);
            locacoes.add(locacao);
            System.out.printf("Locação feita para %s\n\t no valor de R$ %.2f", cliente.getNome(), locacao.receberValorDaLocadcao());
        } else {
            System.out.println("Veículo Indisponível");
        }
    }
}
