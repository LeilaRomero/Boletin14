package boletin14;

/**
 *
 * @author Leila
 */
public class ConversorTemperaturas {

    private static float temperatura = 80;

    float temperaturaFahrenheit, temperaturaReamur;

    public float centigradosAFharenher(float Centigrados) throws TemperaturaErradaExcepcion {

        if (Centigrados < temperatura) {
            throw new TemperaturaErradaExcepcion("La temperatura Fahrenheit tiene que ser mayor a 80ºC");
            
        } else {
            temperaturaFahrenheit = (9f / 5f) * Centigrados + 32.4f;
            System.out.println("La temperatura en Fahrenheit es de: "+temperaturaFahrenheit);
            
        }
        return temperaturaFahrenheit;
    }

    public void centígradosAReamur(float Centigrados) throws TemperaturaErradaExcepcion {

        if (Centigrados < temperatura) {
            throw new TemperaturaErradaExcepcion("La temperatura Reamur tiene que ser mayor a 80ºC");
        } else {
            temperaturaReamur = (4f / 5f) * Centigrados;
            System.out.println("La temperatua en Reamur es de: "+temperaturaReamur);

        }

    }
}
