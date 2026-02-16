/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 16/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 8 - Crie uma interface OperacoesMatematicas com os métodos somar(), subtrair(), multiplicar() e dividir(), e implemente-a na classe Calculadora. 
//=================================================================================================================================


//=================================================================================================================================
// EX 19 - Modifique a interface OperacoesMatematicas adicionando um método default chamado potencia() e implemente-a na classe CalculadoraCientifica. 
//=================================================================================================================================


public interface OperacoesMatematicas {

    public void somar();
    public void subtrair();
    public void multiplicar();
    public void dividir();
    default void potencia() {

        System.out.println("Calculadora Científica está realizando POTENCIAÇÃO");

    }

}
