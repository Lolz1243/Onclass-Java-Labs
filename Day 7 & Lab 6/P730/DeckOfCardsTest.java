package P730;
// Fig. 7.11: DeckOfCardsTest.java
// Card shuffling and dealing.

public class DeckOfCardsTest
{
   // execute application
   public static void main(String[] args)
   {
      DeckOfCards myDeckOfCards = new DeckOfCards();
      myDeckOfCards.shuffle(); // place Cards in random order
      
      // print five Cards in the order in which they are dealt
      for (int i = 0; i < 5; i++)
      {
         // deal and display five Cards
         System.out.printf("%-19s", myDeckOfCards.dealCard());

		 if (i / 5 == 1) // output a newline after every fifth card
		    System.out.println();
      }
      
      myDeckOfCards.create_deck_of_5_cards();
      myDeckOfCards.checkPair();
      myDeckOfCards.checkThreeAndFour();
      myDeckOfCards.checkFlush();
      myDeckOfCards.checkStraight();
      myDeckOfCards.checkFullHouse();
   }
   
} // end class DeckOfCardsTest