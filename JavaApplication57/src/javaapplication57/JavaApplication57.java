/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication57;
import java.util.Scanner;
/**
 *
 * @author WHITEKABAR
 */
public class JavaApplication57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean done = false;
        char command;
        Scanner input = new Scanner (System.in);
        
        while(!done) {
            System.out.println("Enter a character (q t quit)");
            command = input.next().charAt(0);
            if (command == 'q') done = true;
            }
        }
    }
    

