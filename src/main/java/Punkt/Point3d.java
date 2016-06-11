package Punkt;

public class Point3d extends Point2d {
    public int z;

    public Point3d () {
        super(); /* odnosi sie do klas wyżej z któj dziedziczysz
                this odnosi się do aktualnej klasy*/
        z = 0;
    }
    public Point3d (int x, int y, int z){
        super(x, y);
        this.z = z;
    }
}
