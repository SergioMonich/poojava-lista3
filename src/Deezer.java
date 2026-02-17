/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 17/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 30 - Crie uma interface Musica com os métodos play(), pause(), stop(), e implemente-a nas classes Spotify e Deezer. 
//=================================================================================================================================


public class Deezer implements Musica {

    @Override
    public void play() {

        System.out.println("Deezer está tocando a música.");

    }

    @Override
    public void pause() {

        System.out.println("Deezer pausou a música.");

    }

    @Override
    public void stop() {

        System.out.println("Deezer parou a música.");
        
    }
}
