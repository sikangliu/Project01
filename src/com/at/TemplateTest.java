package com.at;

import java.util.Arrays;

/**
 * @author liusikang
 * @create 2020-01-14 19:01
 */
public class TemplateTest {

    private static final Integer count = 10;

    public static final String str = "11";

    /**
     * 测试数值
     */
    private int num33 = 22;

    /**
     * 姓名
     */
    private String name;




    public static void main(String[] args) {




        System.out.println("hello");

        System.out.println("args = " + Arrays.deepToString(args));

        System.out.println("TemplateTest.main");

        int num = 10;
        int num2 = 20;
        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);

    }

    public void method(){
        System.out.println("TemplateTest.method");
    }

    public void test1() {
        System.out.println("222");
    }

}
