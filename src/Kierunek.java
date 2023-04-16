public class Kierunek {
    private String Id;
    private String Nazwa;
    private String Opis;

    public Kierunek(){};
    public Kierunek(String Id, String Nazwa, String Opis){
        this.Id = Id;
        this.Nazwa = Nazwa;
        this.Opis = Opis;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }

    public String getOpis() {
        return Opis;
    }

    public void setOpis(String opis) {
        Opis = opis;
    }

    @Override
    public String toString() {
        return "Kierunek{" +
                "Id='" + Id + '\'' +
                ", Nazwa='" + Nazwa + '\'' +
                ", Opis='" + Opis + '\'' +
                '}';
    }
}
