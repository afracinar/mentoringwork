package bankamatik;

public class GizliBanka {

    private int girisYapanKullanicinMusteriNumarasi = 0;
   private float girisYapanKullanicinHesabindakiPara = 0;
   private int girisYapanKullanicininSifresi =0;

    public int getGirisYapanKullanicinMusteriNumarasi() {
        return girisYapanKullanicinMusteriNumarasi;
    }

    public void setGirisYapanKullanicinMusteriNumarasi(int girisYapanKullanicinMusteriNumarasi) {
        this.girisYapanKullanicinMusteriNumarasi = girisYapanKullanicinMusteriNumarasi;
    }

    public float getGirisYapanKullanicinHesabindakiPara() {
        return girisYapanKullanicinHesabindakiPara;
    }

    public void setGirisYapanKullanicinHesabindakiPara(float girisYapanKullanicinHesabindakiPara) {
        this.girisYapanKullanicinHesabindakiPara = girisYapanKullanicinHesabindakiPara;
    }

    public int getGirisYapanKullanicininSifresi() {
        return girisYapanKullanicininSifresi;
    }

    public void setGirisYapanKullanicininSifresi(int girisYapanKullanicininSifresi) {
        this.girisYapanKullanicininSifresi = girisYapanKullanicininSifresi;
    }
}
