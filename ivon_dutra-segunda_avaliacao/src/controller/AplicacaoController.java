package controller;

import exception.FaltaEnderecoDeEntregaException;
import model.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AplicacaoController {
    public static void main(String[] args) {
        EnderecoDeEntrega ee1 = new EnderecoDeEntrega("Rua", "Osvaldo Aranha", "79", "Getúlio Vargas", "9640000", Cidade.PORTO_ALEGRE, UF.RS);
        EnderecoDeCobranca ec1 = new EnderecoDeCobranca("Avenida", "Duque de Caxias", "45", "Fragata", "9805000", Cidade.PELOTAS, UF.RS);

        ClientePessoaFisica cpf1 = new ClientePessoaFisica("Ivon de Farias Dutra", "ivondf68@gmail.com", "999999999", null, ec1, ee1, "45698758947");

        Produto arroz = new Produto("14544rt9", "Arroz", "Arroz Tordilho 5kg", 50, BigDecimal.valueOf(10.0), BigDecimal.valueOf(25.0), null);
        Produto feijao = new Produto("78894klj", "Feijão", "Feijão Tordilho 1kg", 70, BigDecimal.valueOf(5.0), BigDecimal.valueOf(15.0), null);

        Item item1 = new Item(80, arroz.getPrecoDeVenda().multiply(BigDecimal.valueOf(80)), Situacao.ATIVO, arroz);
        Item item2 = new Item(90, feijao.getPrecoDeVenda().multiply(BigDecimal.valueOf(90)), Situacao.ATIVO, feijao);

        List<Item> carrinho = new ArrayList<>();

        carrinho.add(item1);
        carrinho.add(item2);

        BigDecimal pedido = BigDecimal.ZERO;

        for (Item i: carrinho){
            pedido = pedido.add(i.getTotal());
        }

        if (cpf1.getEnderecoDeEntrega() == null){
            throw new FaltaEnderecoDeEntregaException("Falta cadastrar o endereço de entrega do cliente");
        }

        Pedido p1 = new Pedido("345", LocalDateTime.of(2024, 03, 15, 15, 15), pedido, Estado.ENTREGUE, cpf1, carrinho);

        Produto.baixarEstoqueComException(carrinho);

        System.out.println(p1);
    }
}
