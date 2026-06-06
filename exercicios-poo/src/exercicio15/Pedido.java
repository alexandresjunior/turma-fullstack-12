package exercicio15;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Double valorTotal;
    private List<ItemPedido> itens;

    public Pedido() {
        itens = new ArrayList<>();
        valorTotal = 0.0;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double obterTotal() {
        for (ItemPedido item : itens) {
            double valorItem = item.getProduto().getValor() * item.getQuantidade();

            valorTotal += valorItem;
        }

        return valorTotal;
    }
}
