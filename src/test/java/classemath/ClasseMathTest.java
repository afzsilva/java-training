package classemath;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ClasseMathTest {

    @Test
    void deveCalcularPotenciaDeUmDadoNumeroAoExpoente(){

        //2x2x2
        Double result = Math.pow(2, 3);

        //3x3x3
        Double result1 = Math.pow(3.0, 3);

        assertEquals(8, result);
        assertEquals(27, result1);
    }

    @Test
    void deveCalcularUsandoNumeroNegativo(){
        //se segundo argumento impa, resultado é negativo
        double result = Math.pow(-2, 3);
        assertEquals(-8,result);
    }

    @Test
    void deveCalcularUsandoNumeroNegativo2(){
        //se segundo argumento par, resultado é positivo
        double result = Math.pow(-3, 2);
        assertEquals(9,result);
    }


    @Test
    void deveCalcularPotenciaElevadaAzero(){
        /*numero elevado a zero resulta sempre em 1*/
        double result = Math.pow(-2, 0);
        double result1 = Math.pow(2, 0);

        assertEquals(1,result);
        assertEquals(1,result1);
    }

}
