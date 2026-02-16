/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 16/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 4 - Crie uma interface FormaGeometrica com o método calcularArea() e implemente-a nas classes Quadrado e Circulo. 
//=================================================================================================================================


public class Quadrado implements FormaGeometrica {

    private int lado;

    public Quadrado(int lado) {

        this.lado = lado;

    }

    @Override
    public void calcularArea() {
        
        System.out.println("A área do quadrado de lado " + lado + " é " + (lado * lado));
        
    }

}
