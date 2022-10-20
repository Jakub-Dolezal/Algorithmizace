/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dolezal;
import java.util.Scanner;
/**
 *
 * @author jakub.dolezal1
 */
public class FactorialCisla {
    private static final Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("cele cislo:");
        long in = sc.nextLong();
        long res =1;
        while (in>1){
            res = res * in;
            in = in-1;
        }
        
        System.out.println("factorial:"+res);
    }
    
}
