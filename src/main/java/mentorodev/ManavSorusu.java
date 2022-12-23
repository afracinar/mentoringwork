package mentorodev;


import java.util.ArrayList;
import java.util.List;

public class ManavSorusu {

    /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

        Ipucu:
        Class icinde 3 method olacak
         * main() isimli bir method
         * musteriSecimi() isimli bir method
         * kasa() isimli bir method
         * */

    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        urunler.add("ÇİLEK");
        urunler.add("KARPUZ");
        urunler.add("KİRAZ");
        urunler.add("ELMA");
        urunler.add("MUZ");


        List<Double> fiyatlar = new ArrayList<>();
        fiyatlar.add(35.0);
        fiyatlar.add(50.0);
        fiyatlar.add(25.5);
        fiyatlar.add(13.0);
        fiyatlar.add(40.0);

        System.out.println("No"+"\t\t"+"Ürünler"+"\t\t"+"Fiyatlar");
        System.out.println("------------------------------");

        for (int i = 1; i <= urunler.size(); i++) {
            System.out.print(i);
            for (int j = i-1 ; j < i ; j++) {

                System.out.println("\t\t"+urunler.get(j)+" kg"+ "\t\t"+fiyatlar.get(j)+" TL");
            }
        }
        ManavMethod manav = new ManavMethod();
        manav.musteriSecimi(urunler,fiyatlar);

    }


}
