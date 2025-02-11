/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package token;
import java.util.Scanner;
/**
 *
 * @author elhusain.allben
 */
public class Token {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Hola muy buenas");
        System.out.println("Como te llamas");
        String nombre = sc.nextLine();
        System.out.println("Muy buenas " + nombre);
    }
    
}
