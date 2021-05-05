package com.模板.kmp;


public class SubstringSearch {

    public static void main(String args[]) {
        String str = "abcxabcdabcdabcy";
        String subString = "abcdabcy";
        SubstringSearch ss = new SubstringSearch();
        boolean result = ss.KMP(str.toCharArray(), subString.toCharArray());
        System.out.print(result);
    }

    //构建失配数组
    private int[] computeTemporaryArray(char pattern[]) {
        int[] lps = new int[pattern.length];
        int j = 0;
        for (int i = 1; i < pattern.length; ) {
            if (pattern[i] == pattern[j]) {
                lps[i] = j + 1;
                j++;
                i++;
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    //KMP匹配
    public boolean KMP(char[] text, char[] pattern) {
        int lps[] = computeTemporaryArray(pattern);
        int i = 0;
        int j = 0;
        while (i < text.length && j < pattern.length) {
            if (text[i] == pattern[j]) {
                i++;
                j++;
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        if (j == pattern.length) {
            return true;
        }
        return false;
    }


}

