package com.littlejie.string;

/**
 * toString()方法的无意
 * Created by Lion on 2015/12/19.
 */
public class Recursion {

    @Override
    public String toString() {
        /**
         * "Recursion toString:"+this会发生递归调用，因为"+"之前为String类型，编译器会自动调用this.toString
         */
//        return "Recursion toString:"+this;
        /**
         * 此处super.toString()调用的是Object.toString
         */
        return "Recursion toString:" + super.toString();
    }

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        System.out.println(recursion.toString());
    }
}
