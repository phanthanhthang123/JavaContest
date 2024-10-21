package lab02;

import java.util.Scanner;


public class addTwoInteger {
    public static String sum(String a, String b) {
        int minlength = a.length() < b.length() ? a.length() : b.length();
        String sb = " ";
        StringBuilder result = new StringBuilder(sb);
        int phandu = 0;
        int tempa,tempb,sum=0;
        for (int i = 0; i < minlength; i++) {
            tempa = Integer.parseInt(a.substring(i,i+1));
            tempb = Integer.parseInt(b.substring(i,i+1));
            
            if (phandu + tempa + tempb > 10) {
                sum = (phandu + tempa + tempb) % 10;
                phandu = 1;
            } else {
                sum = tempa + tempb + phandu;
                phandu = 0;
            }
            
            result.append(Integer.toString(sum));
        }

        if (minlength == a.length() && minlength != b.length()) {
            for (int i = minlength; i < b.length(); i++) {
                tempb = Integer.parseInt(b.substring(i,i+1));
                if (phandu + tempb > 10) {
                    sum = (phandu + tempb) % 10;
                    phandu = 1;
                } else {
                    sum = tempb + phandu;
                }
                result.append(Integer.toString(sum));
            }
        } else if(minlength == b.length() && minlength != a.length()){
            for (int i = minlength; i < a.length(); i++) {
                tempa = Integer.parseInt(a.substring(i,i+1));
                if (phandu + tempa > 10) {
                    sum = (phandu + tempa) % 10;
                    phandu = 1;
                } else {
                    sum = tempa + phandu;
                }
                result.append(Integer.toString(sum));
            }
        }

        if(phandu==1){
            result.append(Integer.toString(phandu));
        }

        return result.toString();
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] words = str.split(" ");
        String a = words[0];
        String b = words[1];
        String tempa = new StringBuilder(a).reverse().toString();
        String tempb = new StringBuilder(b).reverse().toString();
        String sumResult = new StringBuilder(sum(tempa, tempb)).reverse().toString();
        System.out.print(sumResult);
    }

}