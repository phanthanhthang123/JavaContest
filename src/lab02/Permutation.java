package lab02;

import java.util.*;

public class Permutation {
    public static int n;
    public static int[] arr = new int[1005];
    public static boolean[] visited = new boolean[1005];
    public static Scanner input = new Scanner(System.in);

    public static void print(int arr[],int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i]+" ");   
        }
        System.out.println("");    
    }

    public static void Try(int k) {
        for (int v = 1; v <= n; v++) {
            if(!visited[v]){
                arr[k] = v;
                visited[v] = true;
                if(k==n){
                    print(arr,n);
                }else{
                    Try(k+1);
                }

                visited[v] = false;
            }
        }
    }

    public static void main(String[] args) {
        n = input.nextInt();
        Try(1);
    }
}
