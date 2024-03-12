package Autoverwaltung;

public class Auto {

    private String marke;
    private String modell;
    private int ps;
    private int kmh;

    @Override
    public String toString() {
        return this.marke + " " + this.modell + " " + this.ps + " " + this.kmh;
    }

    public String getMarke() {
        return marke;
    }
    public void setMarke(String marke) {
        this.marke = marke;
    }
    public String getModell() {
        return modell;
    }
    public void setModell(String modell) {
        this.modell = modell;
    }
    public int getPs() {
        return ps;
    }
    public void setPs(int ps) {
        this.ps = ps;
    }
    public int getKmh() {
        return kmh;
    }
    public void setKmh(int kmh) {
        this.kmh = kmh;
    }

}
