/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//an oldie but a goodie
import java.util.Scanner;

/**
 *
 * @author martin
 */
public class MartinHongLab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter anything");
        String userInput = input.nextLine();
        System.out.println("you said " + userInput);
        input.close();
    }
    
}
