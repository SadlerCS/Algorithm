package com.training.algorithm.greedyAlgorithm;

public class Cookie {
    public static void main(String[] args) {
        int[] g = {2, 5, 9, 9, 15, 20};
        int[] s = {1, 3, 6, 8, 20};
        int child = 0;
        int cookie = 0;
        while (child < g.length && cookie < s.length) {
            if (s[cookie] >= g[child]) {
                child++;
            }
            cookie++;
        }

        System.out.println(child);
        System.out.println(cookie);
    }
}
