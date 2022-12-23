package projeucak;

import java.util.Scanner;

public class Ucak {

     /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
 */

    static Scanner input = new Scanner(System.in);
    static Scanner scan = new Scanner(System.in);
    static Bilgiler km = new Bilgiler();
    static double toplamFiyat;

    public static void main(String[] args) {

        yolculukNereyeUcret();

    }public static void yolculukNereyeUcret(){

        System.out.println("Nereye gitmek istiyorsunuz? ");
        String sehir = input.nextLine().toUpperCase();

        switch (sehir){
            case "B":
               toplamFiyat= km.getB()*km.getBirimFiyat();
                System.out.println("Tek yön Bilet ücretiniz: "+toplamFiyat);
                gidisDonusMu();
                yas();
                break;
            case "C":
                toplamFiyat=km.getC()*km.getBirimFiyat();
                System.out.println("Tek yön Bilet ücretiniz: "+toplamFiyat);
                gidisDonusMu();
                yas();
                break;
            case "D":
                toplamFiyat=km.getD()*km.getBirimFiyat();
                System.out.println("Tek yön Bilet ücretiniz: "+toplamFiyat);
                gidisDonusMu();
                yas();
                break;
            default:
                System.out.println("Geçersiz şehir adı girdiniz");
                yolculukNereyeUcret();
        }


    }
    public static void yas(){

        while (true) {

            try {


                System.out.println("Yaş İndiriminden yararlanabilmeniz için yaş bilginizi öğrenmem gerekiyor.");
                System.out.println("Lütfen yaşınızı giriniz");

                int yas = scan.nextInt();
                if (yas < 12) {
                    toplamFiyat = toplamFiyat * 0.5;
                    System.out.println("%50 İndirimli bilet fiyatınız:" + toplamFiyat);
                } else if (yas > 11 && yas <= 24) {
                    toplamFiyat = toplamFiyat * 0.9;
                    System.out.println("%10 İndirimli bilet fiyatınız:" + toplamFiyat);
                } else if (yas > 65) {
                    toplamFiyat = toplamFiyat * 0.7;
                    System.out.println("%30 İndirimli bilet fiyatınız:" + toplamFiyat);
                } else if (yas >= 25 && yas <= 65) {
                    System.out.println("İndirim kategorisinde değilsiniz.Bilet ücretiniz: " + toplamFiyat);
                } else {
                    System.out.println("Geçerli bir yaş giriniz");

                }
            }catch (Exception e){
        }
    }
public static void gidisDonusMu(){
    System.out.println("Yolculuğunuz tek yön mü gidis dönüş mü ? gidiş dönüş ise 1,tek yön ise 2'ye basınız");
    int secim = scan.nextInt();
    if (secim==1){
        System.out.println("Gidiş dönüş biletlerinde %20 indirim uygulanmaktadır.");
        toplamFiyat=toplamFiyat*2*0.8;
        System.out.println("Gidiş-Dönüş yeni bilet ücretiniz"+ toplamFiyat);
    }else if (secim==2){
        System.out.println("Tek yön biletlerinde indirim uygulanmamaktadır");
        System.out.println("Bilet fiyatınız: "+toplamFiyat);
    }

}






}
