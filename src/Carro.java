/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 16/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 1 - Crie uma interface Veiculo com o método acelerar() e implemente-a nas classes Carro e Moto. 
//=================================================================================================================================


public class Carro implements Veiculo {

    @Override
    public void acelerar() {
        
        System.out.println("Carro está acelerando");
        
    }

}
