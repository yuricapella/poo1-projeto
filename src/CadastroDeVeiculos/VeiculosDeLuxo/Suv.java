package CadastroDeVeiculos.VeiculosDeLuxo;

import CadastroDeVeiculos.TipoVeiculo;
import CadastroDeVeiculos.VeiculoDeLuxo;

public class Suv extends VeiculoDeLuxo {
    public Suv(String modelo, String placa, double valorDiaria, boolean disponivel, TipoVeiculo tipo) {
        super(modelo, placa, valorDiaria, disponivel, tipo);
    }

    @Override
    public void oferecerServicoDeLuxo() {
        System.out.println("Serviço de Luxo");
    }
}
