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
public class SoucetPrumerZdanychCelychCisel {
    private static final Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long sum= 0;
        float avg= 0;
        long in=0;
        long i=0;
        System.out.println("Zadejte kladné celé čísla.");
        while(true){
            in = sc.nextLong();
            if (in<0){
                break;
            }
            sum +=in;
            i++;
        }
        
        avg =(float)sum/i;
        
        System.out.format("součet:%d%n",sum);
        System.out.format("průměr:%f%n",avg);
        
    }
    
}
