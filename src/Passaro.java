/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 16/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 10 - Crie uma interface Animal com o método comer(), e uma outra interface Voador com o método voar(), e implemente ambas na classe Passaro. 
//=================================================================================================================================


public class Passaro implements Animal, Voador {

    private String especie;

    public Passaro(String especie) {

        this.especie = especie;

    }

    @Override
    public void comer() {
        
        System.out.printf("%s está COMENDO\n", especie);
        
    }

    @Override
    public void voar() {

        System.out.printf("%s está VOANDO\n", especie);
        
    }

}
