package odev;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Seyfullah
 */
import java.util.Scanner;

public class HavaDurumu {
    public static void main(String[] args) {
        //Scanner sınıfından scan adlı bir obje tanımlayarak kullanıcıdan veri 
        //girişi bekleniyor.
        Scanner scan = new Scanner(System.in);
        System.out.println("Hava sicakligini giriniz: ");
        int sicaklik = scan.nextInt();
        
        //Kullanıcıdan gelen degerin ödevde belirtilen şartlar dogrultusunda
        //degerlendirilmesini saglayan şart blogu
        if (sicaklik<20){
            System.out.println("Bugün hava soguk.");
        }
        else if (sicaklik>=20 && sicaklik<=30){
            System.out.println("Bugün hava ilik, yine de tedbiri olmalisin.");
            
        }
        else{
            System.out.println("Hava gayet sicak.");
        }
    }
}

