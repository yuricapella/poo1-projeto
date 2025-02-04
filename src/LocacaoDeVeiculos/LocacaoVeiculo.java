package LocacaoDeVeiculos;

public class LocacaoVeiculo {
    public int periodoLocacao;

    double calcularValorTotal(double valorLocacao, double periodo) {

        return periodo * valorLocacao;
    }

    boolean verificaVeiculoDisponivel(){

    return false;
    }


}
