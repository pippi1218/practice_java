package shopping;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * ショップを作成
         */
        Shop shop = new Shop("インコショップ まんまるまろん");

        /**
         * 商品の個数
         */
        final int ITEM_NUMBER = 5;

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

        /**
         * 顧客情報を表示
         */
        customer.print();

        /**
         * カートに商品を追加
         */
        Scanner scanner = new Scanner(System.in);

        String str;
        int itemNo;

        while (true) {
            try {
                System.out.print("商品番号(qで買物を終了) ? ");
                str = scanner.nextLine();

                if (str.equals("q")) {
                    break;
                }
                itemNo = Integer.parseInt(str);

                if (0 <= itemNo && itemNo < ITEM_NUMBER) {
                    customer.add(shop, itemNo);
                } else {
                    System.out.println("指定された商品番号に該当する商品は商品リストにありません。");
                }

            } catch (NumberFormatException e) {
                System.out.println("数値または指定の文字を入力してください。");
                continue;
            } catch (NoSuchElementException e) {
                break;
            }
        }
        scanner.close();

        /**
         * カートの中を表示
         */
        customer.printMyCart();
    }
}
