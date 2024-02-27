package com.newcode.community;

import java.util.Scanner;

class testCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        char []c = new char[100];
        int m = func(n,c);
        for (int i = m; i >= 0 ; i--) {
            System.out.print(c[i]);
        }
    }

    public static int func(int input, char c[]){
        int i = -1;
        while(input > 0){
            i++;
            int temp = input % 26;
            input = (input - 1) /26;
            if( temp == 0)
                temp = 26;
            c[i] = (char) ('A' + temp - 1 );
        }
        return i;
    }

}






