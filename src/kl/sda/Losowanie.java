package kl.sda;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Losowanie {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dolny zakres");
                int losMin = scanner.nextInt();

        System.out.println("Podaj górny zakres");
        int losMax = scanner.nextInt();

//        System.out.println(losMin);
//        System.out.println(losMax);

        if (losMax < losMin) {

            System.out.println("Podałeś zły zakres");
            }
            else {
            Random random = new Random();
            int losowana = random.nextInt(losMax - losMin) + losMin;

            System.out.println("Wylosowania liczba to :" + losowana);
        }





    }


}
