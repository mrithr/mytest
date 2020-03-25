package com.itheima.day04_array;

/*
 * 现有一个小数数组{12.9,53.54,75.0,99.1,3.14}。请编写代码，找出数组中的最小值并打印。
 *
 * */
public class Demo06 {
    public static void main(String[] args) {
        double[] arr = {12.9, 53.54, 75.0, 99.1, 3.14};
        System.out.println("数组中最小的元素是：" + minNumber(arr));

    }

    //定义一个有参数有返回值的minNumber方法

    public static double minNumber(double[] arr) {
        double min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
