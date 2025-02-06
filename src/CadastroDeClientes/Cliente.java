package CadastroDeClientes;

public class Cliente {
    private String nome;
    private String documento; //Dois tipos de clientes: Pessoa Física (CPF) ou Pessoa Jurídica (CNPJ)
    private String endereco;
    private String telefone;

    public Cliente(String nome, TipoCliente tipo, String endereco, String telefone) {
        this.nome = nome;
        this.documento = tipo.getIdentificador();
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

    @Override
    public String toString() {
        return String.format(
                """
                Cliente:
                    %s
                    Documento: %s
                    Endereço: %s
                    Telefone: %s
                """,
                nome, documento, endereco, telefone
        ).indent(4);
    }
}
