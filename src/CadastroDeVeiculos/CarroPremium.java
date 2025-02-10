package CadastroDeVeiculos;

public class CarroPremium extends VeiculoDeLuxo {

    public CarroPremium(String modelo, String placa, double valorDiaria, boolean disponivel) {
        super(modelo, placa, valorDiaria, disponivel);
    }


    public String converterParaString() {
        return "CarroPremium{" +
                "modelo='" + getModelo() + '\'' +
                ", placa='" + getPlaca() + '\'' +
                ", valorDiaria=" + getValorDiaria() +
                ", disponivel=" + isDisponivel() +
                '}';
    }
}
