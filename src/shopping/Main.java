package shopping;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {

        /**
         * ショップを作成
         */
        Shop shop = new Shop("インコショップ まんまるまろん");

        /**
         * 商品を追加
         */
        shop.add(new Item("まんまるインコ", 10000));
        shop.add(new Item("さんかくインコ", 3000));
        shop.add(new Item("しかくインコ", 4000));
        shop.add(new Item("にじいろインコ", 77777));
        shop.add(new Item("うるとらインコ", 50000));

        /**
         * 商品リストを表示
         */
        shop.print();

        /**
         * 顧客情報を登録
         */
        Customer customer = new Customer("まろん");

        customer.print();

        /**
         * カートに商品を追加
         */
        customer.add(shop, 0);
        customer.add(shop, 2);
        customer.add(shop, 3);

        customer.printMyCart();
    }
}
