//samk2020
public class EmptyDeckException extends Exception{
    //needs more editing
    public EmptyDeckException(Throwable cause){
        super(cause);
    } 

    public EmptyDeckException(String message, Throwable cause){
        super(message, cause);
    } 
    
    public EmptyDeckException(String message){
        super(message);
    } 
    
    public EmptyDeckException(){
    }
}
