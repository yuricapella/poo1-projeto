package CadastroDeVeiculos;

public class Moto extends Veiculo {

    public Moto(String modelo, String placa, double valorDiaria, boolean disponivel) {
        super(modelo, placa, valorDiaria, disponivel);
    }

    @Override
    public String toString() {
        return "Moto{" +
                "modelo='" + getModelo() + '\'' +
                ", placa='" + getPlaca() + '\'' +
                ", valorDiaria=" + getValorDiaria() +
                ", disponivel=" + isDisponivel() +
                '}';
    }
}
