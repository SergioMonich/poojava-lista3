/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 17/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 23 - Crie uma interface Utilitario que calcula o fatorial de um número e implemente-a na classe Matematica. 
//=================================================================================================================================


public class Matematica implements Utilitario {

    @Override
    public long calcularFatorial(int numero) {

        long fatorial = 1;

        for (int i = 1; i <= numero; i++) {

            fatorial *= i;

        }
        
        return fatorial;
    }

}
