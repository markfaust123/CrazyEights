/**
 * This class allows for the creation of Card objects that have specific
 * ranks and suits that can be placed into a deck, using another program.
 *
 * @author Mark Faust <mfaust4 -- 11/15/22>
 */
public class Card {
   
   private int rank;
   private int suit;
   
   /**
    * Default constructor for a Card that allows for the setting of a
    * Card's rank and suit.
    * @param rank the desired rank of the Card object.
    * @param suit the desired suit of the Card object.
    */
   public Card(int rank, int suit) {
      if ((rank < 1 || rank > 13) || (suit < 1 || suit > 4)) {
         this.rank = 0;
         this.suit = 0;
      }
      else {
         this.rank = rank;
         this.suit = suit;
      }
   }
   
   /**
    * Gets the rank of the desired Card object.
    * @return rank of the Card object.
    */
   public int getRank() {
      return rank;
   }
   
   /**
    * Gets the suit of the desired Card object.
    * @return suit of the Card object.
    */
   public int getSuit() {
      return suit;
   }
   
   /** 
    * Compare this Card with the specified otherCard for order. 
    * @param otherCard the other Card object to be compared. 
    * @return a negative integer, zero, or a positive integer as 
    * this object is less than, equal to, or greater than the otherCard. 
    */
   public int compareTo(Card otherCard) {
      if (this.getSuit() > otherCard.getSuit() || 
          (this.getSuit() == otherCard.getSuit() && 
           this.getRank() > otherCard.getRank())) {
         return 1;
      }
      if ((this.getSuit() == otherCard.getSuit()) && 
          (this.getRank() == otherCard.getRank())) {
         return 0;
      }
      return -1;
   }
   
   /**
    * Overrides the equal() method of the Object class to determine whether or
    * not two Card object's qualities are equivalent.
    * @param obj the Object that is casted to a Card to determine equivalence.
    * @return a boolean value that tells whether two Card object's 
    *         characteristics are equal.
    */
   @Override
   public boolean equals(Object obj) {
      if (obj instanceof Card) {
         if (((Card) obj).getRank() == this.getRank() && 
             ((Card) obj).getSuit() == this.getSuit()) {
            return true;
         }
      }  
      return false;
   }
   
   /**
    * Overrides the toString() method of the Object class to print out
    * a given Card object.
    * @return a String object containing the details of the desired Card object.
    */
   @Override
   public String toString() {
      String st = Integer.toString(getSuit());
      String rk = Integer.toString(getRank());
      
      switch (this.getRank()) {
         case 1:
            rk = "Ace";
            break;
         case 11:
            rk = "Jack";
            break;
         case 12:
            rk = "Queen";
            break;
         case 13:
            rk = "King";
            break;
         default: 
            rk = rk;
            break;            
      }
      
      switch (this.getSuit()) {
         case 1:
            st = "Clubs";
            break;
         case 2:
            st = "Diamonds";
            break;
         case 3:
            st = "Hearts";
            break;
         case 4:
            st = "Spades";
            break;
         default: 
            st = st;
            break;            
      }
      
      if (getRank() == 0 || getSuit() == 0) {
         return "invalidCard";
      }
      else {
         return rk + " of " + st;
      }    
      
   }

}