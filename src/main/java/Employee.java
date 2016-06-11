public class Employee {
    String imie;
    String nazwisko;
    int wiek;

    public Employee() {
        imie = "brak danych";
        nazwisko = "brak danych";
        wiek = -1;
    }

    public Employee(String i, String n, int w) {
        imie = i;
        nazwisko = n;
        wiek = w;
    }

    public Employee(String i) {
        imie = i;
        nazwisko = "Smith";
        wiek = -1;
    }

    public Employee(Employee prac) {
        imie = prac.imie;
        nazwisko = prac.nazwisko;
        wiek = prac.wiek;
    }
}
