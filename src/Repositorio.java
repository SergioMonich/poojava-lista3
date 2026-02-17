/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 17/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 29 - Crie uma interface Repositorio<T> com os métodos salvar(T objeto) e buscar(int id), implemente-a na classe RepositorioCliente. 
//=================================================================================================================================


public interface Repositorio<T> {

    public void salvar(T objeto);
    public T buscar(int id);

}
