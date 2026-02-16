/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 16/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 2 - Crie uma interface InstrumentoMusical com o método tocar() e implemente-a nas classes Violao e Piano. 
//=================================================================================================================================


public class Piano implements InstrumentoMusical {

    @Override
    public void tocar() {
        
        System.out.println("O PIANO está tocando");
        
    }

}
