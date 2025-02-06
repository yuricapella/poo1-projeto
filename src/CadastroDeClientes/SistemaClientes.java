package CadastroDeClientes;

import java.util.ArrayList;
import java.util.List;

public class SistemaClientes {

    public static List<Cliente> geradorDeClientes(int quantidadePessoaFisica, int quantidadePessoaJuridica){
        List<Cliente> clientes = new ArrayList<>();

        for (int i = 0; i < quantidadePessoaFisica; i++) {
            int contador = i + 1;
            Cliente cliente = new Cliente("Nome " + contador, TipoCliente.PESSOA_FISICA, "Rua tal " + contador, "00 90000-0000");
            clientes.add(cliente);

        }

        for (int i = 0; i < quantidadePessoaJuridica; i++) {
            int contador = i + 1;
            Cliente cliente = new Cliente("Empresa " + contador,TipoCliente.PESSOA_JURIDICA,"Rua tal " + contador,"00 90000-0000");
            clientes.add(cliente);
        }
        return clientes;
    }

    public static List<Cliente> separarClientesPorTipo(List<Cliente> clientes, TipoCliente tipo){
        List<Cliente> clientesPorTipo = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if(tipo.getIdentificador().equals(cliente.getDocumento())){
                clientesPorTipo.add(cliente);
            }
        }
        return clientesPorTipo;
    }

    public static void mostrarClientes(List<Cliente> clientes){
        System.out.println("------------------------");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
        System.out.println("------------------------");
    }
}
