package com.juaracoding.siloam;

public class Main {
    public static void main(String[] args) {

        angkaGanjil(9);
        angkaGanjil(5);
    }
    public static void angkaGanjil(int n) {
        for (int i = n; i >= 1; i-=2) {
            for (int j = i; j >= 1; j-=2) {
                System.out.print(j + " ");
            }
            System.out.println();
            }
        }
    }
