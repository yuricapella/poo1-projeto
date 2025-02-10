package CadastroDeVeiculos;

import ServicosDeLuxo.ServicoLuxo;

public abstract class VeiculoDeLuxo extends Veiculo implements ServicoLuxo {

    public VeiculoDeLuxo(String modelo, String placa, double valorDiaria, boolean disponivel, TipoVeiculo tipo) {
        super(modelo, placa, valorDiaria, disponivel, tipo);
    }

    public void oferecerServicoDeLuxo(Boolean ativar) {
        if (ativar) {
            System.out.println("Serviço de luxo ativado." + getModelo());
        } else {
            System.out.println("Serviço de luxo desativado." + getModelo());
        }
    }
}
