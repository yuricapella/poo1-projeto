package RelatoriosEConsultas;
import java.util.ArrayList;
import java.util.List;
import CadastroDeVeiculos.Veiculo;

public class VeiculosDisponiveis {
    public void mostrarVeiculosDisponiveis(List<Veiculo> veiculos){
        System.out.println("Veículos Disponíveis");
        System.out.println("------------------------");
        for (Veiculo veiculo: veiculos) {
            if (veiculo.isDisponivel() ==  true) {
                System.out.println(veiculo);
            }
        }
        System.out.println("------------------------");
    }
}
