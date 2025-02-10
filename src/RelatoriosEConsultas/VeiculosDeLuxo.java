package RelatoriosEConsultas;
import java.util.ArrayList;
import java.util.List;
import CadastroDeVeiculos.Veiculo;
import CadastroDeVeiculos.CarroPremium;
import CadastroDeVeiculos.Suv;

public class VeiculosDeLuxo {

    public void mostrarVeiculosDeLuxo(List<Veiculo> veiculos){
        System.out.println("Veículos de Luxo");
        System.out.println("------------------------");
        for (Veiculo veiculo: veiculos) {
            if (CadastroDeVeiculos.Suv.converterParaString(veiculo).contains("CarroPremium") || CadastroDeVeiculos.CarroPremium.converterParaString(veiculo).contains("SUV")) {
                System.out.println(veiculo);
            }
        }
        System.out.println("------------------------");
    }
}