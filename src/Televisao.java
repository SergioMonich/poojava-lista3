/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 16/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 3 - Crie uma interface Eletrodomestico com os métodos ligar() e desligar(), e implemente-a nas classes Geladeira e Televisao. 
//=================================================================================================================================

//=================================================================================================================================
// EX 15 - Crie uma interface ControleRemoto com os métodos aumentarVolume() e diminuirVolume(), implemente-a na classe Televisao.
//=================================================================================================================================


public class Televisao implements Eletrodomestico, ControleRemoto {
    
    private String modelo;

    public Televisao(String modelo) {

        this.modelo = modelo;

    }

    @Override
    public void desligar() {
        
        System.out.println("A TELEVISÃO " + modelo + " está desligando...");
        
    }

    @Override
    public void ligar() {
        
        System.out.println("A TELEVISÃO " + modelo + " está ligando...");
        
    }

    @Override
    public void aumentarVolume() {
        
        System.out.println("Volume +...");
        
    }

    @Override
    public void diminuirVolume() {
        
        System.out.println("Volume -...");
        
    }

}
