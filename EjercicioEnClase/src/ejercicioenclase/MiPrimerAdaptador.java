package ejercicioenclase;

/**
 *
 * @author Daniel Julian Sanchez Alvarez <danieljulian9865@gmail.com>
 */
public class MiPrimerAdaptador implements MiAdaptador{

    @Override
    public void EjecutarAccion(){
    
        System.out.println("Cicla");
        Cicla cicla = new Cicla();
        cicla.moverse();
        cicla.detenerse();
        
    }
    
}
