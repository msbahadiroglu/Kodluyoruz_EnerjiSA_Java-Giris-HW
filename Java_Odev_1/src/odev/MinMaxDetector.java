/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Seyfullah
 * 
 */


public class MinMaxDetector {
    
    static Integer maximum;
    static Integer minimum;
    static Boolean durdurucu = true;
    
    //Minimum Maximum değerleri bulmaya yarayan metod
    private static void MinMaxBulucu(ArrayList<Integer> listname){
        minimum=listname.get(0);
        maximum=listname.get(0);
        
        /*minimum ve maximum değişkenleri listenin ilk elemanına atandıktan 
        *sonra liste elemanları üzerinde dönen döngüyle yeni minimum veya maximum
        *degerleri belirleyen döngü yapısı
        */
        
       
        for (int i=0 ; i < listname.size(); i++){        
                if (listname.get(i)<minimum){
                    minimum=listname.get(i);                    
                }          
        }
        
        for (int i=0 ; i < listname.size(); i++){        
                if (listname.get(i)>maximum){
                    maximum=listname.get(i);                    
                }          
        }
        
        System.out.println(listname);        
        System.out.println("Min Value = " + minimum);
        System.out.println("Max Value = " + maximum);
        System.out.println();   
              
    }
    
    //MinMaxDetector classına ait Liste oluşturan main metod
    public static void main(String[] args) {
        //Rastgele integer üretmek için kullanılan Random sınıfından random nesnesi
        Random random=new Random();
        ////Kullanıcıdan veri girişi için Scanner sınıfından scan nesnesi
        Scanner scan = new Scanner(System.in);
        //Üretilen sayi degerlerini tutmak üzere bir liste nesnesi
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list4 = new ArrayList<Integer>();
        
        //Kullanıcıdan listedeki eleman sayısını isteyen satırlar
        System.out.println("Lutfen dizi eleman sayisini giriniz: (Min:3 / Max:8");
        int n = scan.nextInt();
                   
        
        //Kullanıcının girdigi deger ile ödevde belirtilen sınırların kontrolü
        //Bu kontrol sonucunda 'n' degeri dogru aralıktaysa listeye rastgele 
        //degerleri atayan kod bloğu
       
        if (n<3 || n>8){
            System.out.println("Eleman sayisi sinirlara uygun degil...");
            durdurucu=false;
            
        }
        else{
            for (int i=0; i<n; i++){
                list1.add(random.nextInt(1000));
                list2.add(random.nextInt(1000));
                list3.add(random.nextInt(1000));
                list4.add(random.nextInt(1000));                              
            }                
        }
        
        //Kullanicidan girilen liste eleman sayısı şartların içinde değilse
        //kodun hata vermeden çalışması için bulduğum çözüm
        while (durdurucu==true){
            MinMaxBulucu(list1);
            MinMaxBulucu(list2);
            MinMaxBulucu(list3);
            MinMaxBulucu(list4);
            durdurucu=false;
        }
        
        
    }
    
    
    
    
    
}
