
package festineseguadalupepkg1ppkg122;

public class MismoAnimalException extends RuntimeException {
    private static final String MESSAGE = "Ya existe el mismo animal";
    
    public MismoAnimalException(){
        this(MESSAGE);
    }
    
    public MismoAnimalException(String message){
        super(message);
    }
}
