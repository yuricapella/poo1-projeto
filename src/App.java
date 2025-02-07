import CadastroDeClientes.Cliente;
import CadastroDeClientes.TipoCliente;
import CadastroDeVeiculos.Veiculo;
import LocacaoDeVeiculos.LocacaoVeiculo;

public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Antonio", TipoCliente.PESSOA_FISICA,"rua ali, 234", "11-998654321");
        Veiculo veiculo = new Veiculo("gm","ABC234G78", 267.50, true);
        LocacaoVeiculo servico = new LocacaoVeiculo();

        servico.fazerLocacao(cliente, veiculo, 30);
    }
}
