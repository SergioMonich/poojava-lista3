/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 17/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 27 - Crie uma interface Autenticavel com os métodos login() e logout(), implemente-a nas classes UsuarioSistema e Administrador. 
//=================================================================================================================================


public class UsuarioSistema implements Autenticavel {

    private String nome;
    private String email;

    public UsuarioSistema(String nome, String email) {  

        this.nome = nome;
        this.email = email;

    }

    @Override
    public void login() {

        System.out.println(nome + " fez login no sistema.");

    }

    @Override
    public void logout() {

        System.out.println(nome + " fez logout do sistema.");

    }

}
