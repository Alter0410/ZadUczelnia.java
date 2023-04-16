public class Uczen {
    private String Id;
    private String Imie;
    private String Nazwisko;
    private String Miejscowosc;
    private String Pesel;
    private String Klasa;

    public Uczen() {
    }

    ;

    public Uczen(String Id, String Imie, String Nazwisko, String Miejscowosc, String Pesel, String Klasa) {
        this.Id = Id;
        this.Imie = Imie;
        this.Nazwisko = Nazwisko;
        this.Miejscowosc = Miejscowosc;
        this.Pesel = Pesel;
        this.Klasa = Klasa;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    public String getMiejscowosc() {
        return Miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        Miejscowosc = miejscowosc;
    }

    public String getPesel() {
        return Pesel;
    }

    public void setPesel(String pesel) {
        Pesel = pesel;
    }

    public String getKlasa() {
        return Klasa;
    }

    public void setKlasa(String klasa) {
        Klasa = klasa;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "Id='" + Id + '\'' +
                ", Imie='" + Imie + '\'' +
                ", Nazwisko='" + Nazwisko + '\'' +
                ", Miejscowosc='" + Miejscowosc + '\'' +
                ", Pesel='" + Pesel + '\'' +
                ", Klasa='" + Klasa + '\'' +
                '}';
    }
}


