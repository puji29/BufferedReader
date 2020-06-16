
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author puji
 */
public class SwicthCase2 {
    public static void main(String[] args) {
        String input;
        
        Scanner inputUser = new Scanner(System.in);
       
        
        System.out.print("Panggil nama :");
        input = inputUser.next();
        
        switch(input){
            case "hasan":
                System.out.println("saya hadir boss");
                break;
            default:
                System.out.println(input + " tidak hadir Boss");
        }
        System.out.println("program selesai");  
    }
}
