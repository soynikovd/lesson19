package lesson19;

public class Main {
    public static void main(String[] args) {
        Category it = new Category("it",
                new Goods[]{new Goods("Phone", 1699, 5),
                        new Goods("Computer", 6999, 2)});
        Category houseHold = new Category("Household",
                new Goods[]{new Goods("Washing Machine", 7999, 7),
                        new Goods("Kettle", 259, 10)});
        Category accessories = new Category("Accessories",
                new Goods[]{new Goods("Cover", 99, 6),
                        new Goods("Mouse", 140, 8)});

        User user1 = new User("Pro228", "1111", new Basket(new Goods[]{
                new Goods("Mouse", 140, 8)}));
        User user2 = new User("Den4ik", "1234", new Basket(new Goods[]{
                new Goods("Washing Machine", 7999, 7)}));

        Goods[] arrayGoods = user1.getBasket().getSoldGoods();
        for (Goods goods : arrayGoods) {
            System.out.println(goods.getName());
        }
        Goods[] arrayGoods2 = user2.getBasket().getSoldGoods();
        for (Goods goods : arrayGoods2) {
            System.out.println(goods.getName());
        }
    }
}
