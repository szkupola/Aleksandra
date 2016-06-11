package Punkt;

/**
 2.6 Stwórz klasę Punkt2D, która przechowuje informacje na temat punktu na przestrzeni dwuwymiarowej
 (współrzędne x oraz y). Zawierająca dwa konstruktory: bezparametrowy ustawiający pola na wartość 0,
 oraz przyjmujący dwa argumenty i ustawiający pola obiektu zgodnie z podanymi parametrami.

 Napisz klasę Punkt3D dziedziczącą po Punkt2D, reprezentującą punkt w trójwymiarze (dodatkowe pole z).

 W klasie testowej utwórz obiekty obu klas i przetestuj działanie.
 */
public class Point2d {
    public int x;
    public int y;

    public Point2d  (){
        x = 0;
        y = 0;
    }
    public Point2d  (int x, int y){
        this.x = x;
        this.y = y;
    }
}

