
package festineseguadalupepkg1ppkg122;

public class MamiferoMarino extends Animal implements PuedeNadar, PuedeBuscarAlimento{
    
    private double frecuenciaRespiracion;
    
    public MamiferoMarino(String nombre, String habitat, TipoAgua tipoAgua, double frecuenciaRespiracion) {
        super(nombre, habitat, tipoAgua);
        this.frecuenciaRespiracion = frecuenciaRespiracion;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", es un mamifero marino y su frecuencia respiratoria es "+ frecuenciaRespiracion + " segundos");
        return sb.toString();
    }
    
    @Override
    public String nadar(){
        return "Soy un mamifero marino nadando";
    }
    
    @Override
    public String buscarAlimento(){
        return "Soy un mamifero marino buscando alimento";
    }
    
}
