import org.junit.Assert;
import org.junit.Test;
import questao02.Questao02;

public class Questao02Test {

    @Test
    public void deveInformarCorretamenteONumeroDeCaracteresASeremAdicionadosEmSenhaQuandoFaltar3Caracteres(){
        Questao02 questao02 = new Questao02();

        int saidaEsperada = 3;

        int retorno = questao02.numeroDeCaracteresASerAdicionadoEmSenha("Ya3");

        System.out.println(retorno);

        Assert.assertEquals(saidaEsperada, retorno);
    }

    @Test
    public void deveRetornarZeroQuandooNumeroDeCaracteresForIgualASeis(){
        Questao02 questao02 = new Questao02();

        int saidaEsperada = 0;

        int retorno = questao02.numeroDeCaracteresASerAdicionadoEmSenha("Yaf5j@");

        System.out.println(retorno);

        Assert.assertEquals(saidaEsperada, retorno);
    }
    @Test
    public void deveRetornarZeroQuandooNumeroDeCaracteresForMaiorQueSeis(){
        Questao02 questao02 = new Questao02();

        int saidaEsperada = 0;

        int retorno = questao02.numeroDeCaracteresASerAdicionadoEmSenha("Yaf5jh@k115");

        System.out.println(retorno);

        Assert.assertEquals(saidaEsperada, retorno);
    }

    @Test
    public void deveRetornarTrueQuandoSenhaTiverPeloMenosUmDigito(){
        Questao02 questao02 = new Questao02();
       Assert.assertTrue(questao02.senhaTemNoMininoUmNumero("seGt8adv@"));
    }

    @Test
    public void deveRetornarFalseQuandoSenhaNaoTiverPeloMenosUmDigito(){
        Questao02 questao02 = new Questao02();
        Assert.assertFalse(questao02.senhaTemNoMininoUmNumero("seGtadv@"));
    }

    @Test
    public void deveRetornarTrueQuandoSenhaTemNoMinimoUmaLetraMinuscula(){
        Questao02 questao02 = new Questao02();
        Assert.assertTrue(questao02.senhaTemNoMinimoUmaLetraMinuscula("AASSaS@3DD"));
    }


    @Test
    public void deveRetornarFalseQuandoSenhaNaoTiverNoMinimoUmaLetraMinuscula(){
        Questao02 questao02 = new Questao02();
        Assert.assertFalse(questao02.senhaTemNoMinimoUmaLetraMinuscula("AASSAS@3DD"));
    }

    @Test
    public void deveRetornarTrueQuandoSenhaTemNoMinimoUmaLetraMaiuscula(){
        Questao02 questao02 = new Questao02();
        Assert.assertTrue(questao02.senhaTemNoMinimoUmaLetraMaiuscula("aassaS@3dd"));
    }


    @Test
    public void deveRetornarFalseQuandoSenhaNaoTiverNoMinimoUmaLetraMaiuscula(){
        Questao02 questao02 = new Questao02();
        Assert.assertFalse(questao02.senhaTemNoMinimoUmaLetraMaiuscula("aassaf@3dd"));
    }

    @Test
    public void deveRetornarTrueQuandoSenhaTemNoMinimoUmCaractereEspecial(){
        Questao02 questao02 = new Questao02();
        Assert.assertTrue(questao02.senhaTemNoMinimoUmCaractereEspecial("aassaS@3dd"));
    }


    @Test
    public void deveRetornarFalseQuandoSenhaNaoTiverNoMinimoUmCaractereEspecial(){
        Questao02 questao02 = new Questao02();
        Assert.assertFalse(questao02.senhaTemNoMinimoUmCaractereEspecial("aassafvcdd"));
    }
}
