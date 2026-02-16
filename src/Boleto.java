/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 16/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 12 - Crie uma interface Pagamento com o método pagar(), e implemente-a nas classes CartaoCredito e Boleto. 
//=================================================================================================================================


public class Boleto implements Pagamento {

    private int numeroCobranca;

    public Boleto(int numeroCobranca) {

        this.numeroCobranca = numeroCobranca;

    }

    @Override
    public void pagar() {
        
        System.out.printf("Cobranca %d. Pagamento: Boleto\n", numeroCobranca);
        
    } 

}
