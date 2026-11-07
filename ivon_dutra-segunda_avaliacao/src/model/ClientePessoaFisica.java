package model;

import java.util.List;

public class ClientePessoaFisica extends Cliente{
    private String cpf;

    public ClientePessoaFisica() {
    }

    public ClientePessoaFisica(String nomeCompleto, String email, String telefone, List<Pedido> pedido, EnderecoDeCobranca enderecoDeCobranca, EnderecoDeEntrega enderecoDeEntrega, String cpf) {
        super(nomeCompleto, email, telefone, pedido, enderecoDeCobranca, enderecoDeEntrega);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "\nClientePessoaFisica{" +
                "cpf='" + cpf + '\'' +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", pedido=" + pedido +
                ", enderecoDeCobranca=" + enderecoDeCobranca +
                ", enderecoDeEntrega=" + enderecoDeEntrega +
                '}';
    }
}
