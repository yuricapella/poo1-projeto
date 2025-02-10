package CadastroDeVeiculos.VeiculosComuns;

import CadastroDeVeiculos.TipoVeiculo;
import CadastroDeVeiculos.Veiculo;

public class CarroComun extends Veiculo {
    public CarroComun(String modelo, String placa, double valorDiaria, boolean disponivel, TipoVeiculo tipo) {
        super(modelo, placa, valorDiaria, disponivel, tipo);
    }
}
