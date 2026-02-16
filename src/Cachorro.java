/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 16/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 16 - Modifique a interface Animal adicionando um método default chamado dormir() que imprime "Zzz...", e implemente-a na classe Cachorro. 
//=================================================================================================================================


public class Cachorro implements Animal {

    private String nomeCachorro;

    public Cachorro(String nomeCachorro) {

        this.nomeCachorro = nomeCachorro;

    }

    @Override
    public void comer() {
        
        System.out.printf("%s está comendo\n", nomeCachorro);
        
    }

    @Override
    public void dormir() {
        
        Animal.super.dormir();

    }  

}
