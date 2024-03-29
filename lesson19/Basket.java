package lesson19;

public class Basket {
    private Goods[] soldGoods;

    public Goods[] getSoldGoods() {
        return soldGoods;
    }

    public Basket(Goods[] soldGoods) {
        this.soldGoods = soldGoods;
    }
}
