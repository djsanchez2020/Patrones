package ejercicioenclase;

/**
 *
 * @author Daniel Julian Sanchez Alvarez <danieljulian9865@gmail.com>
 */
public class Motocicleta extends MedioTransporte{
    
    @Override
    public void moverse(){
        System.out.println("Encender motor");
        System.out.println("Poner marcha");
        System.out.println("Acelerar");
    }
    
    @Override
    public void detenerse(){
        System.out.println("Desacelerar");
        System.out.println("Frenar");
        System.out.println("Apagar motor");
    }
    
}
