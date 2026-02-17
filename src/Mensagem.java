/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 17/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 24 - Crie uma interface Mensagem que retorna "Bem-vindo ao sistema!" e implemente-a na classe Usuario. 
//=================================================================================================================================


public interface Mensagem {

    public default String exibirMensagem() {

        return "Bem-vindo ao sistema!";
        
    }


}
