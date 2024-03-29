package lesson19;

public class Category {
    private String title;
    private Goods[] goods;

    public String getTitle() {
        return title;
    }

    public Goods[] getGoods() {
        return goods;
    }

    public Category(String title, Goods[] goods) {
        this.title = title;
        this.goods = goods;
    }
}
