package shopping;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    /**
     * カート内の商品リスト
     */
    private List<Item> listItem = new ArrayList<>();

    /**
     * カート内の商品リストに商品を追加
     *
     * @param item
     */
    public void add(Item item) {
        listItem.add(item);
    }

    /**
     * カート内の商品の合計価格
     *
     * @return
     */
    public int getTotalPrice() {

        int totalPrice = 0;

        for (Item item : listItem) {
            totalPrice += item.getPrice();
        }

        return totalPrice;
    }

    public void print() {

        if (listItem.size() == 0) {
            System.out.println("カートに商品が入っていません。");
        } else {
            for (Item item : listItem) {
                item.print();
            }
        }
        System.out.println("*****************************************");
    }

}
