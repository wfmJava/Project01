package com.test.bean;

import com.test.java.Hello;

import java.util.ArrayList;

public class Customer {
    //模板5：prsf
    private static final Hello HW = new Hello();
    //变形：psf
    public static final int NUMBER = 2;
    //变形：psfi,psfs
    public static final String HEE = "china";

    //模板：psvm
    public static void main(String[] args) {
        //常用快捷键

        //模板1: sout
        System.out.println("hai!!!");
        // 变形soutp,soutm,soutv,***.sout
        System.out.println("args = [" + args + "]");
        System.out.println("Customer.main");
        int a = 1;
        System.out.println("a = " + a);
        System.out.println(a);

        //模板2: fori
        String[] arr = new String[]{"lisen","hanmeimei","leizi","jiaohua"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形; iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形: itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //模板3: list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(234);
        list.add(789);
        for (Object o : list) {
            System.out.println(o);
        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        //变形；list.forr ,倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }

    public  void  method() {
        System.out.println("Customer.method");
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(234);
        list.add(789);
        //模板4：ifn
        if (list == null) {
            
        }
        //变形： inn
        if (list != null) {
            
        }
        //变形： nn
        if (list != null) {

        }
        //变形： null
        if (list == null) {

        }
    }
}
