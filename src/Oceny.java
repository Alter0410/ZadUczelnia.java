public class Oceny {
    private String Id;
    private String Ocena;
    private String Komentarz;

    public Oceny(){};
    public Oceny(String Id, String Ocena, String Komentarz){
        this.Id = Id;
        this.Ocena = Ocena;
        this.Komentarz = Komentarz;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getOcena() {
        return Ocena;
    }

    public void setOcena(String ocena) {
        Ocena = ocena;
    }

    public String getKomentarz() {
        return Komentarz;
    }

    public void setKomentarz(String komentarz) {
        Komentarz = komentarz;
    }

    @Override
    public String toString() {
        return "Oceny{" +
                "Id='" + Id + '\'' +
                ", Ocena='" + Ocena + '\'' +
                ", Komentarz='" + Komentarz + '\'' +
                '}';
    }
}
