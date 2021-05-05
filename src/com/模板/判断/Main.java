package com.模板.判断;

public class Main {
    //判断是否超边界,判断时 i 肯定在 arr.length 里面
    //第一个参数为数组的长度
    //第二个为测试边界的值 n = i + a;
    //比如我要判断 i+3的边界值 isBoundaryValue(arr.length , i+3 )
    //  i-2的边界值 isBoundaryValue(arr.length , i-2 )
    static boolean isBoundaryValue(int len, int n) {
        return n >= 0 && len > n;
    }

}
