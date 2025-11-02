
package festineseguadalupepkg1ppkg122;


public class Crustaceo extends Animal implements PuedeBuscarAlimento{
    
    private int numeroPatas;
    
    public Crustaceo(String nombre, String habitat, TipoAgua tipoAgua, int numeroPatas) {
        super(nombre, habitat, tipoAgua);
        this.numeroPatas = numeroPatas;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", es un crustaceo de "+ numeroPatas + " patas.");
        return sb.toString();
    }
    
    @Override
    public String buscarAlimento(){
        return "Soy un crustaceo buscando alimento";
    }
}
