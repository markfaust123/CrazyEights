/*
 * @author Mark Faust
 * @version 1.0
 */

/**
 * This class encapsulates a player in a game of crazy eights.
 */
public abstract class Player {

   /**
    * The name of this player.
    */
   protected String name;

   /**
    * The group of cards held by this player.
    */
   protected Hand hand;

   /**
    * Create a new player with the specified name and an empty hand.
    * @param theName the name of the player
    */
   public Player(String theName) {
      this.name = theName;
      this.hand = new Hand(name);
   }

   /**
    * Get the name of this player.
    * @return the name of the player
    */
   public String getName() {
      return name;
   }

   /**
    * Get the hand of this player.
    * @return the hand of the player
    */
   public Hand getHand() {
      return hand;
   }


   /**
    * Determine if the player's hand contains any card that matches
    * the given card in the sense of Crazy Eights.
    * @param top the card at the top of the "discard pile".
    * @return true if the user's hand contains at least one playable card, 
    *         and false otherwise
    */
   public boolean hasPlayableCard(Card top) {
   
      for (int i = 0; i < getHand().size(); i++) {
         Card card = hand.getCard(i);
         if ((card.getRank() == top.getRank()) ||
             (card.getSuit() == top.getSuit()) ||
             (card.getRank() == 8 || top.getRank() == 8)) {
            return true;
         }
      }
      return false;

   }


   /**
    * Execute this player's turn in the game. [This is an abstract
    * method that must be implemented in any derived classes.]
    * @param crazyEight gives access to the "draw pile"
    * @param top the top of the "discard pile"
    * @return a matching card from the player's hand
    */
   public abstract Card makeMove(Game crazyEight, Card top);


}

