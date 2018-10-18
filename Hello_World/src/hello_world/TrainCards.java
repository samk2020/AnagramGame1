//samk2020 
//this is for the cards 
import javax.swing.*;
import java.awt.Image;


public class TrainCards { 
    /*This is needed for the color imaging format of cards front and back 
    i will be working on this...to be contined 
    */ 
    //this part below will be updated 
    private static final String IMAGE_FOLDER_DIR = " ";
    private static final String IMAGE_FORMAT = " ";
    private static final String BACK_IMAGE_DIR = (" ");
    
    private Image cardImage;
    private Image backImage; 
    
    private ChallengeEnum challenge;
    private LevelEnum level;
    public TrainCards (){
        
    } 
    public TrainCards(ChallengeEnum suit, LevelEnum rank){
    this.challenge = challenge;
    this.level = level;

    String location = generateImageLocation();

    try {
        cardImage = new Image(location) {};

    } catch (Exception ex) {
        System.out.println(String.format("cannot load cards from: (%s)", location));        
        cardImage = null;
    }

    try {
        backImage = new Image(BACK_IMAGE_DIR) {};
    } catch (Exception ex){
        System.out.println(String.format("cannot load cards from: (%s)", BACK_IMAGE_DIR));
        backImage = null;
    }
}

public ChallengeEnum getChallenge() {
    return challenge;
}



public LevelEnum getLevel() {
    return level;
}



public Image getCard(){
    return cardImage;
}

private String generateCardLocation(){

    StringBuilder sb = new StringBuilder();

    sb.append(IMAGE_FOLDER_DIR);
    sb.append("/");

    sb.append(challenge.toString());
    sb.append("_");
    sb.append(level.toString());

    sb.append(IMAGE_FORMAT);



    return sb.toString().toLowerCase();

}

@Override
public String toString(){
    return (challenge + " " + level);
}

public int compareTo(TrainCards traincards) {

    if (this.level.compareTo(traincards.level) > 0){
        return 1;
    } else if (this.level.compareTo(traincards.level) < 0){
        return -1;
    } else {

        if(this.challenge.compareTo(traincards.challenge) > 0){
            return 1;
        } else if (this.challenge.compareTo(traincards.challenge) < 0){
            return -1;
        } else {
            return 0;
        }

    }


}

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((level == null) ? 0 : level.hashCode());
    result = prime * result + ((challenge == null) ? 0 : challenge.hashCode());
    return result;
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    TrainCards other = (TrainCards) obj; 
    return level == other.level && challenge == other.challenge;
    /*
    if (level != other.level)
        return false;
    if (challenge != other.challenge)
        return false;
        return true; 
            */
    }
// I'm working on this because I need to it to print other side
public Image getBackImage() {
    return backImage;
    }

    private String generateImageLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
