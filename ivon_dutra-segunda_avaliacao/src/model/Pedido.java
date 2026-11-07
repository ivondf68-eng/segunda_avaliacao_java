package model;

import exception.FaltaEnderecoDeEntregaException;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
    private String numero;
    private LocalDateTime data;
    private BigDecimal total;
    private Estado estado;
    private Cliente cliente;
    private List<Item> item;

    public Pedido() {
    }

    public Pedido(String numero, LocalDateTime data, BigDecimal total, Estado estado, Cliente cliente, List<Item> item) {
        this.numero = numero;
        this.data = data;
        this.total = total;
        this.estado = estado;
        this.cliente = cliente;
        this.item = item;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "\nPedido{" +
                "numero='" + numero + '\'' +
                ", data=" + data +
                ", total=" + total +
                ", estado=" + estado +
                ", cliente=" + cliente +
                ", item=" + item +
                '}';
    }
}
