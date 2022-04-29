package shopping;

public class Item {
    private String name;
    private int price;

    /**
     * コンストラクタ
     *
     * @param name
     * @param price
     */
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    /**
     * 商品名と価格を表示する
     */
    public void print() {
        System.out.printf("%-16\ts:%d", name, price);
    }

}
