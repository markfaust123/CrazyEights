/**
 * The is a test class to test the methods within the Card class.
 *
 * @author Mark Faust <mfaust4 -- 11/15/22>
 */
public class TestCard {

   /**
    * This method is used to test the various functions of the Card class.
    * @param exp the expected method return value.
    * @param act the actual method return value.
    * @param dsc the message printed to pin-point 
                 which process is/isn't working.
    */
   public static void assertEquals(int exp, int act, String dsc) {
      if (exp == act) {
         System.out.println("PASS: " + dsc);
      }
      else {
         System.out.println("FAIL: " + dsc);
      }
   }
   
   /**
    * This method is used to test the various functions of the Card class.
    * @param exp the expected method return value.
    * @param act the actual method return value.
    * @param dsc the message printed to pin-point 
                 which process is/isn't working.
    */
   public static void assertEquals(boolean exp, boolean act, String dsc) {
      if (exp == act) {
         System.out.println("PASS: " + dsc);
      }
      else {
         System.out.println("FAIL: " + dsc);
      }
   }
   
   /**
    * This method is used to test the various functions of the Card class.
    * @param exp the expected method return value.
    * @param act the actual method return value.
    * @param dsc the message printed to pin-point 
                 which process is/isn't working.
    */
   public static void assertEquals(String exp, String act, String dsc) {
      if (exp.equals(act)) {
         System.out.println("PASS: " + dsc);
      }
      else {
         System.out.println("FAIL: " + dsc);
      }
   }

   /** 
    * Execution starts here. 
    * @param args command-line arguments. 
    */
   public static void main(String[] args) {
      
      Card kingOfClubs = new Card(13, 1); 
      System.out.println(kingOfClubs); // must print “King of Clubs” 
      assertEquals(13, kingOfClubs.getRank(), "Rank is correctly assigned.");
      
      Card copyKingOfClubs = new Card(13, 1);
      Card sixOfDiamonds = new Card(6, 2);
      Card sevenOfDiamonds = new Card(7, 2);
      Card eightOfDiamonds = new Card(8, 2);
      Card threeOfHearts = new Card(3, 3);
      Card aceOfSpades = new Card(1, 4);
      Card aceOfXXXXXX = aceOfSpades;
      Card nonexistent = new Card(14, 5);
      
      //Card() TEST
      assertEquals(true, aceOfSpades.equals(aceOfXXXXXX),
                   "Card object equality is correct.");
      assertEquals(false, aceOfSpades.equals(threeOfHearts),
                   "Card object equality is correct.");
      //getRank() TEST
      assertEquals(13, kingOfClubs.getRank(), "Rank is correctly assigned.");
      assertEquals(0, nonexistent.getRank(), "Rank is correctly assigned.");
      //getSuit() TEST
      assertEquals(1, kingOfClubs.getSuit(), "Suit is correctly assigned.");
      assertEquals(0, nonexistent.getSuit(), "Suit is correctly assigned.");
      //compareTo() TEST
      assertEquals(-1, kingOfClubs.compareTo(sevenOfDiamonds), 
                   "Cards are correctly compared.");
      assertEquals(-1, sixOfDiamonds.compareTo(sevenOfDiamonds), 
                   "Cards are correctly compared.");
      assertEquals(0, sevenOfDiamonds.compareTo(sevenOfDiamonds),
                   "Cards are correctly compared.");
      assertEquals(1, eightOfDiamonds.compareTo(sevenOfDiamonds),
                   "Cards are correctly compared.");
      assertEquals(1, sevenOfDiamonds.compareTo(kingOfClubs),
                   "Cards are correctly compared.");
      //equals() TEST
      assertEquals(false, sevenOfDiamonds.equals(kingOfClubs),
                   "Card equality check is correct.");
      assertEquals(true, copyKingOfClubs.equals(kingOfClubs),
                   "Card equality check is correct.");
      //toString() TEST
      assertEquals("King of Clubs", kingOfClubs.toString(),
                   "Card is printed out correctly.");
      assertEquals("3 of Hearts", threeOfHearts.toString(),
                   "Card is printed out correctly.");
      assertEquals("invalidCard", nonexistent.toString(),
                   "Card is printed out correctly.");             
                   
      Deck deck1 = new Deck();
      Deck deck2 = deck1;
      Deck deck3 = new Deck();
      Deck deck4 = new Deck();
      
      //Deck() TEST
      assertEquals(true, deck1.equals(deck2),
                   "Deck object equality is correct.");
      assertEquals(false, deck1.equals(deck3),
                   "Deck object equality is correct.");
      
      //shuffle() TEST
      deck3.shuffle();
      assertEquals(false, deck3.toString().equals(deck1.toString()),
                   "Deck is correctly shuffled.");
      deck4.shuffle();
      assertEquals(false, deck3.toString().equals(deck4.toString()),
                   "Deck is correctly shuffled.");
      
      
      //sort() TEST
      deck3.sort();
      assertEquals(true, deck3.toString().equals(deck1.toString()),
                   "Deck is correctly sorted.");
      deck4.sort();
      assertEquals(true, deck3.toString().equals(deck4.toString()),
                   "Deck is correctly sorted.");
           
   }

}