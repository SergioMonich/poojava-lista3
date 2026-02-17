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


//=================================================================================================================================
// EX 22 - Crie uma interface Banco que retorna a taxa de juros atual e implemente-a na classe ContaPoupanca. 
//=================================================================================================================================


public interface Banco {

    public void sacar();
    public void depositar();
    public void verSaldo();
    default double taxaJurosAtual() {
        
        return 0.05; 
        
    }

}
