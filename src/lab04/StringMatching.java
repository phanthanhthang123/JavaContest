package lab04;

import java.util.Scanner;

public class StringMatching {
      public static String strParent,strChild;
      public static int n,m;
      public static Scanner input = new Scanner(System.in);

      public static void main(String[] args) {
            n = input.nextInt();
            input.nextLine();
            strParent = input.next();
            m = input.nextInt();
            input.nextLine();
            strChild = input.next();
            
            for(int i = 0; i < n-m+1 ;i++){
                  String sb = strParent.substring(i,i+m); 
                  if(sb.equals(strChild)){
                        System.out.print(i +" ");
                  }
            }

      }
}
