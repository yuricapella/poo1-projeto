package CadastroDeVeiculos;

public class Suv extends VeiculoDeLuxo {

    public Suv(String modelo, String placa, double valorDiaria, boolean disponivel) {
        super(modelo, placa, valorDiaria, disponivel);
    }

    @Override
    public String toString() {
        return "SUV{" +
                "modelo='" + getModelo() + '\'' +
                ", placa='" + getPlaca() + '\'' +
                ", valorDiaria=" + getValorDiaria() +
                ", disponivel=" + isDisponivel() +
                '}';
    }
}
