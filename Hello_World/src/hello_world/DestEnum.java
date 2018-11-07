
/**
 *
 * @author samk2020
 */
public class DestEnum {
    private String l0;
    private String l1;
    private String destcolour;
    private int length;
    private boolean isAlreadyTaken;
    
    
    DestEnum(String l0, String l1, int l2, String colours){
        
        this.l0= l1;
        this.l1= l1;
        this.length = l2;
        this.destcolour= colours;
    }
 
    public void setIsAreadyTaken(boolean ATC) {
        this.isAlreadyTaken = ATC;
    }
    public String getl0() {
        return l0;
    }
   
    public String getl1() {
        return l1;
    }
    
    public String getDestcolour() {
        return destcolour;
    }
    
    public int getLength() {
        return length;
    }
    
    public boolean isIsAlreadyTaken() {
        return isAlreadyTaken;
    }
    
   @Override
   public String toString(){
       return (this.l0 + " " + this.l1);
   }

   
}

