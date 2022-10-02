/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;
/**
 *
 * @author jakub
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Napište čísla na každý nový řádek:");
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println("Výsledky:");
        System.out.println(""+(x+y)+" "+(x*y));
    }
    
}
