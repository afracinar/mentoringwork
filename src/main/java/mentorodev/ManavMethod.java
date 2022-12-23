package mentorodev;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ManavMethod {

    public void musteriSecimi(List<String> urunler, List<Double> fiyatlar){

        Scanner input = new Scanner(System.in);
        double toplamOdenecekTutar =0;
double kasaToplam = 0;


        do {

            System.out.println("Kaç numaralı üründen almak istiyorsunuz ?");
            int no = input.nextInt();



            if (no==1 || no==2 || no==3 || no==4 || no==5){

                System.out.println("Kaç kilo almak istiyorsunuz?");
                double kilo = input.nextDouble();
                double urunTutarı = fiyatlar.get(no-1);
                double urunToplamTutar = kilo*urunTutarı;
                toplamOdenecekTutar+=urunToplamTutar;

            }else{
                System.out.println(no+". Üründen kalmamıştır.");
            }


            System.out.println("Başka bir ürün isterseniz 1'e istemezseniz 2'ye basınız.");
            int secim = input.nextInt();

            if (secim==1){
                double kilo = input.nextDouble();
                musteriSecimi(urunler,fiyatlar);
                kasa(toplamOdenecekTutar,kasaToplam);
            }else{

                double kilo = input.nextDouble();
                kasa(toplamOdenecekTutar,kasaToplam);

            }
            kasaToplam+=toplamOdenecekTutar;

        }while(true);

    }

    public static void kasa(double toplamOdenecekTutar,double kasaToplam){
        kasaToplam+=toplamOdenecekTutar;
        System.out.println("Alışveriş tutarı: "+kasaToplam);
    }


    }
