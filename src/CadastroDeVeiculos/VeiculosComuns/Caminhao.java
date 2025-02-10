package CadastroDeVeiculos.VeiculosComuns;

import CadastroDeVeiculos.TipoVeiculo;
import CadastroDeVeiculos.Veiculo;

public class Caminhao extends Veiculo {
    public Caminhao(String modelo, String placa, double valorDiaria, boolean disponivel, TipoVeiculo tipo) {
        super(modelo, placa, valorDiaria, disponivel, tipo);
    }
}
