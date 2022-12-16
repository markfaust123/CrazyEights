/**
 * This class allows for the creation of Deck objects which contain
 * an array of Card objects that can be used to play games, using 
 * another program.
 *
 * @author Mark Faust <mfaust4 -- 11/15/22>
 */
public class Deck {

   private static final int DECK_SIZE = 52;
   private Card[] deck;
   
   /**
    * Default constructor for a Deck object that intializes its deck array
    * to contain Card objects.
    */
   public Deck() {
      deck = new Card[DECK_SIZE];
      int i = 0;
      for (int suit = 1; suit <= 4; suit++) {
         for (int rank = 1; rank <= 13; rank++) {
            deck[i++] = new Card(rank, suit);
         }
      }
   }
   
   /**
    * This method shuffles the Cards within the Deck object's deck array.
    */
   public void shuffle() {
      java.util.Random rand = new java.util.Random();
      Card[] copy = new Card[DECK_SIZE];
      for (int i = 0; i < deck.length; i++) {
         copy[i] = deck[i];
      }
      
      int k = DECK_SIZE - 1;
      int j;
      
      for (int i = 0; i < DECK_SIZE; i++) {
         j = rand.nextInt(k + 1);
         deck[i] = copy[j];
         copy[j] = copy[k];
         k--;
      }
   }
   
   /**
    * This method sorts the Cards into proper order within a shuffled 
    * Deck object's deck array.
    */
   public void sort() {
      for (int j = 0; j < DECK_SIZE; j++) {
         Card c = deck[j];
         int i = j - 1;
         while (i >= 0 && deck[i].compareTo(c) > 0) {
            deck[i + 1] = deck[i];
            i--;
         }
         deck[i + 1] = c;
      }
   }
   
   /**
    * Overrides the toString() method of the Object class to print out
    * a deck array containing Card objects.
    * @return a String object containing the details of the Card objects
    *         within the deck.
    */
   @Override
   public String toString() {
      String dk = "";
      for (int i = 0; i < this.deck.length; i++) {
         dk += this.deck[i].toString() + "\n";
      }
      return dk;
   }

}