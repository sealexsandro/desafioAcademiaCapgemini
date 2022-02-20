import org.junit.Assert;
import org.junit.Test;
import questao01.Questao01;


public class Questao01Test {

    @Test
    public void deveDesenharAarvoreCorretamenteQuandoBaseEAlturaIgualASeis(){
        Questao01 questao01 = new Questao01();
        String arvoreEsperada ="     *\n" +
                               "    **\n" +
                               "   ***\n" +
                               "  ****\n" +
                               " *****\n" +
                               "******";

        String arvoreDesenhada = questao01.desenharEscada(6);

        System.out.println(arvoreDesenhada);

        Assert.assertEquals(arvoreEsperada, arvoreDesenhada);
    }

    @Test
    public void deveDesenharAarvoreCorretamenteQuandoBaseEAlturaIgualAQuatro(){
        Questao01 questao01 = new Questao01();
        String arvoreEsperada = "   *\n" +
                                "  **\n" +
                                " ***\n" +
                                "****";

        String arvoreDesenhada = questao01.desenharEscada(4);

        System.out.println(arvoreDesenhada);

        Assert.assertEquals(arvoreEsperada, arvoreDesenhada);
    }

    @Test
    public void arvoreDesenhadaDeveSerDiferenteDaArvoreEsperada(){
        Questao01 questao01 = new Questao01();
        String arvoreEsperada = "  *\n" +
                                " **\n" +
                                "***";

        String arvoreDesenhada = questao01.desenharEscada(5);

        System.out.println(arvoreDesenhada);

        Assert.assertNotEquals(arvoreEsperada, arvoreDesenhada);
    }

    @Test
    public void deveDesenharAarvoreCorretamenteQuandoBaseEAlturaIgualAZero(){
        Questao01 questao01 = new Questao01();
        String arvoreEsperada ="";

        String arvoreDesenhada = questao01.desenharEscada(0);

        System.out.println(arvoreDesenhada);

        Assert.assertEquals(arvoreEsperada, arvoreDesenhada);
    }

}
