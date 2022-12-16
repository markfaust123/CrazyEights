/**
 * The is a test class to test the methods within the Deck class.
 *
 * @author Mark Faust <mfaust4 -- 11/15/22>
 */
public class TestDeck {
   
   /** 
    * Execution starts here. 
    * @param args command-line arguments. 
    */
   public static void main(String[] args) {
   
      Deck deck = new Deck(); 
      deck.shuffle(); 
      deck.sort(); 
      System.out.println(deck);
      
      /*
      Deck testDeck = new Deck();
      testDeck.shuffle();
      testDeck.sort();
      System.out.println(testDeck);
      */
      
   }

}