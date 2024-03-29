package lesson19;

public class Goods {
    private String name;
    private int price;
    private int rank;

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rank=" + rank +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getRank() {
        return rank;
    }

    public Goods(String name, int price, int rank) {
        this.name = name;
        this.price = price;
        this.rank = rank;
    }
}
