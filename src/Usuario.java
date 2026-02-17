/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 17/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 24 - Crie uma interface Mensagem que retorna "Bem-vindo ao sistema!" e implemente-a na classe Usuario. 
//=================================================================================================================================


public class Usuario implements Mensagem {

    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String exibirMensagem() {
        
        System.out.println("Olá, " + nome + "! Seu email é: " + email);
        System.out.println(Mensagem.super.exibirMensagem());
        return Mensagem.super.exibirMensagem();
    }

    

}
