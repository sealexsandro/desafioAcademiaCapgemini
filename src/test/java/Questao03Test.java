import org.junit.Assert;
import org.junit.Test;

import questao03.Questao03;


public class Questao03Test {

    @Test
    public void deveRetornarONumeroCorretoDeAnagramasQuandoHouverTresAnagramas(){
        Questao03 questao03 = new Questao03();

        int saidaEsperada = 3;

        int retorno = questao03.contadorDeAnagramas("ifailuhkqq");

        System.out.println(retorno);

        Assert.assertEquals(saidaEsperada, retorno);
    }


    @Test
    public void deveRetornarONumeroCorretoDeAnagramasQuandoHouverNoveAnagramas(){
        // Palavra = alvvla
        //exemplo de pares: [a, a] ,[l, l], [v, v], [al, la], [alv, vla], [alvv, vvla], [alvvl, lvvla], [lv, vl], [lvv, vvl]

        Questao03 questao03 = new Questao03();

        int saidaEsperada = 9;

        int retorno = questao03.contadorDeAnagramas("alvvla");

        System.out.println(retorno);

        Assert.assertEquals(saidaEsperada, retorno);
    }

    @Test
    public void deveRetornarZeroQuandoNaoHouverNenhumAnagrama(){
        Questao03 questao03 = new Questao03();

        int saidaEsperada = 0;

        int retorno = questao03.contadorDeAnagramas("abcd");

        System.out.println(retorno);

        Assert.assertEquals(saidaEsperada, retorno);
    }

}
