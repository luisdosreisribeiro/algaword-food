package com.algaworks.algafood.domain.exception;

public class PedidoNaoEncontradoException extends NegocioException {


    public PedidoNaoEncontradoException(String codigoPedido) {
        super(String.format("Não existe um cadastro de pedido com código %s", codigoPedido));
    }
}
