package com.zhang.controller;

import com.zhang.pojo.TestOrder;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<TestOrder> testOrders = new ArrayList<TestOrder>();
        testOrders.add(new TestOrder(11,2));
        testOrders.add(new TestOrder(13,3));
        testOrders.add(new TestOrder(10,7));
        testOrders.add(new TestOrder(10,8));
        testOrders.add(new TestOrder(10,6));
        testOrders.add(new TestOrder(5,10));


        for (int i = 0; i < testOrders.size() - 1; i++) {
            // 比较相邻两个元素，较大的数往后冒泡
            for (int j = 0; j < testOrders.size() - 1 - i; j++) {
                if (testOrders.get(j).getZf() > testOrders.get(j + 1).getZf()) {

                    TestOrder temp = testOrders.get(j + 1); // 把第一个元素值保存到临时变量中
                    testOrders.set((j + 1) , testOrders.get(j)); // 把第二个元素值转移到第一个元素变量中
                    testOrders.set(j,temp); // 把临时变量（第一个元素的原值）保存到第二个元素中
                }
                if (testOrders.get(j).getZf() == testOrders.get(j + 1).getZf()) {
                    if (testOrders.get(j).getPjf() > testOrders.get(j + 1).getPjf()) {
                        TestOrder temp = testOrders.get(j + 1); // 把第一个元素值保存到临时变量中
                        testOrders.set((j + 1), testOrders.get(j)); // 把第二个元素值转移到第一个元素变量中
                        testOrders.set(j, temp); // 把临时变量（第一个元素的原值）保存到第二个元素中
                    }
                }
                //System.out.print(score[j] + " "); // 对排序后的数组元素进行输出
            }
            /*System.out.print("【");
            for (int j = score.length - 1 - i; j < score.length; j++) {
                System.out.print(score[j] + " ");
            }
            System.out.println("】");*/

        }
        System.out.println(testOrders);

    }
}
