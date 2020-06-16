/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferedreader2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author puji
 */
public class BufferedReader2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)   throws IOException {
        // TODO code application logic here
         
        // TODO code application logic here
           String nama;
        //
        InputStreamReader isr = new InputStreamReader(System.in);
        
        //
        BufferedReader br = new BufferedReader(isr);
        
        //
        System.out.print("inputkan nama kamu : ");
        nama = br.readLine();
        
        //
        System.out.println("nama kamu adalah : "+nama);    
        } 
    }
    

