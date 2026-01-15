package org.example.oo.construtoresprivate;

public class MainConstrutorPrivate {

    public static void main(String[] args) {

        //EmissorDocumento.escrever();
       // EmissorDocumento.ler();
        String x = EmissorDocumento.tentar();

        assert(x != null):"Não Existe conteudo";


    }
}
