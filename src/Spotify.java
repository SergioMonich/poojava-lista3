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


public class Spotify implements Musica {

    @Override
    public void play() {

        System.out.println("Spotify está tocando a música.");

    }

    @Override
    public void pause() {

        System.out.println("Spotify pausou a música.");

    }

    @Override
    public void stop() {

        System.out.println("Spotify parou a música.");
        
    }
}
