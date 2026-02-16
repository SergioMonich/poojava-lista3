/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 13/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


/**
 * @brief Instruções de execução
 * 
 * Para executar um exercício individual:
 * 1. Comente todos os blocos de exercícios na main
 * 2. Deixe descomentado apenas o exercício desejado
 * 3. Execute a aplicação normalmente
 * 
 */


public class App {
    public static void main(String[] args) throws Exception {
        
        //=================================================================================================================================
        // EX 1 - Crie uma interface Veiculo com o método acelerar() e implemente-a nas classes Carro e Moto. 
        //=================================================================================================================================
        /*
        Veiculo car1 = new Carro();
        Veiculo bike1 = new Moto();
        
        car1.acelerar();
        bike1.acelerar();
        */
        //=================================================================================================================================
        // EX 2 - Crie uma interface InstrumentoMusical com o método tocar() e implemente-a nas classes Violao e Piano. 
        //=================================================================================================================================
        /*
        InstrumentoMusical guitar1 = new Violao();
        InstrumentoMusical piano1 = new Piano();

        guitar1.tocar();
        piano1.tocar();
        */
        //=================================================================================================================================
        // EX 3 - Crie uma interface Eletrodomestico com os métodos ligar() e desligar(), e implemente-a nas classes Geladeira e Televisao. 
        //=================================================================================================================================
        /*
        Eletrodomestico fridge1 = new Geladeira("Consul CRM44AK");
        Eletrodomestico fridge2 = new Geladeira("Brastemp BRM44H");
        Eletrodomestico tv1 = new Televisao("Samsung UN32T4300GXZD");
        Eletrodomestico tv2 = new Televisao("TCL QLED Full HD 32");
        Televisao tv3 = new Televisao(null);
        Televisao tv4 = new Televisao(null);
        Microondas mic1 = new Microondas();
        

        fridge1.ligar();
        fridge2.desligar();
        tv1.desligar();
        tv2.ligar();
        tv3.aumentarVolume();
        tv4.diminuirVolume();
        mic1.verificarEstado();
        */
        //=================================================================================================================================
        // EX 4 - Crie uma interface FormaGeometrica com o método calcularArea() e implemente-a nas classes Quadrado e Circulo. 
        //=================================================================================================================================
        /*
        FormaGeometrica square1 = new Quadrado(15);
        FormaGeometrica square2 = new Quadrado(10);
        FormaGeometrica circle1 = new Circulo(20);
        FormaGeometrica circle2 = new Circulo(25);

        square1.calcularArea();
        square2.calcularArea();
        circle1.calcularArea();
        circle2.calcularArea();
        */
        //=================================================================================================================================
        // EX 5 - Crie uma interface Funcionario com o método calcularSalario() e implemente-a nas classes Gerente e Programador. 
        //=================================================================================================================================
        /*
        Funcionario ger1 = new Gerente();
        Funcionario pro1 = new Programador();

        ger1.calcularSalario();
        pro1.calcularSalario();
        */
        //=================================================================================================================================
        // EX 6 - Crie uma interface Nadador e Corredor, implemente ambas na classe Triatleta. 
        //=================================================================================================================================
        /*
        Triatleta tri1 = new Triatleta();
        tri1.correr();
        tri1.nadar();
        */
        //=================================================================================================================================
        // EX 7 - Crie uma interface Banco com métodos sacar(), depositar() e verSaldo(), e implemente-a na classe ContaCorrente. 
        //=================================================================================================================================
        /*
        ContaCorrente cc1 = new ContaCorrente(1234);
        ContaCorrente cc2 = new ContaCorrente(5678);
        ContaCorrente cc3 = new ContaCorrente(6543);

        cc1.depositar();
        cc2.sacar();
        cc3.verSaldo();
        */
        //=================================================================================================================================
        // EX 8 - Crie uma interface OperacoesMatematicas com os métodos somar(), subtrair(), multiplicar() e dividir(), e implemente-a na classe Calculadora. 
        //=================================================================================================================================
        /*
        Calculadora calc = new Calculadora();
        CalculadoraCientifica calcc1 = new CalculadoraCientifica();

        calc.dividir();
        calc.multiplicar();
        calc.somar();
        calc.subtrair();
        calcc1.potencia();
        */
        //=================================================================================================================================
        // EX 9 - Crie uma interface Imprimivel com o método imprimir(), implemente-a nas classes Documento e Imagem.  
        //=================================================================================================================================
        /*
        Imprimivel doc = new Documento();
        Imprimivel img = new Imagem();
        Documento doc2 = new Documento();

        doc.imprimir();
        img.imprimir();
        doc2.mostrarNoMonitor();
        */
        //=================================================================================================================================
        // EX 10 - Crie uma interface Animal com o método comer(), e uma outra interface Voador com o método voar(), e implemente ambas na classe Passaro. 
        //=================================================================================================================================
        /*
        Passaro  bird1 = new Passaro("Pomba");
        Passaro bird2 = new Passaro("Águia");
        Passaro bird3 = new Passaro("Urubu");
        Cachorro dog1 = new Cachorro(null);

        dog1.dormir();
        bird1.comer();
        bird2.comer();
        bird2.voar();
        bird3.voar();
        */
        //=================================================================================================================================
        // EX 11 - Crie uma interface Jogavel com o método iniciarJogo(), e implemente-a nas classes Xadrez e Futebol. 
        //=================================================================================================================================
        /*
        Xadrex xadrez = new Xadrex();
        Futebol futebol = new Futebol();

        xadrez.iniciarJogo();
        futebol.iniciarJogo();
        */
        //=================================================================================================================================
        // EX 12 - Crie uma interface Pagamento com o método pagar(), e implemente-a nas classes CartaoCredito e Boleto. 
        //=================================================================================================================================
        /*
        CartaoCredito cc1 = new CartaoCredito(986532);
        Boleto blt1 = new Boleto(124578);
        CartaoCredito cc2 = new CartaoCredito(0);
        Pix pix1 = new Pix();

        cc1.pagar();
        blt1.pagar();
        cc2.cancelarPagamento();
        pix1.pagar();
        pix1.cancelarPagamento();
        */
        //=================================================================================================================================
        // EX 13 - Crie uma interface Armazenavel com os métodos salvar() e carregar(), e implemente-a nas classes ArquivoTexto e BancoDeDados.
        //=================================================================================================================================
        /*
        ArquivoTexto txt1 = new ArquivoTexto();
        ArquivoTexto txt2 = new ArquivoTexto();
        BancoDeDados bdd1 = new BancoDeDados();
        BancoDeDados bdd2 = new BancoDeDados();

        txt1.carregar();
        txt2.salvar();
        bdd1.carregar();
        bdd2.salvar();
        */
        //=================================================================================================================================
        // EX 14 - Crie uma interface Sensores com o método medirTemperatura(), implemente-a nas classes SensorDeTemperatura e SensorDePressao. 
        //=================================================================================================================================
        /*
        SensorDePressao sdp1 = new SensorDePressao();
        SensorDeTemperatura sdt1 = new SensorDeTemperatura();

        sdp1.medirTemperatura();
        sdt1.medirTemperatura();
        */
        //=================================================================================================================================
        // EX 15 - Crie uma interface ControleRemoto com os métodos aumentarVolume() e diminuirVolume(), implemente-a na classe Televisao.
        //=================================================================================================================================
        /*
        Veja ex 3
        */
        //=================================================================================================================================
        // EX 16 - Modifique a interface Animal adicionando um método default chamado dormir() que imprime "Zzz...", e implemente-a na classe Cachorro. 
        //=================================================================================================================================
        /*
        Veja ex 10
        */
        //=================================================================================================================================
        // EX 17 - Modifique a interface Imprimivel adicionando um método default chamado mostrarNoMonitor(), que imprime "Exibindo no monitor", e implemente-a na classe Documento. 
        //=================================================================================================================================
        /*
        Veja ex 9
        */
        //=================================================================================================================================
        // EX 18 - Modifique a interface Pagamento adicionando um método default chamado cancelarPagamento() e implemente-a nas classes CartaoCredito e Pix. 
        //=================================================================================================================================
        /*
        Veja ex 12
        */
        //=================================================================================================================================
        // EX 19 - Modifique a interface OperacoesMatematicas adicionando um método default chamado potencia() e implemente-a na classe CalculadoraCientifica. 
        //=================================================================================================================================
        /*
        Veja ex 8
        */
        //=================================================================================================================================
        // EX 20 - Modifique a interface Eletrodomestico adicionando um método default chamado verificarEstado() e implemente-a na classe Microondas. 
        //=================================================================================================================================
        /*
        Veja ex 3
        */
        //=================================================================================================================================
        // EX 21 - Crie uma interface Conversor que converte Celsius para Fahrenheit e implemente-a na classe Temperatura. 
        //=================================================================================================================================


        //=================================================================================================================================
        // EX 22 - Crie uma interface Banco que retorna a taxa de juros atual e implemente-a na classe ContaPoupanca. 
        //=================================================================================================================================


        //=================================================================================================================================
        // EX 23 - Crie uma interface Utilitario que calcula o fatorial de um número e implemente-a na classe Matematica. 
        //=================================================================================================================================


        //=================================================================================================================================
        // EX 24 - Crie uma interface Mensagem que retorna "Bem-vindo ao sistema!" e implemente-a na classe Usuario. 
        //=================================================================================================================================


        //=================================================================================================================================
        // EX 25 - Crie uma interface Horario que retorna a hora atual e implemente-a na classe Relogio. 
        //=================================================================================================================================


        //=================================================================================================================================
        // EX 26 - Crie uma interface Transmissivel com os métodos iniciarTransmissao() e finalizarTransmissao(), e implemente-a nas classes Youtube e Twitch. 
        //=================================================================================================================================


        //=================================================================================================================================
        // EX 27 - CrCrie uma interface Autenticavel com os métodos login() e logout(), implemente-a nas classes UsuarioSistema e Administrador. 
        //=================================================================================================================================


        //=================================================================================================================================
        // EX 28 - Crie uma interface Movivel com os métodos moverParaFrente() e moverParaTras(), implementea na classe Robo. 
        //=================================================================================================================================


        //=================================================================================================================================
        // EX 29 - Crie uma interface Repositorio<T> com os métodos salvar(T objeto) e buscar(int id), implemente-a na classe RepositorioCliente. 
        //=================================================================================================================================


        //=================================================================================================================================
        // EX 30 - Crie uma interface Musica com os métodos play(), pause(), stop(), e implemente-a nas classes Spotify e Deezer. 
        //=================================================================================================================================


    }
}
