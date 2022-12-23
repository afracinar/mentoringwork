package filmproje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilmDüzenleme {

    static Scanner input = new Scanner(System.in);
    static List<String> filmListesi = new ArrayList<>(Arrays.asList("es","Zindan Adasi","Titanic","Kuzularin Sessizligi","Harry Potter","Dabbe","Sessiz Yer","Piyanist","Cizgili Pijamali Cocuk"));
    static int sayi;
    static int hakSayisi = (filmListesi.get(sayi).length()) * 2;
    static int counter = 0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 0 ile 7 arasinda bir sayi seciniz");
        sayi = input.nextInt();

        System.out.println("Sectiginiz filmin harf sayisi :" + (filmListesi.get(sayi).length()));
        hakSayisi = (filmListesi.get(sayi).length()) * 2;
        System.out.println("Toplam hak Sayiniz = " + hakSayisi);
        tahmin();

    }
    public static void tahmin() {
        String tahminEdilenFilm;
        do {
            counter++;
            System.out.println("Lutfen sectiginiz filmin adini tahmin ediniz");
            tahminEdilenFilm = input.nextLine();

            if (tahminEdilenFilm.equalsIgnoreCase(filmListesi.get(sayi))) {
                System.out.println("Tebrikler!!!..Dogru tahmin ettiniz.");
                System.out.println("Yanlış tahmin sayınız: "+(counter-1)+" -->" +counter+ ". denemede doğru tahminde bulundunuz");
                break;

            } else {
                System.out.println("Üzgünüm tahmininiz doğru değil");
                hakSayisi--;
                System.out.println("Yanlış tahmin sayınız= " +counter);

                System.out.println(hakSayisi + " hakkiniz kaldi.");
                if (hakSayisi == 0) {
                    System.out.println("Hakkiniz bitmistir");
                    break;
                }
                tahmin();
            }
        } while (tahminEdilenFilm.equalsIgnoreCase(filmListesi.get(sayi)));
    }
}
