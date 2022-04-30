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

    public void remove(int itemNo) {
        if (0 <= itemNo && itemNo < listItem.size()) {
            listItem.remove(itemNo);
        } else {
            System.out.println("指定された商品番号に該当する商品は商品リストにありません。");
        }

    }

    /**
     * カート内の商品リストを空にする
     */
    public void clear() {
        listItem.clear();
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

    /**
     * カート内の商品と合計価格を表示
     */
    public void print() {

        if (listItem.size() == 0) {
            System.out.println("カートに商品が入っていません。");
        } else {
            int i = 0;
            for (Item item : listItem) {
                System.out.print(i + " ");
                item.print();
                i++;
            }
            System.out.println("カート内の商品の合計価格:" + getTotalPrice() + "円");
        }

        System.out.println("*****************************************");
    }

}
