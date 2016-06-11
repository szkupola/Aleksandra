import Punkt.Point2d;
import Punkt.Point3d;

public class Company{

    public static void main(String args[]){
        Employee[] employer = new Employee[3];
        employer[0] = new Employee();
        employer[1] = new Employee("Staszek", "Kowalski", 34);
        employer[2] = new Employee(employer[1]);
        /*kopiuje dane z poprzendiego pracownika*/

        for(Employee p: employer)
            System.out.println("prac3: "+p.imie+" "+p.nazwisko+" "+p.wiek);

        Point2d punktA = new Point2d(7, 5);
        Point3d punktB = new Point3d (1, 2, 3);


        System.out.println("Współrzędne 2D: "+punktA.x+" "+punktA.y);
        System.out.println("Współrzędne 3D: "+punktB.x+" "+punktB.y+" "+punktB.z);


    }
}