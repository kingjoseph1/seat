package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	1
    int seatB;
    int seatC;
    int income;
    Scanner con = new Scanner(System.in);
    System.out.print("Enter seat A tickets sold quantity: ");
    seatA = con.nextInt();
    System.out.print("Enter seat B tickets sold quantity: ");
    seatB = con.nextInt();
    System.out.print("Enter seat C tickets sold quantity: ");
    seatC = con.nextInt();
    income =(seatA *15)+ (seatB *12)+(seatC * 9);
    System.out.print("Total income=Ghc "+ income);
    }
}
