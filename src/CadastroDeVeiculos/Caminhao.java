package CadastroDeVeiculos;

public class Caminhao extends Veiculo {

    public Caminhao(String modelo, String placa, double valorDiaria, boolean disponivel) {
        super(modelo, placa, valorDiaria, disponivel);
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "modelo='" + getModelo() + '\'' +
                ", placa='" + getPlaca() + '\'' +
                ", valorDiaria=" + getValorDiaria() +
                ", disponivel=" + isDisponivel() +
                '}';
    }

}
