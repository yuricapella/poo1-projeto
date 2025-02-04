package CadastroDeVeiculos;

public abstract class VeiculoDeLuxo extends Veiculo implements ServicosDeLuxo {

    public VeiculoDeLuxo(String modelo, String placa, double valorDiaria, boolean disponivel) {
        super(modelo, placa, valorDiaria, disponivel);
    }

    @Override
    public void oferecerServicoDeLuxo(Boolean ativar) {
        if (ativar) {
            System.out.println("Serviço de luxo ativado." + getModelo());
        } else {
            System.out.println("Serviço de luxo desativado." + getModelo());
        }
    }
}
