package java8.optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;
//https://www.baeldung.com/java-optional
public class OptionalGuideTest {

    @Test
    void deveRetornarUmValorPresenteEmObejtoOptional(){
        String valorTextual = "Ola mundo";
        Optional<String> opt = Optional.of(valorTextual);

        Assertions.assertTrue(opt.isPresent());
        Assertions.assertNotNull(valorTextual);

    }


    @Test
    void deveRetornarVazioQuandoStringNull(){
        String valorTextual = null;
        Optional<String> opt = Optional.ofNullable(valorTextual);

         Assertions.assertTrue(opt.isEmpty());

    }

    @Test
    void deveRetornarValorDefaultQuandoNull(){
        String nameNull = null;
        String name = Optional.ofNullable(nameNull).orElse("Outros");
        Assertions.assertEquals("Outros", name);
    }

    @Test
    void deveNaoRetornarValorDefault(){
        String mensagem = "mensagem com conteudo";
        String nameNoNull = mensagem;
        String name = Optional.ofNullable(nameNoNull).orElse("Outros");
        Assertions.assertEquals("mensagem com conteudo", name);
    }
}
