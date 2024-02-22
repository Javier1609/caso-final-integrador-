import java.util.Scanner;
import java.text.DecimalFormat;
public class caso_final_integrador {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en segundos:  ");
        double   segs = scanner.nextDouble();
        double  minutos = segs/60;
        double  horas = minutos/60;
        double dias = horas/24;
        double meses = dias/30; ;
        double  años = meses/12;
        double tiempo_fuera_de_tierra = 1.2;



        System.out.println("El tiempo en la tierra es de : " + segs + " segundos" );
        System.out.println("El tiempo en minutos en la tierra es de : " + minutos + " minutos" );
        System.out.println("El tiempo en horas en la tierra es de : " + horas + " horas" );
        System.out.println("El tiempo en dias en la tierra es de : " + dias + " dias" );
        System.out.println("El tiempo en meses en la tierra es de : " + meses + " meses" );
        System.out.println("El tiempo en años en la tierra  es de : " + años + " años" );
        System.out.println("-----------------------------------------------------------------");

        double segs2 = segs * tiempo_fuera_de_tierra;
        double min2 = minutos * tiempo_fuera_de_tierra;
        double hor2 = horas * tiempo_fuera_de_tierra;
        double dia2 = dias * tiempo_fuera_de_tierra;
        double mes2 = meses * tiempo_fuera_de_tierra;
        double año2 = años * tiempo_fuera_de_tierra;

        System.out.println("El tiempo en minutos fuera de la tierra es de : " + segs2 + " segundos" );
        System.out.println("El tiempo en minutos fuera de la tierra es de : " + min2 + " minutos" );
        System.out.println("El tiempo en horas fuera de la tierra es de : " + hor2 + " horas" );
        System.out.println("El tiempo en dias fuera de la tierra es de : " + dia2 + " dias" );
        System.out.println("El tiempo en meses fuera de la tierra es de : " + mes2 + " meses" );
        System.out.println("El tiempo en años fuera de la tierra  es de : " + año2 + " años" );



    }
}
