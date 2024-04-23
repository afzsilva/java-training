package textos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BlocosTextuaisTest {

    /*
    Feature possivel apos java 15
    * */
    @Test
    void deveMostrarEstrutuaBasicaHtmlSubstituindoParametros(){

        String resultado = """
                <html>
                    <title>$titulo$</title>
                    <body>
                        <p>Seja bem vindo $usuario$</p>
                    </body>
                </html>
                """.replace("$titulo$","Aprendendo Java").replace("$usuario$","Steve Jobs");



        String esperado = """
                <html>
                    <title>Aprendendo Java</title>
                    <body>
                        <p>Seja bem vindo Steve Jobs</p>
                    </body>
                </html>
                """;

        Assertions.assertEquals(esperado, resultado);



    }
}
