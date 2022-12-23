package lmsodev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LMSOdev {

    //Kullanıcıdan int öğelerini girmesini ve listeye öğe eklemesini istemek için kod yazınız.
    //Kullanıcıdan kaldırılacak öğeleri girmesini isteyin,ardından bu öğeleri listeden kaldırın
    //Kullanıcıdan güncellemek için öğeleri girmesini isteyin,ardından güncelleyin

    public static void main(String[] args) {

        List<Integer> team07 = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String islem;


        do {
            System.out.println("Oge eklemek istiyorsaniz ekle \n silmek istiyorsaniz sil \n guncellemek istiyorsaniz guncelle yaziniz \n cikimak icin cikis yaziniz");

            islem = input.next().toLowerCase();
            switch(islem){
                case "ekle":
                    System.out.println("Girmek istediginiz ogeyi yazin");
                    int eklenenOge =input.nextInt();
                    team07.add(eklenenOge);
                    break;
                case "sil":
                    System.out.println("Silmek istediginiz ogeyi yaziniz");
                    int silinenOge =input.nextInt();
                    int idx3 = team07.indexOf(silinenOge);
                    team07.remove(idx3);
                    break;
                case "guncelle":
                    System.out.println("Guncellemek istediginiz ogeyi yaziniz");
                    int guncellenenOge =input.nextInt();
                    int idx = team07.indexOf(guncellenenOge);
                    System.out.println("Hangi sayi ile guncellemek istersiniz?");
                    int idx2 = input.nextInt();
                    team07.set(idx,idx2);
                    break;
                case "cikis":
                    System.out.println("Cikis yapilmistir");
                    break;
                default:
                    System.out.println("Gecersiz bir parametre girdiniz");
                    break;
            }
            System.out.println(team07);
        } while (!islem.equals("cikis"));

    }

}
