package filmproje;

 /*
     TASK :
      yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının film ismini  görmeden
      filmin index nosuna göre sectiriniz
      seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
      sağlayan method create ediniz...
      Ahanda TRICK...
      kullanıcının sectiği filmin harf sayısını  console yazdırınız.
      kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
      kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
      kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
      kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.
     */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Film {

    static Scanner input = new Scanner(System.in);
        static  List<String> filmListesi = new ArrayList<>(Arrays.asList("Zindan Adasi","Titanic","Kuzularin Sessizligi","Harry Potter","Dabbe","Sessiz Yer","Piyanist","Cizgili Pijamali Cocuk"));
        static int hakSayisi;
    static int counter = 0;
    static int tahminSayisi=1;

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Lutfen 0 ile 7 arasinda bir sayi seciniz");
            int sayi = input.nextInt();

            System.out.println("Sectiginiz filmin harf sayisi :" + (filmListesi.get(sayi).length()));
            hakSayisi = (filmListesi.get(sayi).length()) * 2;
            System.out.println("Toplam hak Sayiniz = " + hakSayisi);

             tahmin(sayi);

        }
        public static void tahmin(int sayi) {


            String tahminEdilenFilm;
            do {
                counter++;

                System.out.println("Lutfen sectiginiz filmin adini tahmin ediniz");
                tahminEdilenFilm = input.nextLine();

                if (tahminEdilenFilm.equalsIgnoreCase(filmListesi.get(sayi))) {
                    System.out.println("Tebrikler!!!..Dogru tahmin ettiniz.");
                    System.out.println("Yanlış tahmin sayınız: "+(counter-1)+" -->" + tahminSayisi + ". denemede doğru tahminde bulundunuz");
                    break;

                } else {
                    System.out.println("Üzgünüm tahmininiz doğru değil");

                    System.out.println("Yanlış tahmin sayınız= " +counter);

                    System.out.println(hakSayisi - counter + " hakkiniz kaldi.");
                    tahminSayisi++;
                    tahmin(sayi);

                }
                if (counter == 0) {
                    System.out.println("Hakkiniz bitmistir");
                    break;
                }

            } while (tahminEdilenFilm.equalsIgnoreCase(filmListesi.get(sayi)));

        }
    }

