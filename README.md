# Sistema de Avaliação - Controle de Pedidos e Estoque

Este é um sistema desenvolvido em **Java** voltado para o gerenciamento de fluxos de vendas, controle de estoque, gerenciamento de clientes (Pessoa Física e Pessoa Jurídica), fornecedores e logística de entrega/cobrança. O projeto foi estruturado seguindo o padrão arquitetural MVC (Model-View-Controller) simplificado.

## Funcionalidades Principais

- **Gerenciamento de Clientes:** Suporte a regras de negócio distintas para Clientes Pessoa Física (CPF) e Pessoa Jurídica (CNPJ).
- **Logística e Localização:** Controle granular de endereços segmentados por Endereço de Entrega e Endereço de Cobrança, associados a Cidades, Estados e Unidades Federativas (UF).
- **Movimentação de Estoque:** Controle de fornecimento de itens e validação automatizada de quantidade disponível.
- **Processamento de Pedidos:** Fluxo completo de pedidos contendo múltiplos itens e controle de situações/status do pedido.
- **Tratamento de Exceções Customizadas:** Arquitetura robusta para impedir a conclusão de vendas sem endereço de entrega ou com estoque insuficiente.

## Estrutura do Projeto

O código-fonte está organizado dentro do pacote principal da seguinte forma:

```text
src/
├── controller/
│   ├── AplicacaoController.java  # Coordena o fluxo principal do sistema
│   └── DataController.java       # Responsável pela simulação/manipulação de dados
├── exception/
│   ├── EstoqueInsuficiente.java  # Disparada quando o produto não tem saldo em estoque
│   └── FaltaEnderecoDeEntregaException.java # Disparada se o pedido não contiver local de entrega
└── model/
    ├── Cidade.java
    ├── Cliente.java
    ├── ClientePessoaFisica.java
    ├── ClientePessoaJuridica.java
    ├── Endereço.java
    ├── EnderecoDeCobranca.java
    ├── EnderecoDeEntrega.java
    ├── Estado.java
    ├── Fornecedor.java
    ├── Fornecimento.java
    ├── Item.java
    ├── Pedido.java
    ├── Produto.java
    ├── Situacao.java             # Enum ou Classe de status do pedido
    └── UF.java                   # Enumerador de Unidades Federativas
```

## Tecnologias Utilizadas

- **Linguagem:** Java (versão 11)
- **IDE Utilizada:** IntelliJ IDEA

*Projeto desenvolvido como parte da segunda avaliação da disciplina correspondente.*
