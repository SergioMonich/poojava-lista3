/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 16/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 8 - Crie uma interface OperacoesMatematicas com os métodos somar(), subtrair(), multiplicar() e dividir(), e implemente-a na classe Calculadora. 
//=================================================================================================================================


public class Calculadora implements OperacoesMatematicas {

    @Override
    public void dividir() {
        
        System.out.println("Calculadora está DIVIDINDO");
        
    }

    @Override
    public void multiplicar() {
        
        System.out.println("Calculadora está MULTIPLICANDO");
        
    }

    @Override
    public void somar() {
        
        System.out.println("Calculadora está SOMANDO");
        
    }

    @Override
    public void subtrair() {
        
        System.out.println("Calculadora está SUBTRAINDO");
        
    }

}
