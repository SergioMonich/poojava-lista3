/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 17/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 28 - Crie uma interface Movivel com os métodos moverParaFrente() e moverParaTras(), implemente-a na classe Robo. 
//=================================================================================================================================


public class Robo implements Movivel {

    @Override
    public void moverParaFrente() {

        System.out.println("Robô movendo para frente.");

    }

    @Override
    public void moverParaTras() {

        System.out.println("Robô movendo para trás.");
        
    }
}
