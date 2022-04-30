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
        Customer customer = new Customer("まろん", 200000);

        /**
         * 顧客情報を表示
         */
        System.out.println("*****************************************");
        customer.print();

        /**
         * カートに商品を追加
         */
        Scanner scanner = new Scanner(System.in);

        String buyStr;
        int itemNo;

        String returnStr;
        int returnItemNo;

        while (true) {
            try {
                System.out.print("商品番号(qで買物を終了/cでカートの中身を表示/rで返品) ? ");
                buyStr = scanner.nextLine();

                if (buyStr.equals("q")) {

                    customer.printMyCart();

                    customer.checkOut();

                    customer.print();

                    continue;
                }

                if (buyStr.equals("c")) {
                    customer.printMyCart();
                    continue;
                }

                if (buyStr.equals("r")) {
                    System.out.println("■ □ ■ □ ■ 現在返品モードです。■ □ ■ □ ■");
                    customer.printMyCart();

                    while (true) {
                        try {
                            System.out.print("返品する商品番号(qで返品を終了) ? ");
                            returnStr = scanner.nextLine();

                            if (returnStr.equals("q")) {
                                break;
                            }

                            returnItemNo = Integer.parseInt(returnStr);

                            customer.remove(returnItemNo);
                            customer.printMyCart();
                            continue;

                        } catch (NumberFormatException e) {
                            System.out.println("数値または指定の文字を入力してください。");
                            continue;
                        } catch (NoSuchElementException e) {
                            break;
                        }
                    }

                    System.out.println("■ □ ■ □ ■ 返品モードを解除しました。■ □ ■ □ ■");
                    continue;
                }

                itemNo = Integer.parseInt(buyStr);

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

    }
}
