package depoyonetimi;

public class Urunler {

   private String ıd;
   private String isim;
   private String uretici;
   private int miktar;
   private String birim;
   private String raf;

    public Urunler(String ıd, String isim, String uretici, int miktar, String birim, String raf) {
        this.ıd = ıd;
        this.isim = isim;
        this.uretici = uretici;
        this.miktar = miktar;
        this.birim = birim;
        this.raf = raf;
    }

    public String getId() {
        return ıd;
    }

    public void setId(String ıd) {
        this.ıd = ıd;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }
}
