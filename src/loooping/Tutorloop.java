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
public class Tutorloop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("awal");
          
          System.out.println("loop pertama");
          
          for(int nilai = 5; nilai <= 10; nilai++){
              System.out.println("for loop ke-" + nilai);
             
          }
          System.out.println("loop kedua");
          
          for(int nilai = 2; nilai < 10 ; nilai++){
              
              System.out.println("for loop ke-" + nilai);
          } 
          System.out.println("loop ketiga");
          for(int nilai = 10; nilai >= 5; nilai--){
              
              System.out.println("for loop ke-"+ nilai);
          }
          
          System.out.println("akhir");
          
      }  
    }
    
