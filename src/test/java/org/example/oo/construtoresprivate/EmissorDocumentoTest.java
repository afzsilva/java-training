package org.example.oo.construtoresprivate;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;


class EmissorDocumentoTest {




    @Test
    void escrever() {

        try (MockedStatic<EmissorDocumento> emissorDocumentoMockedStatic= Mockito.mockStatic(EmissorDocumento.class)){

            //action
            EmissorDocumento.escrever();

            //Assertion
            emissorDocumentoMockedStatic.verify(()-> EmissorDocumento.escrever(),Mockito.times(1));
        }



    }

    @Test
    void ler() {
    }

    @Test
    void tentar() {
    }
}