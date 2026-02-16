/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 16/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 20 - Modifique a interface Eletrodomestico adicionando um método default chamado verificarEstado() e implemente-a na classe Microondas. 
//=================================================================================================================================


public class Microondas implements Eletrodomestico {

    @Override
    public void desligar() {
        
        System.out.println("O MICROONDAS está desligando...");
        
    }

    @Override
    public void ligar() {
        
        System.out.println("O MICROONDAS está ligando...");
        
    }

    @Override
    public void verificarEstado() {
        
        Eletrodomestico.super.verificarEstado();
    }

}
