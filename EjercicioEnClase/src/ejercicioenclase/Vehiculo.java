package ejercicioenclase;

/**
 *
 * @author Daniel Julian Sanchez Alvarez <danieljulian9865@gmail.com>
 */
public class Vehiculo extends MedioTransporte{
    
    @Override
    public void moverse(){
        System.out.println("Encender motor");
        System.out.println("Quitar freno de mano");
        System.out.println("Poner marcha");
        System.out.println("Acelerar");
    }
    
    @Override
    public void detenerse(){
        System.out.println("Desacelerar");
        System.out.println("Reducir marcha");
        System.out.println("Apagar motor");
    }
    
}
