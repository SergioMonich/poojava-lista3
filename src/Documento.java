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


//=================================================================================================================================
// EX 17 - Modifique a interface Imprimivel adicionando um método default chamado mostrarNoMonitor(), que imprime "Exibindo no monitor", e implemente-a na classDocumento. 
//=================================================================================================================================


public class Documento implements Imprimivel {

    @Override
    public void imprimir() {
        
        System.out.println("Imprimindo DOCUMENTO");
        
    }

    @Override
    public void mostrarNoMonitor() {
        
        Imprimivel.super.mostrarNoMonitor();

    }

}
