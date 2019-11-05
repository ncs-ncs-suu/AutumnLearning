package com.sscom;

public class Generation {
    private boolean ok;

    public Generation(){

    }

    private void printBitString(int[] a, int n){
        for (int i = 1; i <= n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    private void generateBitString(int a[], int n){
        int i = n;
        while (a[i] == 1) i--;
        if (i==0){
            ok = false;
        }
        else {
            a[i] = 1;
            for (int j = i+1; j <=n ; j++) {
                a[j] = 0;
            }
        }
    }

    void nextBitString(int n){
        int[] a = new int[n+1];
        ok = true;
        while(ok){
            printBitString(a,n);
            generateBitString(a,n);
        }
    }
}
