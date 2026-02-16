/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 16/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 18 - Modifique a interface Pagamento adicionando um método default chamado cancelarPagamento() e implemente-a nas classes CartaoCredito e Pix. 
//=================================================================================================================================


public class Pix implements Pagamento {

    @Override
    public void cancelarPagamento() {
        
        Pagamento.super.cancelarPagamento();

    }

    @Override
    public void pagar() {
        
        System.out.printf("Pagamento: PIX\n");
        
    }

}
