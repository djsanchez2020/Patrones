package ejercicioenclase;

/**
 *
 * @author Daniel Julian Sanchez Alvarez <danieljulian9865@gmail.com>
 */
public class MiSegundoAdaptador implements MiAdaptador{

    @Override
    public void EjecutarAccion(){
        System.out.println("Motocicleta");
        Motocicleta motocicleta = new Motocicleta();
        motocicleta.moverse();
        motocicleta.detenerse();
    }
    
}
