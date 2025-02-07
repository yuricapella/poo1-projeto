package LocacaoDeVeiculos;

import CadastroDeClientes.Cliente;
import CadastroDeVeiculos.Veiculo;

public class Locacao {
    private Cliente cliente;
    private Veiculo veiculo;
    private int diasDeLocacao;
    private double precoTotalLocacao;

    public Locacao(Cliente cliente, Veiculo veiculo, int diasDeLocacao) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.diasDeLocacao = diasDeLocacao;
        this.precoTotalLocacao = calcularTotalLocao();
    }

    private double calcularTotalLocao() {
        return diasDeLocacao * veiculo.getValorDiaria();
    }

    public void devolverVeiculo() {
        veiculo.setDisponivel(true);
    }

    public double receberValorDaLocadcao() {
        return precoTotalLocacao;
    }
}
