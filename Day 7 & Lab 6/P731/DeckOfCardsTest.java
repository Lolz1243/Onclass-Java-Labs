package P731;
// Fig. 7.11: DeckOfCardsTest.java
// Card shuffling and dealing.

public class DeckOfCardsTest
{
   // execute application
   public static void main(String[] args)
   {
      DeckOfCards myDeckOfCards = new DeckOfCards();
      DeckOfCards anotherDeck = new DeckOfCards();
      myDeckOfCards.shuffle(); // place Cards in random order
      anotherDeck.shuffle();
      // print five Cards in the order in which they are dealt
      for (int i = 0; i < 5; i++)
      {
         // deal and display five Cards
         System.out.printf("%-19s", myDeckOfCards.dealCard());
         
		 if (i / 5 == 1) // output a newline after every fifth card
		    System.out.println();
      }
      
      System.out.println();
      
      for (int j = 0; j < 5; j++)
      {
         // deal and display five Cards
         System.out.printf("%-19s", anotherDeck.dealCard());
         
		 if (j / 5 == 1) // output a newline after every fifth card
		    System.out.println();
      }
      
      
      myDeckOfCards.create_deck_of_5_cards();
      
      int myTotal = myDeckOfCards.checkPair() +
      myDeckOfCards.checkThreeAndFour() +
      myDeckOfCards.checkFlush() +
      myDeckOfCards.checkStraight() +
      myDeckOfCards.checkFullHouse();           
      
      
      anotherDeck.create_deck_of_5_cards();
      
      int anotherTotal = anotherDeck.checkPair() +
      anotherDeck.checkThreeAndFour() +
      anotherDeck.checkFlush() +
      anotherDeck.checkStraight() +
      anotherDeck.checkFullHouse();
      
      if (myTotal > anotherTotal)
    	  System.out.printf("%n%nThe hand from deck myDeckofCards is better.");
      else if (anotherTotal > myTotal)
    	  System.out.printf("%n%nThe hand from deck anotherDeck is better.");
      else if (myTotal == anotherTotal)
    	  System.out.printf("%n%nBoth hands are equal.");
   }
   
} // end class DeckOfCardsTest