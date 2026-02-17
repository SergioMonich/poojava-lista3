/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 17/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 26 - Crie uma interface Transmissivel com os métodos iniciarTransmissao() e finalizarTransmissao(), e implemente-a nas classes Youtube e Twitch. 
//=================================================================================================================================


public class Twitch implements Transmissivel {

    @Override
    public void iniciarTransmissao() {

        System.out.println("Iniciando transmissão na Twitch...");

    }

    @Override
    public void finalizarTransmissao() {

        System.out.println("Finalizando transmissão na Twitch...");
        
    }

}
