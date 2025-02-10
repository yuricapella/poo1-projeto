package CadastroDeVeiculos.VeiculosComuns;

import CadastroDeVeiculos.TipoVeiculo;
import CadastroDeVeiculos.Veiculo;

public class Moto extends Veiculo {
    public Moto(String modelo, String placa, double valorDiaria, boolean disponivel, TipoVeiculo tipo) {
        super(modelo, placa, valorDiaria, disponivel, tipo);
    }
}
