/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev;

/**
 *
 * @author Seyfullah
 */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class tersyazi {
    public static void main(String[] args) {
      
        
        //Scanner sınıfından scan adlı bir obje tanımlayarak kullanıcıdan veri
        //girişi bekleniyor.
                
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yazmak istediginiz cümleyi giriniz");
        String yazi=scan.nextLine();
        
        //Kullanıcı tarafından girilen yazının iterasyon yardımıyla tersten 
        //yazdırılması.
        System.out.print("Yazinin Tersi : ");     
        for (int i = yazi.length() ; i>0; --i){
            System.out.print(yazi.charAt(i-1) );
        }     
        
        System.out.println("\n"+"Tebrikler.");
        
    }
    
    
   
}
