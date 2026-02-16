/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 16/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 6 - Crie uma interface Nadador e Corredor, implemente ambas na classe Triatleta. 
//=================================================================================================================================


public class Triatleta implements Nadador, Corredor {

    @Override
    public void nadar() {
        
        System.out.println("Triatleta esta NADANDO");
        
    }

    @Override
    public void correr() {
        
        System.out.println("Triatleta esta CORRENDO");
        
    } 

}
