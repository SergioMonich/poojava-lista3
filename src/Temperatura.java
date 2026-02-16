/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 16/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 21 - Crie uma interface Conversor que converte Celsius para Fahrenheit e implemente-a na classe Temperatura. 
//=================================================================================================================================


public class Temperatura implements Conversor {

    private float celcius;

    public Temperatura(float celcius) {

        this.celcius = celcius;

    }

    @Override
    public void converte() {
        
        float fahrenheit = (float) (celcius * (1.8) + 32);
        System.out.printf("%.2f Celcius convertido em Fahrenhit : %.2f%n", celcius, fahrenheit);

    }

    

}
