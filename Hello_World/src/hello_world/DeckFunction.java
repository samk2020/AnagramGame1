//samk2020 
//this is functional part for the deck like shuffling/arrangement
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeckFunction {
    //needs more editing
    // private ArrayList<TrainCards> deck = new ArrayList<>();
    private List<TrainCards> deck = new ArrayList<>();
    public DeckFunction(){

        for (ChallengeEnum challenge: ChallengeEnum.values()){
            for (LevelEnum levelEnum : LevelEnum.values()){
                LevelEnum level = null;
                deck.add(new TrainCards(challenge, level));
            }
        }

    }

    //this will shuffle the deck of cards
    public void shuffle(){
        ArrayList<TrainCards> tempOldDeck = new ArrayList<>();

        for (TrainCards card: deck){
            tempOldDeck.add(card);
        }

        int[] randomPermutation = generateRandomPermutation(deck.size());

        for (int i = 0; i < deck.size(); i++){  
            deck.set(i, tempOldDeck.get(randomPermutation[i] - 1));
        }       
    }

    private int[] generateRandomPermutation(int high){
        return generateRandomPermutation(1, high);
    }
    // incriment or decrement needed for the cards
    private int[] generateRandomPermutation(int low, int high){
        ArrayList<Integer> unselectedNumber = new ArrayList<>();

        for (int i = low; i <= high; i++){
            unselectedNumber.add(i);
        }

        Random rng = new Random();
        int[] randomPermutation = new int[high - low + 1];

        for (int i = 0; i < randomPermutation.length; i++){
            int randomIndex = rng.nextInt(unselectedNumber.size());
            randomPermutation[i] = unselectedNumber.get(randomIndex);
            unselectedNumber.remove(randomIndex);
        }

        return randomPermutation;
    }
    // for any card taken by the player there will be one less card
    public TrainCards draw() throws EmptyDeckException{
        if (deck.size() > 0){
            TrainCards drawnCard = deck.get(deck.size() - 1);
            deck.remove(deck.size() - 1);
            return drawnCard;
        } else 
            throw new EmptyDeckException();
    }
    // initializes the deck of cards
    public int size(){
        return deck.size();
    }
}