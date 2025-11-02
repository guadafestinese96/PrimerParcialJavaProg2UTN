
package festineseguadalupepkg1ppkg122;

public class NoHayAnimalesException extends RuntimeException {
    private static final String MESSAGE = "No hay animales en el acuario aun";
    
    public NoHayAnimalesException(){
        this(MESSAGE);
    }
    
    public NoHayAnimalesException(String message){
        super(message);
    }
}
