/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 16/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 14 - Crie uma interface Sensores com o método medirTemperatura(), implemente-a nas classes SensorDeTemperatura e SensorDePressao. 
//=================================================================================================================================


public class SensorDeTemperatura implements Sensores {

    @Override
    public void medirTemperatura() {
        
        System.out.println("Sensor de Pressão: medindo temperatura...");
        
    }

}
