package textos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.MessageFormat;

public class ConcatenacaoTest {

    @Test
    void deveConcatenarInvesMostrarTextoENumero(){

        String str = "Entry#";
        int index = 5;

        /*leitura de esquerda para direita sem uso de parenteses
        prevalece a concatenação*/

        String result = str + index + 1;

        Assertions.assertEquals("Entry#51", result);

    }

    @Test
    void deveMostrarTextoENumero(){

        String str = "Entry#";
        int index = 5;

        String result = str + (index + 1);//mostra string + resultado soma

        //System.out.println(result);
        Assertions.assertEquals("Entry#"+6, result);

    }

    @Test
    void deveMostrarTextoENumeroUsandooStringFormat(){

        String str = "Entry#";
        int index = 5;

        /*funciona porém pode degrada um pouco a performance usando String.format*/
        String result = String.format("Entry#%d",index+1);//forma1
        String result2 = MessageFormat.format("Entry#{0}", index+1);//forma2

        //System.out.println(result);
        Assertions.assertEquals("Entry#"+6, result);
        Assertions.assertEquals("Entry#"+6, result2);


    }

    @Test
    void deveMostrarTextoENumeroUsandooMessageFormat(){

        String str = "Entry#";
        int index = 5;

        /*funciona porém pode degrada um pouco a performance usando MessageFormat*/
        String result2 = MessageFormat.format("Entry#{0}", index+1);//forma2

        //System.out.println(result);
        Assertions.assertEquals("Entry#"+6, result2);


    }

}
