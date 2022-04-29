package shopping;

import java.util.List;
import java.util.ArrayList;

public class Shop {
    /**
     * ショップ名
     */
    private String name;

    /**
     * ショップの商品リスト
     */
    private List<Item> listItem = new ArrayList<Item>();

    /**
     * コンストラクタ
     *
     * @param name
     */
    public Shop(String name) {
        this.name = name;
    }

    /**
     * 商品リストに商品を追加
     *
     * @param item
     */
    public void add(Item item) {
        listItem.add(item);
    }

    public Item get(int itemNo) {
        return listItem.get(itemNo);
    }

    /**
     * ショップ名と商品リストを表示
     */
    public void print() {
        System.out.println("=========================================");
        System.out.printf("いらっしゃいませ！%sへようこそ！\n", name);
        System.out.println("【商品リスト】");

        int i = 0;
        for (Item item : listItem) {
            System.out.print(i + " ");
            item.print();
            i++;
        }

        System.out.println("=========================================");
    }
}
