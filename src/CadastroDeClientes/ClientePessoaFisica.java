package CadastroDeClientes;

public class ClientePessoaFisica extends Cliente{

    public ClientePessoaFisica(String nome, String cpf, String endereco, String telefone) {
        super(nome, cpf, endereco, telefone);
    }

    @Override
    public String toString() {
        return "Cliente Pessoa Física {" +
                "Nome='" + getNome() + "', " +
                "CPF='" + getDocumento() + "', " +
                "Endereço='" + getEndereco() + "', " +
                "Telefone='" + getTelefone() + "'}";
    }
}
