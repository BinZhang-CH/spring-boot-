package com.ztkj;

public class ctr {
    public static void main(String[] args){
        String str="02-居民身份证";
        String[] split = str.split("-");
        for (String s:split) {
            System.out.println(s);
        }
    }
}
