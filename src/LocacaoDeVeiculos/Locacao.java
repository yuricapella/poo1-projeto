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
        this.precoTotalLocacao = calcularTotalLocacao();
    }

    private double calcularTotalLocacao() {
        return diasDeLocacao * veiculo.getValorDiaria();
    }

    public void devolverVeiculo() {
        veiculo.setDisponivel(true);
    }

    public double receberValorDaLocacao() {
        return precoTotalLocacao;
    }
}
