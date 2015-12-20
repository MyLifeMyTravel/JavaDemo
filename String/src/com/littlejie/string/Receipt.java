package com.littlejie.string;

import java.util.Formatter;

/**
 * Created by Lion on 2015/12/20.
 */
public class Receipt {

    private double total = 0;
    private Formatter f = new Formatter(System.out);
    private static final int ITEM_LENGTH = 15;
    private static final int QTY_LENGTH = 5;
    private static final int PRICE_LENGTH = 10;

    public void printTitle() {
        /**
         * 由常量来设置输出宽度，方便修改，但输入实在麻烦
         */
//        f.format("%-" + ITEM_LENGTH + "s %" + QTY_LENGTH + "s %" + PRICE_LENGTH + "s\n", "Item", "QTy", "Price");
        f.format("%-15s %5s %10s\n", "Item", "QTy", "Price");
        f.format("%-15s %5s %10s\n", "---", "---", "---");
    }

    public void print(String name, int qty, double price) {
        f.format("%-15s %5d %10.2f\n", name, qty, price);
        total += price;
    }

    public void printTotal() {
        f.format("%-15s %5s %10.2f\n", "Tax", "", total * 0.06);
        f.format("%-15s %5s %10s\n", "", "", "-----");
        f.format("%-15s %5s %10.2f\n", "Total", "", total * 1.06);
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Pricess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}
