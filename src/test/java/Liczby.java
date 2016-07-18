/**
 * Created by Aleksandra on 2016-07-18.
 * 1. Napisać program, który wczytuje od użytkownika liczby, do momentu aż zostanie podana liczba 150.
 Po zakończeniu działania programu wyświetlona zostaje informacja o sumie oraz średniej z wszystkich
 podanych liczb (poza 150) oraz jak wiele podanych zostało liczb dodatnich, podzielnych przez 3.
 Przykład:
 4 2 3 6 1 6 1 0
 Wynik:
 7 1 2
 */

import java.util.Scanner;
public class Liczby {

    public static void main(String args[]){

        System.out.println("Podaj dowolną sekwencję liczb, a następnie podaj 150");
        int suma = 0;
        int liczbaLiczb = 0;
        int liczbaLiczbPodzielnychPrzez3 = 0;

        while(true){
            Scanner input = new Scanner(System.in);
            int liczba;
            liczba = input.nextInt();
            if(liczba == 150){
                break;
            }
            suma = suma + liczba;
            liczbaLiczb = liczbaLiczb + 1; //może być też krócej czyli liczbaLiczb++
            if(liczba > 0 && (liczba % 3) == 0){//reszta z dzielienia przez 3
                liczbaLiczbPodzielnychPrzez3++;
            }
        }

        System.out.println("suma wszystkich liczb to: "+suma);
        System.out.println("średnia wszystkich liczb to: "+((double)suma/liczbaLiczb));
        System.out.println("Liczba liczb dodatnich podzielnych przez 3: "+liczbaLiczbPodzielnychPrzez3);
    }
}
