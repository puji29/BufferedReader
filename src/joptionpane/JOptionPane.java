/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joptionpane;

/**
 *
 * @author puji
 */
public class JOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String inputNilai = javax.swing.JOptionPane.showInputDialog(null,"input Nilai");
        int nilai = Integer.parseInt(inputNilai);
       
        
    
   
        if(nilai >=91 && nilai <= 100){
            System.out.println("NILAI A");
        }else if(nilai >= 86 && nilai < 91){
            System.out.println("NILAI A-");
        }else if(nilai >= 81 && nilai <85){
            System.out.println("NILAI B+");
        }else if(nilai >= 75 && nilai <80){
            System.out.println("NILAI B");
        }else if(nilai >= 71 && nilai <75){
            System.out.println("NILAI B-");
        }else if(nilai >= 66 && nilai <70){
            System.out.println("NILAI C+");
        }else if(nilai >= 61 && nilai <65){
            System.out.println("NILAI C");
        }else if(nilai >= 56 && nilai <60){
            System.out.println("NILAI C-");
        }else if(nilai >= 51 && nilai <55){
            System.out.println("NILAI D");
        }else if(nilai >= 0 && nilai <50){
            System.out.println("NILAI E");
        }else{
            System.out.println("NILAI SALAH");
        }
        
    }
}
    

