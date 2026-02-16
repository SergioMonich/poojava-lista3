/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 16/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 7 - Crie uma interface Banco com métodos sacar(), depositar() e verSaldo(), e implemente-a na classe ContaCorrente. 
//=================================================================================================================================


public class ContaCorrente implements Banco {

    private int numeroConta;

    public ContaCorrente(int numeroConta) {

        this.numeroConta = numeroConta;
        
    }

    @Override
    public void depositar() {
        
        System.out.printf("Conta %s fez um DEPOSITO\n", numeroConta);
        
    }

    @Override
    public void sacar() {
        
        System.out.printf("Conta %s fez um SAQUE\n", numeroConta);
        
    }

    @Override
    public void verSaldo() {
        
        System.out.printf("SALDO da conta %s\n", numeroConta);
        
    }

    

}
