/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loooping;

/**
 *
 * @author puji
 */
public class TUTORWHILE {
    public static void main(String[] args) {
        

        int a = 1;
        boolean kondisi = true;
        
        System.out.println("awal program");
        
        while(kondisi){
            System.out.println("while loop ke-" + a);
            a++;
            
            if (a == 20){
                kondisi = false;
            }
            a++;
        }
        
         System.out.println("selesai"); 
        
    } 
}
