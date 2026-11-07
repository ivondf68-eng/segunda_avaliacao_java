package model;

import java.util.List;

public class ClientePessoaJuridica extends Cliente{
    private String cnpj;

    public ClientePessoaJuridica() {
    }

    public ClientePessoaJuridica(String nomeCompleto, String email, String telefone, List<Pedido> pedido, EnderecoDeCobranca enderecoDeCobranca, EnderecoDeEntrega enderecoDeEntrega, String cnpj) {
        super(nomeCompleto, email, telefone, pedido, enderecoDeCobranca, enderecoDeEntrega);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "\nClientePessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", pedido=" + pedido +
                ", enderecoDeCobranca=" + enderecoDeCobranca +
                ", enderecoDeEntrega=" + enderecoDeEntrega +
                '}';
    }
}
