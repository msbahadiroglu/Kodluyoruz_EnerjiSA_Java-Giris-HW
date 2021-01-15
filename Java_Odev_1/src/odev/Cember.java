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
import java.util.Scanner;
import java.lang.Math.*;


//Renk ve yaricap bilgisi iceren sınıf
public class Cember {
    private String renk;
    public double yaricap;
    
    
    //Cember sınıfından renk ve yaricap ozelliklerini kullanicinin
    //girdigi cember objesi
    public Cember(double yaricap){
        
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Lütfen cemberinizin rengini giriniz");
        this.renk = scan.nextLine();
        System.out.println("Lütfen dairenin yaricapini giriniz: ");
        this.yaricap=scan.nextDouble();

    }

   //Kullanıcıdan gelen bilgiyle alan ve yarıcap hesabı yapan metodlar
    public double AlanHesap(){
        
        double alan= Math.PI*this.yaricap*this.yaricap;
        return alan;
    }
    
    public double YaricapHesap(){
        this.yaricap= Math.sqrt(AlanHesap()/Math.PI);
        return this.yaricap;
    }
    
    //Cember sınıfından cember1 adlı bir nesne üretilmesi ve hesapların yapılması
    public static void main(String[] args) {
       Cember cember1= new Cember(0);
       
       
        System.out.println(cember1.renk + " renkli cemberinizin Alanı" + cember1.AlanHesap());
        
        System.out.println(cember1.AlanHesap()+" cm^2 alanlı cemberinizin" + " renkli cemberinizin yaricapi" + cember1.YaricapHesap());
    } 
    
}

