package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//        System.out.println((isSixtyFive(int num1,int num2));
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the new number ");
        int num1 = scan.nextInt();
        System.out.println("please enter the second number ");
        int num2 = scan.nextInt();


//        isSixtyFive( num1,num2);

        System.out.println(   isSixtyFive( num1,num2));


    }

    public static boolean isSixtyFive (int num1, int num2){
      return num1 == 65 || num2 == 65 ||(num1 + num2) == 65 ;
  }

//
//
//    }
}
