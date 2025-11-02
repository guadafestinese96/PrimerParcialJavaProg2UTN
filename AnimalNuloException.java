
package festineseguadalupepkg1ppkg122;


public class AnimalNuloException extends RuntimeException {
    private static final String MESSAGE = "Animal nulo";
    
    public AnimalNuloException(){
        this(MESSAGE);
    }
    
    public AnimalNuloException(String message){
        super(message);
    }
}
