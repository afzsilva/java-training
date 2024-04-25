package classemath;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PorcentagemBigDecimalTest {


    @Test
    void deveRetornarPercentualDeUmDadoValorEmRelacaoAoTotal(){

        BigDecimal dadoValor = new BigDecimal("100");
        BigDecimal total = new BigDecimal("1000");

       BigDecimal result = dadoValor.divide(total,4, RoundingMode.UP).scaleByPowerOfTen(2);

        Assertions.assertEquals(new BigDecimal("10.00"),result);
    }
}
