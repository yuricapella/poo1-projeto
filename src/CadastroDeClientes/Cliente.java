package CadastroDeClientes;

public abstract class Cliente {
    private String nome;
    private String documento; //Dois tipos de clientes: Pessoa Física (CPF) ou Pessoa Jurídica (CNPJ)
    private String endereco;
    private String telefone;

    public Cliente(String nome, String documento, String endereco, String telefone) {
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
        this.telefone = telefone;
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

}
