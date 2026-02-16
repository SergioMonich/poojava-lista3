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


//=================================================================================================================================
// EX 18 - Modifique a interface Pagamento adicionando um método default chamado cancelarPagamento() e implemente-a nas classes CartaoCredito e Pix. 
//=================================================================================================================================


public interface Pagamento {

    public void pagar();
    default void cancelarPagamento() {

        System.out.printf("Cancelando cobrança\n");

    }

}
