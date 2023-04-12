# concessionariaWoliver
 Meu primeiro projeto Pessoal em Java

Este programa é um sistema básico de gerenciamento de carros em uma concessionária, criado em Java. Foram criadas seis classes: Carro, CarroNovo, CarroUsado, Concessionaria, Venda e Compra, além de uma interface EstoqueInterface.

A classe Carro é a classe pai de CarroNovo e CarroUsado, e contém as informações básicas de um carro, como marca, modelo e ano de fabricação, além dos métodos get e set para acessar e alterar essas informações.

A classe CarroNovo e CarroUsado estendem a classe Carro, acrescentando informações específicas de cada tipo de carro, como preço e garantia para o CarroNovo, e quilometragem e estado de conservação para o CarroUsado.

A classe Concessionaria gerencia os carros da concessionária, permitindo adicionar, remover e listar carros. Para isso, foi utilizada uma lista de Carros, além dos métodos addCarro, removeCarro e listarCarros.

As classes Venda e Compra representam as transações realizadas pela concessionária, e contém informações sobre a concessionária, o carro vendido ou comprado, e o valor da transação. Foram criados métodos para calcular o valor total das vendas e compras realizadas pela concessionária.

Por fim, a classe Estoque implementa a interface EstoqueInterface, permitindo realizar operações de adição e remoção de carros, realizar vendas e compras e calcular o lucro total da concessionária. Foram criados métodos para calcular o valor total do estoque, o lucro total da concessionária e para listar todas as transações realizadas.
