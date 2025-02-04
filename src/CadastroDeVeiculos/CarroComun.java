package CadastroDeVeiculos;

public class CarroComun extends Veiculo{

    public CarroComun(String modelo, String placa, double valorDiaria, boolean disponivel) {
        super(modelo, placa, valorDiaria, disponivel);
    }

    @Override
    public String toString() {
        return "CarroComun{" +
                "modelo='" + getModelo() + '\'' +
                ", placa='" + getPlaca() + '\'' +
                ", valorDiaria=" + getValorDiaria() +
                ", disponivel=" + isDisponivel() +
                '}';
    }
}
