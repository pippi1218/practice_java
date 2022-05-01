package shopping;

public class Customer {
    private String name;
    private Cart myCart = new Cart();
    private int money;

    /**
     * コンストラクタ
     *
     * @param name
     */
    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, int money) {
        this.name = name;
        this.money = money;
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

    public void remove(int itemNo) {
        myCart.remove(itemNo);
    }

    /**
     * カートの精算を行う
     */
    public void checkOut() {
        if (myCart.getTotalPrice() <= money) {
            money -= myCart.getTotalPrice();
            myCart.clear();
        } else {
            System.out.println("精算不可:所持金が不足しています。");
        }
    }

    /**
     * カート内の商品を表示する
     */
    public void printMyCart() {
        System.out.println("【カート内の商品】");
        myCart.print();
    }

    /**
     * 顧客情報を表示する
     */
    public void print() {
        System.out.printf("私の名前は、%sです。\n", name);
        System.out.printf("所持金は、%d円です。\n", money);
        printMyCart();
    }
}
