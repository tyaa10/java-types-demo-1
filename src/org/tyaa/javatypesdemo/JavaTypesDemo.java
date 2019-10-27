/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javatypesdemo;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class JavaTypesDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*byte by1 = 120;
        // by1 = 129;
        short sh1 = -129;
        int int1 = 100000000;
        long lon1 = 1000000000000000L;
        
        float fl1 = 10.12f;
        double do1 = 106547567657.12567576576587d;
        
        boolean boo1 = true;
        boo1 = false;*/
        
        // char ch1 = 'a';
        
        // sout + TAB
        // System.out.println(ch1);
        
        /*int i1 = 0;
        i1 = i1 + 1;
        i1 += 1;
        i1++;
        
        // for + TAB
        for (int i = 0; i < 26; i++) {
            //System.out.println(i);
            System.out.println(ch1++);
        }*/
        
        // Alt + Enter -> Import
        System.out.println("Input a character then press Enter:");
        Scanner sc = new Scanner(System.in);
        char ch1 = sc.nextLine().toCharArray()[0];
        
        System.out.println("Choose an operator:");
        System.out.println("1 - Asc");
        System.out.println("2 - Desc");
        
        int order = sc.nextInt();
        
        // if + Tab
        if (order == 1) {
            for (int i = 0; i < 10; i++) {
                System.out.println(ch1++);
            }
        } else if (order == 2) {
            for (int i = 0; i < 10; i++) {
                System.out.println(ch1--);
            }
        }

        //Test comment
    }
}
