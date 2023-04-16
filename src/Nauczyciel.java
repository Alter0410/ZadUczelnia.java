public class Nauczyciel {
    private String Id;
    private String Imie;
    private String Nazwisko;
    private String Miejscowosc;
    private String Pesel;

    public Nauczyciel(){};
    public Nauczyciel(String Id, String Imie, String Nazwisko, String Miejscowosc, String Pesel){
        this.Id = Id;
        this.Imie = Imie;
        this.Nazwisko = Nazwisko;
        this.Miejscowosc = Miejscowosc;
        this.Pesel = Pesel;
    }

    public String getId() {
        return Id;
    }

    public String getImie() {
        return Imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public String getMiejscowosc() {
        return Miejscowosc;
    }

    public String getPesel() {
        return Pesel;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    public void setMiejscowosc(String miejscowosc) {
        Miejscowosc = miejscowosc;
    }

    public void setPesel(String pesel) {
        Pesel = pesel;
    }

    @Override
    public String toString() {
        return "Nauczyciel{" +
                "Id='" + Id + '\'' +
                ", Imie='" + Imie + '\'' +
                ", Nazwisko='" + Nazwisko + '\'' +
                ", Miejscowosc='" + Miejscowosc + '\'' +
                ", Pesel='" + Pesel + '\'' +
                '}';
    }
}
