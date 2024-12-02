package lab04;

import java.util.Scanner;

public class ConcatString {
      public static String str1;
      public static String str2;
      public static int lengthstr1;
      public static int lengthstr2;
      public static int k;
      public static int t;
      public static StringBuilder Result = new StringBuilder();

      public static Scanner input = new Scanner(System.in);
      public static void main(String[] args) {
            lengthstr1 = input.nextInt();
            str1 = input.next().substring(0,lengthstr1);
            lengthstr2 = input.nextInt();
            str2 = input.next().substring(0,lengthstr2);
            k = input.nextInt();
            t = input.nextInt();

            for(int i = 1;i<=k;i++){
                  Result.append(str1);
            }
            for(int i = 1;i<=t;i++){
                  Result.append(str2);
            }

            System.out.println(Result);
      }
}
