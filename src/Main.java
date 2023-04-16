public class Main {
    public static void main(String[] args) {

       /* 1. Stwórz klasę Nauczyciel z polami: id, imie, nazwisko, miejscowość, pesel. Dla klas zdefiniuj także toString() –
        dzięki, której wyświetlisz informację o obiektach w konsoli.
        2. Stwórz klasę Uczeń z polami: id, imie, nazwisko, miejscowość, pesel, klasa. Dla klas zdefiniuj także toString() –
        dzięki, której wyświetlisz informację o obiektach w konsoli.
        3. Stwórz klasę Uczelnia z polami: id, nazwa, miejscowość, opis. Dla klas zdefiniuj także toString() –
        dzięki, której wyświetlisz informację o obiektach w konsoli.
        4. Stwórz klasę Kierunek z polami: id, nazwa, opis. Dla klas zdefiniuj także toString() –
        dzięki, której wyświetlisz informację o obiektach w konsoli.
        5. Stwórz klasę Oceny z polami: id, ocena, komentarz. Dla klas zdefiniuj także toString() –
        dzięki, której wyświetlisz informację o obiektach w konsoli.
        */

        Nauczyciel nauczyciel = new Nauczyciel("024", "Artur", "Tomaszewski", "Gdynia", "92140555187");
        Uczen uczen = new Uczen("012", "Michał", "Mazurek", "Rumia", "00212558665", "2B Techniukum");
        Uczelnia uczelnia = new Uczelnia("214", "PZS w Redzie", "Reda", "Powiatowy zespół szkół techniczno mundurowych w Redzie");
        Kierunek kierunek = new Kierunek("02", "Technik Geodeta", "Klasa techniczna z specjalizacją w kierunku geodezyjnym");
        Oceny oceny = new Oceny("15", "4", "Sprawdzian z trygonometri w terenie");

        System.out.println(nauczyciel.toString() + "\n" + uczen.toString() + "\n"
        + uczelnia.toString() + "\n" + kierunek.toString() + "\n" + oceny.toString());



    }
}