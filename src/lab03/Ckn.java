package lab03;

import java.util.*; 

@SuppressWarnings({"unchecked", "deprecation"})
public class Ckn {
    public static Scanner input = new Scanner(System.in);
    public static long resultCkn[][] = new long[10005][10005];
    public static final long MOD = 1_000_000_007;

    public static long CKN(int k,int n){
        if(k==0 || k==n) return (long)1;
        if(k==1) return (long)n;

        if(resultCkn[k][n] != (long)0){
            return resultCkn[k][n];
        }

        return resultCkn[k][n] = (CKN(k,n-1) + CKN(k-1,n-1)) % MOD;
    }

    public static void main(String[] args) {
        int k = input.nextInt();
        int n = input.nextInt();
        
        long result = CKN(k,n);
        System.out.print(result % MOD);
    }
}
