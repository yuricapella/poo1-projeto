package CadastroDeClientes;

public class ClientePessoaJuridica extends Cliente{

    public ClientePessoaJuridica(String razaoSocial, String cnpj, String endereco, String telefone) {
        super(razaoSocial, cnpj, endereco, telefone);
    }

    @Override
    public String toString() {
        return "Cliente Pessoa Jurídica {" +
                "Razão Social='" + getNome() + "', " +
                "CNPJ='" + getDocumento() + "', " +
                "Endereço='" + getEndereco() + "', " +
                "Telefone='" + getTelefone() + "'}";
    }
}
