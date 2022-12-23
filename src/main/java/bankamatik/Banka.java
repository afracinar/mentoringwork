package bankamatik;

import java.util.*;

public class Banka {

    public static void main(String[] args) {

        //1.ADIM
        HashMap<Integer,Integer> müsteriBilgileri = new HashMap<>();
        System.out.println(" Müş.no"+"--Şifre");
        System.out.println("***************");

        müsteriBilgileri.put(12345678,1876);
        müsteriBilgileri.put(22222222,1234);
        müsteriBilgileri.put(98765432,1453);
        müsteriBilgileri.put(55554444,2020);

        Set<Map.Entry<Integer,Integer>> entries = müsteriBilgileri.entrySet();
        for (Map.Entry<Integer,Integer> w : entries){
            System.out.println(w);
        }

        //2.ADIM
        HashMap<Integer,Float> hesaptaPara = new HashMap<>();
        System.out.println(" Müş.no"+"--Para");
        hesaptaPara.put(12345678,120.0f);
        hesaptaPara.put(22222222,3000.0f);
        hesaptaPara.put(98765432,7000.0f);
        hesaptaPara.put(55554444,50.0f);
        Set<Map.Entry<Integer,Float>> p = hesaptaPara.entrySet();
          for (Map.Entry<Integer,Float> w : p){
           System.out.println(w);
         }

          //3.ADIM

  //      Scanner input = new Scanner(System.in);



   //     Set<Integer> key = müsteriBilgileri.keySet();
   //     System.out.println(key);

   //     Collection<Integer> value = müsteriBilgileri.values();
   //     System.out.println(value);

        GizliBanka gizliBanka = new GizliBanka();
   //     gizliBanka.setGirisYapanKullanicinMusteriNumarasi(müşno);
   //     System.out.println("Kullanıcının girdiği müşteri numarası:"+gizliBanka.getGirisYapanKullanicinMusteriNumarasi());

   //     gizliBanka.setGirisYapanKullanicininSifresi(sifre);
    //    System.out.println("Kullanıcının girdiği şifre:"+gizliBanka.getGirisYapanKullanicininSifresi());
/*
        for ( Map.Entry<Integer,Integer> w : müsteriBilgileri.entrySet()){

            if (w.getKey()==müşno){
                if (w.getValue()==sifre){
                    System.out.println("Tebrikler");
                    break;
                }else{
                    System.out.println("Şifreyi Yanlış Girdiniz");
                    break;
                }
            }else{
                System.out.println("Müşteri numarası Hatalı");
                break;

            }
*/
        musteriNumarasiDogruMu();
        sifreDogruMu();


        }





    public static void musteriNumarasiDogruMu(){
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen müşteri numaranızı giriniz");
        int müşno = input.nextInt();

        boolean dogruMu = false;
        HashMap<Integer,Integer> müsteriBilgileri = new HashMap<>();
        müsteriBilgileri.put(12345678,1876);
        müsteriBilgileri.put(22222222,1234);
        müsteriBilgileri.put(98765432,1453);
        müsteriBilgileri.put(55554444,2020);
        for (Map.Entry<Integer,Integer> w : müsteriBilgileri.entrySet()){
            if (müşno==w.getKey()){
                dogruMu=true;
                System.out.println("Müşteri numarası==> "+dogruMu);
                break;
            }else{
                System.out.println("Müşteri numarası==> "+dogruMu);
                break;
            }
        }
    }

    public static void sifreDogruMu(){

Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz");
     //   int müşterino;
    //    int sifre;
        int sifre = scan.nextInt();
        int müsternumarası = scan.nextInt();

     //   müşterino=müsternumarası;

        HashMap<Integer,Integer> müsteriBilgileri = new HashMap<>();
        müsteriBilgileri.put(12345678,1876);
        müsteriBilgileri.put(22222222,1234);
        müsteriBilgileri.put(98765432,1453);
        müsteriBilgileri.put(55554444,2020);

        for ( Map.Entry<Integer,Integer> w : müsteriBilgileri.entrySet()){

            if (müsternumarası==w.getKey()){
                if (w.getValue()==sifre){
                    System.out.println("Tebrikler");
                    break;
                }else{
                    System.out.println("Şifreyi Yanlış Girdiniz");
                    break;
                }
            }
            }


    }

}
