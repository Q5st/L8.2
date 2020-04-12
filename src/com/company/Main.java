package com.company;



public class Main {

    public static void main(String[] args) {
        String fio = "Eskin Daniil Yurevich";
        String[] split = fio.split(" ");
        char[] f = split[0].toCharArray();
        char[] i = split[1].toCharArray();
        char[] o = split[2].toCharArray();
        System.out.println( split[0] + " " + f[0] + "." + i[0] + "." + o[0] + ".");
        System.out.println(split[1]);
        System.out.println(split[1] + " " + split[2] + " " + split[0]);
    }
}
