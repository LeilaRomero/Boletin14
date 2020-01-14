package boletin14;

import java.util.Scanner;

/**
 *
 * @author Leila
 */
public class Boletin14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        float temperaturaCentigrados1, temperaturaCentigrados2;
        ConversorTemperaturas obj=new ConversorTemperaturas();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca los grados Fahrenheit");
        temperaturaCentigrados1=sc.nextFloat();
        System.out.println("Introduzca los grados Reamur");
        temperaturaCentigrados2=sc.nextFloat();

        try{
            System.out.println(obj.centigradosAFharenher(temperaturaCentigrados1));
        }catch(TemperaturaErradaExcepcion es){
            System.out.println("La temperatura es: "+ es.getMessage());
        }
        try{
            obj.centígradosAReamur(temperaturaCentigrados2);
        }catch(TemperaturaErradaExcepcion es){
            System.out.println(es.getMessage());
        }
    }
    
}
