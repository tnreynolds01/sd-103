package com.company;
import java.util.Scanner;
public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here

    }

    public static void calLaborTime(){
        System.out.println("Enter the volume");
        double volume = Double.parseDouble(input.nextLine());
        double labortime = (volume/20)*2;
        System.out.println(" the labor time"+labortime);

    }
}
