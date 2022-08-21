// Name   : Fernando Duffoo
// Date   : 6/19/2022
// Course : CSC1231
// Project: 04

// Part-2:
import java.util.Scanner;

public class Fernando_Duffoo_Project04{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Binary String:");
        String binaryString = sc.next();
        double decimalValue = 0;
        for(int i=0; i < binaryString.length();i++){
            if(binaryString.charAt(i) == '1'){
                decimalValue = decimalValue + Math.pow(2,binaryString.length()-1-i);
            }
        }
        System.out.println("Decimal Value: " + decimalValue);
    }
}

// Part-1:
//import java.util.Scanner;

//public class Fernando_Duffoo_Project04{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Binary String:");
//        String binaryString = sc.next();
//        System.out.println("Decimal Value: " + Integer.parseInt(binaryString,2));
//    }
//}