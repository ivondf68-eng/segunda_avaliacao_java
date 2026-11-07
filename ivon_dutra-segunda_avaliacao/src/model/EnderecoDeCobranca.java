package model;

public class EnderecoDeCobranca extends Endereco{
    public EnderecoDeCobranca() {
    }

    public EnderecoDeCobranca(String tipoDeLogradouro, String logradouro, String numero, String bairro, String cep, Cidade cidade, UF uf) {
        super(tipoDeLogradouro, logradouro, numero, bairro, cep, cidade, uf);
    }

    @Override
    public String toString() {
        return "\nEnderecoDeCobranca{" +
                "tipoDeLogradouro='" + tipoDeLogradouro + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numero='" + numero + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cep='" + cep + '\'' +
                ", cidade=" + cidade +
                ", uf=" + uf +
                '}';
    }
}
