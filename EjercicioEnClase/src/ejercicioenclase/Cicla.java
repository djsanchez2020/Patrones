package ejercicioenclase;

/**
 *
 * @author Daniel Julian Sanchez Alvarez <danieljulian9865@gmail.com>
 */
public class Cicla extends MedioTransporte{
    
    @Override
    public void moverse(){
        System.out.println("Mi primer pedalazo");
    }
    
    @Override
    public void detenerse(){
        System.out.println("Ya estoy cansado...");
    }
}
