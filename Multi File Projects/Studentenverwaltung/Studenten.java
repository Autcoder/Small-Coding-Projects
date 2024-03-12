package Studentenverwaltung;

public class Studenten {
    private String name;
    private String vorname;
    private int matrikelnummer;
    private String studiengang;

    public Studenten(String name, String vorname, int matrikelnummer, String studiengang) {
        this.name = name;
        this.vorname = vorname;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }
    public String toString(){
        return name + " " + vorname + " " + matrikelnummer + " " + studiengang;
    }
    public String getName() {
        return name;
    }
    public String getVorname() {
        return vorname;
    }
    public int getMatrikelnummer() {
        return matrikelnummer;
    }
    public String getStudiengang() {
        return studiengang;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }
    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }
}
