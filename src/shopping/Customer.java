package shopping;

public class Customer {
    private String name;
    private Cart myCart = new Cart();

    /**
     * コンストラクタ
     *
     * @param name
     */
    public Customer(String name) {
        this.name = name;
    }

    /**
     * 指定した商品番号のアイテムをカートに追加
     *
     * @param shop
     * @param itemNo
     */
    public void add(Shop shop, int itemNo) {
        myCart.add(shop.get(itemNo));
    }

    public void printMyCart() {
        System.out.println("【カート内の商品】");
        myCart.print();
    }

    public void print() {
        System.out.println("*****************************************");
        System.out.printf("私の名前は、%sです\n", name);
        printMyCart();
    }
}
