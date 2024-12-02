package lab04;

import java.util.Scanner;

public class CountAndReplaceCharInString {
      public static Scanner input = new Scanner(System.in);
      public static int n;
      public static int count = 0;
      public static String str;
      public static char charOld;
      public static char charNew;

      public static void main(String[] args) {
            n = input.nextInt();
            input.nextLine();
            str = input.next();
            str = str.substring(0,n);
            charOld = input.next().charAt(0);
            charNew = input.next().charAt(0);
            StringBuilder result = new StringBuilder();

            for(int i = 0; i<n;i++ ){
                  if(str.charAt(i) == charOld){
                        count++;
                        result.append(charNew);
                  }else{
                        result.append(str.charAt(i));
                  }
            }
            System.out.println(count+ " " + result);
      }
}
