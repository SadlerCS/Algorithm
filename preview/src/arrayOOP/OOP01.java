package arrayOOP;

public class OOP01 {
    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        item1.name = "血瓶";
        item1.price = 50;
        item2.name = "草鞋";
        item2.price = 300;
        item3.name = "长剑";
        item3.price = 350;

    }
}


class Item {
    String name;
    int price;

}
