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
     * 価格を返す
     *
     * @return
     */
    public int getPrice() {
        return price;
    }

    /**
     * 商品名と価格を表示する
     */
    public void print() {
        System.out.printf("%-8s\t:%-6d円\n", name, price);
    }

}
