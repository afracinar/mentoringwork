package okulproje_yarımkaldı;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OkulMain {

    public static void main(String[] args) {

       Okul okul1 = new Okul("Kabataş lisesi",3);
       ArrayList<Ogrenci> ogrenciler = okul1.getOgrenciler();

       int ogrenciSayisi = 1;
       Scanner input = new Scanner(System.in);
       Scanner scan = new Scanner(System.in);  //neden 2. scanner oluşturuldu?

       do{
           System.out.println(ogrenciSayisi + ". Öğrenci Adı= ");
           String ogrAd = input.nextLine();

           System.out.println(ogrenciSayisi+". Öğrenci Soyadı= ");
           String ogrSoyad = input.nextLine();

           System.out.println(ogrenciSayisi+". Öğrencinin yaşı= ");
           int yas = scan.nextInt();

           try{
               Ogrenci ogr = new Ogrenci(ogrAd,ogrSoyad,yas);
               ogrenciler.add(ogr); //list'e öğrenci ekleniyor
               ogrenciSayisi++;
           }catch (Exception e){
               System.out.println(e.getMessage());
               System.out.println("Yeni öğrenci giriniz");
           }
       }while(ogrenciSayisi<= okul1.getMaxOgrenciSayisi());

        System.out.println(okul1.getOgrenciler());

    }
}
