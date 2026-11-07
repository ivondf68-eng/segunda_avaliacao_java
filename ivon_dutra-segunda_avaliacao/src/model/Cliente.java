package model;

import exception.FaltaEnderecoDeEntregaException;

import java.util.List;

public abstract class Cliente {
    protected String nomeCompleto;
    protected String email;
    protected String telefone;
    protected List<Pedido> pedido;
    protected EnderecoDeCobranca enderecoDeCobranca;
    protected EnderecoDeEntrega enderecoDeEntrega;

    public Cliente() {
    }

    public Cliente(String nomeCompleto, String email, String telefone, List<Pedido> pedido, EnderecoDeCobranca enderecoDeCobranca, EnderecoDeEntrega enderecoDeEntrega) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.telefone = telefone;
        this.pedido = pedido;
        this.enderecoDeCobranca = enderecoDeCobranca;
        this.enderecoDeEntrega = enderecoDeEntrega;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Pedido> getPedido() {
        return pedido;
    }

    public void setPedido(List<Pedido> pedido) {
        this.pedido = pedido;
    }

    public EnderecoDeCobranca getEnderecoDeCobranca() {
        return enderecoDeCobranca;
    }

    public void setEnderecoDeCobranca(EnderecoDeCobranca enderecoDeCobranca) {
        this.enderecoDeCobranca = enderecoDeCobranca;
    }

    public EnderecoDeEntrega getEnderecoDeEntrega() {
        return enderecoDeEntrega;
    }

    public void setEnderecoDeEntrega(EnderecoDeEntrega enderecoDeEntrega) {
        this.enderecoDeEntrega = enderecoDeEntrega;
    }
}
