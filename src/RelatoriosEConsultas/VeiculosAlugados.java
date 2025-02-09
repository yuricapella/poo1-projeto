package RelatoriosEConsultas;
import java.util.ArrayList;
import java.util.List;
import CadastroDeVeiculos.Veiculo;

public class VeiculosAlugados {

    public static void mostrarVeiculosAlugados(List<Veiculo> veiculos){
        System.out.println("Veículos Alugados");
        System.out.println("------------------------");
        for (Veiculo veiculo: veiculos) {
            if (veiculo.isDisponivel() == false) {
                System.out.println(veiculo);
            }
        }
        System.out.println("------------------------");
    }
}