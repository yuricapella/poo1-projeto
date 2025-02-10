package CadastroDeVeiculos;

public abstract class Veiculo {
    private String modelo;
    private String placa;
    private double valorDiaria;
    private boolean disponivel;
    private TipoVeiculo tipo;

    public Veiculo(String modelo, String placa, double valorDiaria, boolean disponivel, TipoVeiculo tipo) {
        this.modelo = modelo;
        this.placa = placa;
        this.valorDiaria = valorDiaria;
        this.disponivel = disponivel;
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public String getPlaca() {
        return placa;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public TipoVeiculo getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return String.format(
                """
                    %s
                    Placa: %s
                    Valor da diária: %s
                    Disponibilidade: %s
                """,
                getModelo(), getPlaca(), getValorDiaria(), isDisponivel()
        ).indent(4);
    }
}
