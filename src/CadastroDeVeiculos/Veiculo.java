package CadastroDeVeiculos;

public class Veiculo {
    private String modelo;
    private String placa;
    private double valorDiaria;
    private boolean disponivel;

    public Veiculo(String modelo, String placa, double valorDiaria, boolean disponivel) {
        this.modelo = modelo;
        this.placa = placa;
        this.valorDiaria = valorDiaria;
        this.disponivel = disponivel;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
