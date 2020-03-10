package ejercicioenclase;

/**
 *
 * @author Daniel Julian Sanchez Alvarez <danieljulian9865@gmail.com>
 */
public class EjercicioEnClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        MiAdaptador medioTransporte;
        
        Integer numero = (int) (Math.random() * 10);
        
        if(numero > 0 && numero <=5){
            medioTransporte = new MiPrimerAdaptador();
        }else{
            medioTransporte = new MiSegundoAdaptador();
        }
        
        System.out.println(numero);
    
        medioTransporte.EjecutarAccion();
        
    }
    
}
