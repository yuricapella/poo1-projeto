package CadastroDeClientes;

public class Cliente {
    private String nome;
    private String documento; //Dois tipos de clientes: Pessoa Física (CPF) ou Pessoa Jurídica (CNPJ)
    private String endereco;
    private String telefone;
    private static long contadorCliente = 1;
    private final long idCliente;

    public Cliente(String nome, TipoCliente tipo, String endereco, String telefone) {
        this.idCliente = contadorCliente++;
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

    public long getIdCliente() {
        return this.idCliente;
    }

    @Override
    public String toString() {
        return String.format(
                """
                    %s
                    Documento: %s
                    Endereço: %s
                    Telefone: %s
                    Id Cliente: %d
                """,
                nome, documento, endereco, telefone, idCliente
        ).indent(4);
    }
}
