package LocacaoDeVeiculos;

import CadastroDeClientes.Cliente;
import CadastroDeVeiculos.Veiculo;

public class Locacao {
    private Cliente cliente;
    private Veiculo veiculo;
    private int diasDeLocacao;
    private double precoTotalLocacao;
    private static long contadorLocacao = 1;
    private long idLocacao;

    public Locacao(Cliente cliente, Veiculo veiculo, int diasDeLocacao) {
        this.idLocacao = contadorLocacao++;
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

    public long getIdLocacao() {
        return idLocacao;
    }

    @Override
    public String toString() {
        return String.format(
                """
                ----------------------------------
                    Locação %d
                    
                Informações do Cliente: %s
                Informações do Veiculo: %s
                    Periodo de locação: %s
                    Valor da Locação: %s
                """,
                getIdLocacao(),cliente, veiculo, diasDeLocacao, precoTotalLocacao
        ).indent(1);
    }
}
