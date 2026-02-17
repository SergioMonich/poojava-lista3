/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 17/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 22 - Crie uma interface Banco que retorna a taxa de juros atual e implemente-a na classe ContaPoupanca. 
//=================================================================================================================================


public class ContaPoupanca implements Banco {

    private double saldo;

    public ContaPoupanca(double saldo) {
        
        this.saldo = saldo;

    }

    @Override
    public void depositar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void sacar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public double taxaJurosAtual() {
        
        System.out.println("Taxa de juros atual: " + Banco.super.taxaJurosAtual());
        return Banco.super.taxaJurosAtual();
    }

    @Override
    public void verSaldo() {
        // TODO Auto-generated method stub
        
    }  

}
