/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 16/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 19 - Modifique a interface OperacoesMatematicas adicionando um método default chamado potencia() e implemente-a na classe CalculadoraCientifica. 
//=================================================================================================================================


public class CalculadoraCientifica implements OperacoesMatematicas {

    @Override
    public void dividir() {
        
        System.out.println("Calculadora Científica está DIVIDINDO");
        
    }

    @Override
    public void multiplicar() {
        
        System.out.println("Calculadora Científica está MULTIPLICANDO");
        
    }

    @Override
    public void potencia() {
        
        OperacoesMatematicas.super.potencia();

    }

    @Override
    public void somar() {
        
        System.out.println("Calculadora Científica está SOMANDO");
        
    }

    @Override
    public void subtrair() {
        
        System.out.println("Calculadora Científica está SUBTRAINDO");
        
    }

}
