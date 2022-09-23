/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */
import java.util.Scanner;

public class NumberToMonths {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Please indicate a month as an integer from 1 to 12: ");
        int m = in.nextInt();
        if (m == 1) {
            System.out.printf("January\n");
        } else if (m == 2) {
            System.out.printf("Febuary\n");
        } else if (m == 3) {
            System.out.printf("March\n");

        } else if (m == 4) {
            System.out.printf("April\n");

        } else if (m == 5) {
            System.out.printf("May\n");

        } else if (m == 6) {
            System.out.printf("June\n");

        } else if (m == 7) {
            System.out.printf("July\n");

        } else if (m == 8) {
            System.out.printf("August\n");

        } else if (m == 9) {
            System.out.printf("September\n");

        } else if (m == 10) {
            System.out.printf("October\n");

        } else if (m == 11) {
            System.out.printf("November\n");

        } else if (m == 12) {
            System.out.printf("December\n");

        } else {
            System.out.printf("This number does not correspond to a month.\n");

        }
    }
}