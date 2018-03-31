package hocjava.bai1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Bai1 {
    public static void main(String [] args) throws IOException {
//        for (int i = 0; i < 5; i++)
//        {
//            for (int j = 0; j <= i; j++)
//                System.out.print("*");
//            System.out.println();
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập n và m");
//        double n = sc.nextDouble();
//        double m = sc.nextDouble();
//        System.out.println(m + " + " + n +" = " + (m + n));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String a1 = br.readLine();
        double b = Double.parseDouble(a);
        double b1 = Double.parseDouble(a1);
        System.out.println((b + b1));
    }
}
