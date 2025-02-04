package CadastroDeClientes;

public class Cliente {
    private String nome;
    private String documento; //Dois tipos de clientes: Pessoa Física (CPF) ou Pessoa Jurídica (CNPJ)
    private String endereco;
    private String telefone;

    public Cliente(String nome, String documento, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
