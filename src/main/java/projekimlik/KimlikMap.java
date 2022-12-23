package projekimlik;

import java.util.HashMap;
import java.util.Scanner;

public class KimlikMap {

    /*
                     1) Kullanicidan kimlik numarasini(4 haneli), tam ismini, adresini, telefonunu, alin
                     2) Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin

                     saveInfo() method olusturun:
                     3)Kullanicidan bircok kimlik numarasi(4 haneli), isim, adres ve telefon alin.
                     4)Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin.
                     5)Ayni kimlik numarasi ile bilgi girilmesine engel olun.

                	 getInfo() method olusturun:
          		     1)Kimlik numarasini girerek kullanicinin bilgilerine ulasin.
                     2)Olmayan kimlik numarasi girilirse kullaniciya hata mesaji verin.

                     removeInfo() method olusturun:
                     1)Kimlik numarasini girerek data silin.
                     2)Girilen kimlik numarasi yoksa kullaniciya hata mesaji verin.
                     3)Collection bos ise kullaniciya hata mesaji verin.

                     selectOption() method olusturun:
                     1)Yukaridaki 3 methodu programi sonlandirana kadar secme hakki verin
               */


    static Scanner input = new Scanner(System.in);
    static HashMap<String,String> map = new HashMap<>();

    public static void main(String[] args) {
        selectOption();
    }

    private static void saveInfo(){
        System.out.println("Lütfen 4 haneli kimlik numaranızı giriniz");
        String tc = input.next();
        input.nextLine();  //bunun mantığı ne ??? araya bir tane boş nextLine atılması gerekiyor

        if (map.containsKey(tc)){
            System.out.println("Bu tc numarası sistemde vardır.");
            saveInfo();
        }else{
            System.out.println("Adınızı giriniz");
            String isim = input.nextLine();

            System.out.println("Soyadınızı giriniz");
            String soyİsim = input.nextLine();

            System.out.println("Lütfen adresi giriniz");
            String adres = input.nextLine();

            System.out.println("Lütfen telefon numaranızı giriniz");
            String tel = input.nextLine();

            String values = isim + " " + soyİsim + " " +adres+ " "+tel;
            map.put(tc,values);
            System.out.println("Tebrikler doğru girdiniz.."+ map);
            selectOption();
        }
    }

    private static void getInfo(){
        System.out.println("Lütfen tc'nizi giriniz");
        String arananTc=input.next();

        if (map.containsKey(arananTc)){
            System.out.println(map.get(arananTc));
        }else{
            System.out.println("Aradığınız tc'ye sahip şahıs yoktur \nTekrar deneyizniz");
            getInfo();
        }
        selectOption();
    }

    private static void removeInfo(){
        System.out.println("Lütfen silmek istediğiniz kimlik numaranızı giriniz");
        String tc = input.next();

        if (map.containsKey(tc)){
            map.remove(tc);
            System.out.println("Tc'niz başarıyla silindi"+map);
            selectOption();
        }else{
            System.out.println("Aradiginiz tc sahip sahis yoktur.\n Tekrar deneyiniz");
            removeInfo();
            selectOption();
        }

    }

    private static void cikis(){
        System.out.println("Görüşmek üzereee");
    }

    private static void selectOption(){
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz. \n1)Kullanıcı ekle \n2)Kullanıcı bilgilerini alma \n3)Kullanıcıyı sil \n4)Çıkış");
        int secim = input.nextInt();

        switch (secim){
            case 1:
                saveInfo();
                break;
            case 2:
                getInfo();
                break;
            case 3:
                removeInfo();
                break;
            case 4:
                cikis();
                break;
            default:
                System.out.println("Olmayan bir seçim yaptınız");
                selectOption();
                break;

        }

    }




}
