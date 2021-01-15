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
        


public class PalindromSayi {
    public static void main(String[] args) {
        //Scanner sınıfından scan adlı bir obje tanımlayarak kullanıcıdan veri girişi bekleniyor.
        Scanner scan = new Scanner(System.in);        
        System.out.println("Sayi Giriniz : ");
        
        // Matematiksel testlerin yapılabilmesi için degiskenler tanımlanıyor.
        int sayi=scan.nextInt();
        int ilkdeger = sayi;
        int uzunluk = String.valueOf(sayi).length();
        int kalan = 0;
        int deger = 0;
        int i;
        
        // Girilen sayının uzunluğu kadar dönen test yapısı
        for (i = 0; i <uzunluk; i++){
            kalan = sayi % 10;
            deger = deger * 10 + kalan;
            sayi = sayi /10;
            System.out.println(kalan +" "+deger+" "+sayi);
                    
        }                
       
        // Döngü sonucunde elde edilen degerin kullanıcı tarafından girilen sayıyla kontrolü
        if(deger == ilkdeger){
            System.out.println(deger + " Palindrom Sayidir.");
        }
        else{
            System.out.println(deger + " Palindrom Sayi Degildir.");
        
        
        
        
        
    }
}
}
