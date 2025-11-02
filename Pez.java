
package festineseguadalupepkg1ppkg122;


public class Pez extends Animal implements PuedeNadar{
    
    private double longitudMax;
    
    public Pez(String nombre, String habitat, TipoAgua tipoAgua, double longitudMax) {
        super(nombre, habitat, tipoAgua);
        this.longitudMax = longitudMax;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", es un pez y su longitud maxima es "+ longitudMax);
        return sb.toString();
    }
    
    @Override
    public String nadar(){
        return "Soy un pez nadando";
    }
    
}
