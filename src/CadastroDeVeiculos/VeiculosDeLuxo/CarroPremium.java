package CadastroDeVeiculos.VeiculosDeLuxo;

import CadastroDeVeiculos.TipoVeiculo;
import CadastroDeVeiculos.VeiculoDeLuxo;

public class CarroPremium extends VeiculoDeLuxo {
    public CarroPremium(String modelo, String placa, double valorDiaria, boolean disponivel, TipoVeiculo tipo) {
        super(modelo, placa, valorDiaria, disponivel, tipo);
    }

    @Override
    public void oferecerServicoDeLuxo() {
        System.out.println("Serviço de Luxo");
    }
}
