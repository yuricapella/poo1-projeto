package CadastroDeVeiculos;

import CadastroDeVeiculos.VeiculosComuns.Caminhao;
import CadastroDeVeiculos.VeiculosComuns.CarroComun;
import CadastroDeVeiculos.VeiculosComuns.Moto;
import CadastroDeVeiculos.VeiculosDeLuxo.CarroPremium;
import CadastroDeVeiculos.VeiculosDeLuxo.Suv;

import java.util.ArrayList;
import java.util.List;

public class SistemaVeiculos {


    public static List<Veiculo> gerarVeiculos(int quantidadeCaminhao, int quantidadeMoto, int quantidadeCarroComum, int quantidadeCarroPremium, int quantidadeSuv) {
        List<Veiculo> veiculosGerados = new ArrayList<>();

        for (int i = 0; i < quantidadeCaminhao; i++) {
            Veiculo caminhao = new Caminhao("Caminhao " + (i + 1), "CAM" + (i + 1), 600, true, TipoVeiculo.COMUM);
            veiculosGerados.add(caminhao);
        }

        for (int i = 0; i < quantidadeMoto; i++) {
            Veiculo moto = new Moto("Moto " + (i + 1), "MOT" + (i + 1), 230, true, TipoVeiculo.COMUM);
            veiculosGerados.add(moto);
        }

        for (int i = 0; i < quantidadeCarroComum; i++) {
            Veiculo carroComum = new CarroComun("Carro comum " + (i + 1), "CAR" + (i + 1), 320, true, TipoVeiculo.COMUM);
            veiculosGerados.add(carroComum);
        }

        for (int i = 0; i < quantidadeCarroPremium; i++) {
            VeiculoDeLuxo carroPremium = new CarroPremium("Carro Premium " + (i + 1), "PREM" + (i + 1), 780, true, TipoVeiculo.LUXO);
            veiculosGerados.add(carroPremium);
        }

        for (int i = 0; i < quantidadeSuv; i++) {
            VeiculoDeLuxo suv = new Suv("SUV " + (i + 1), "SUV" + (i + 1), 1030, true, TipoVeiculo.LUXO);
            veiculosGerados.add(suv);
        }


        return veiculosGerados;
    }
    
    public static List<Veiculo> verificaVeiculosPorTipo(List<Veiculo> veiculos, TipoVeiculo tipo) {
        List<Veiculo> veiculosPorTipo = new ArrayList<>();

        for (Veiculo veiculo : veiculos) {
            if (tipo == veiculo.getTipo()) {
                veiculosPorTipo.add(veiculo);
            }
        }
        return veiculosPorTipo;
    }

    public static List<Veiculo> verificaDisponibilidadeVeiculos(List<Veiculo> veiculos) {
        List<Veiculo> veiculosPorTipo = new ArrayList<>();

        for (Veiculo veiculo : veiculos) {
            if (veiculo.isDisponivel()) {
                veiculosPorTipo.add(veiculo);
            }
        }
        return veiculosPorTipo;
    }


    public static void mostrarVeiculos(List<Veiculo> veiculos){
        System.out.println("------------------------");
        for(Veiculo veiculo : veiculos){
            System.out.println(veiculo);
        }
        System.out.println("------------------------");
    }

}
