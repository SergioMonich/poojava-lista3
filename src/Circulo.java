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


public class Circulo implements FormaGeometrica {

    private int raio;

    public Circulo(int raio) {

        this.raio = raio;

    }

    @Override
    public void calcularArea() {
        
        System.out.printf("A área do círculo de raio %d é %.2f%n", raio, (Math.pow(raio, 2) * Math.PI));
        
    }

}
