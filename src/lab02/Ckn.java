package lab02;

import java.util.Scanner;

public class Ckn {
    public static Scanner input = new Scanner(System.in);
    public static int k,n;

    public static long CKN(int k,int n){
        if(k==0) return 1;
        if(k==n) return 1;
        return CKN(k,n-1) + CKN(k-1,n-1);
    }

    public static void main(String[] args) {
        k = input.nextInt();
        n = input.nextInt();
        long result = CKN(k,n);
        System.out.print(result);
    }
}
