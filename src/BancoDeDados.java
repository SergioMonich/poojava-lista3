/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 16/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 13 - Crie uma interface Armazenavel com os métodos salvar() e carregar(), e implemente-a nas classes ArquivoTexto e BancoDeDados.
//=================================================================================================================================


public class BancoDeDados implements Armazenavel {

    @Override
    public void carregar() {
        System.out.println("CARREGANDO Banco de Dados...aguarde");
        
    }

    @Override
    public void salvar() {
        
        System.out.println("SALVANDO Banco de Dados...aguarde");
        
    }

}
