/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 16/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 9 - Crie uma interface Imprimivel com o método imprimir(), implemente-a nas classes Documento e Imagem.  
//=================================================================================================================================


public class Documento implements Imprimivel {

    @Override
    public void imprimir() {
        
        System.out.println("Imprimindo DOCUMENTO");
        
    }

}
