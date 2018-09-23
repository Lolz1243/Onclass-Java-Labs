package P731;
// Fig. 7.10: DeckOfCards.java
// DeckOfCards class represents a deck of playing cards.
import java.security.SecureRandom;

public class DeckOfCards
{
	private Card[] temp_deck;
   private Card[] deck; // array of Card objects
   private int currentCard; // index of next Card to be dealt (0-51)
   private static final int NUMBER_OF_CARDS = 52; // constant # of Cards
   // random number generator
   private static final SecureRandom randomNumbers = new SecureRandom();

   // constructor fills deck of Cards
   public DeckOfCards()
   {
      String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", 
         "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
      String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

      deck = new Card[NUMBER_OF_CARDS]; // create array of Card objects
      currentCard = 0; // first Card dealt will be deck[0]

      // populate deck with Card objects
      for (int count = 0; count < deck.length; count++) 
         deck[count] = 
            new Card(faces[count % 13], suits[count / 13]);
   } 


   // shuffle deck of Cards with one-pass algorithm
   public void shuffle()
   {
      // next call to method dealCard should start at deck[0] again
      currentCard = 0; 

      // for each Card, pick another random Card (0-51) and swap them
      for (int first = 0; first < deck.length; first++) 
      {
         // select a random number between 0 and 51 
         int second =  randomNumbers.nextInt(NUMBER_OF_CARDS);
         
         // swap current Card with randomly selected Card
         Card temp = deck[first];        
         deck[first] = deck[second];   
         deck[second] = temp;            
      } 
   } 

   
   // deal one Card
   public Card dealCard()
   {
      // determine whether Cards remain to be dealt
      if (currentCard < deck.length)
         return deck[currentCard++]; // return current Card in array
      else        
         return null; // return null to indicate that all Cards were dealt
   }
   
   public void create_deck_of_5_cards()
   {
	   
	   temp_deck = new Card[5];
	   for (int i = 0; i < 5; i++)
	   {
		   temp_deck = this.deck;
		   
	   }
   }
   
       
   
   public int checkPair()
   {
	   int numOfPairs = 0;
	   for (int m = 0; m < 5; m++)
	   {
		   
		   for (int i = m + 1; i < 5; i++)
		   {
			   
			   if (temp_deck[m].getFace() == temp_deck[i].getFace())
			   {
				   numOfPairs++;
			   }
		   }
	   }
	   if (numOfPairs >= 1)
	   {
		   return 1;  
	   }
	   if (numOfPairs == 2)
	   {
		  return 2;
	   }
	return numOfPairs;
   }
   

   
   public int checkThreeAndFour()
   {
	   int numOfMatches = 0;
	   for (int m = 0; m < 5; m++)
	   {
		   numOfMatches = 0;
		   for (int i = m + 1; i < 5; i++)
		   {
			   if(temp_deck[m].getFace() == temp_deck[i].getFace())
			   {
				   numOfMatches++;
			   }
		   }
		   if (numOfMatches == 2)
		   {
			   return 3;
		   }
		   if (numOfMatches == 3)
		   {
			   return 7;
		   }
	   }
	   return numOfMatches;
	   
   }
   

   
   public int checkFlush()
   {
	   int numOfMatches = 0;
	   for (int m = 0; m < 5; m++)
	   {
		   numOfMatches = 0;
		   for (int i = m + 1; i < 5; i++)
		   {
			   if(temp_deck[m].getSuit() == temp_deck[i].getSuit())
			   {
				   numOfMatches++;
			   }
		   }
		   if (numOfMatches == 4)
		   {
			   return 5;
		   }
	   }
	   return numOfMatches;
   }
   
   
   
   public int checkStraight()
   { 
	   int cardValue[] = new int[5];
	   for (int i = 0; i < 5; i++)
	   {
		   if (temp_deck[i].getFace().equals("Ace"))
		    cardValue[i] = 1;
		   else if (temp_deck[i].getFace().equals("Deuce"))
			   cardValue[i] = 2;
		   else if (temp_deck[i].getFace().equals("Three"))
			   cardValue[i] = 3;
		   else if (temp_deck[i].getFace().equals("Four"))
			   cardValue[i] = 4;
		   else if (temp_deck[i].getFace().equals("Five"))
			   cardValue[i] = 5;
		   else if (temp_deck[i].getFace().equals("Six"))
			   cardValue[i] = 6;
		   else if (temp_deck[i].getFace().equals("Seven"))
			   cardValue[i] = 7;
		   else if (temp_deck[i].getFace().equals("Eight"))
			   cardValue[i] = 8;
		   else if (temp_deck[i].getFace().equals("Nine"))
			   cardValue[i] = 9;
		   else if (temp_deck[i].getFace().equals("Ten"))
			   cardValue[i] = 10;
		   else if (temp_deck[i].getFace().equals("Jack"))
			   cardValue[i] = 11;
		   else if (temp_deck[i].getFace().equals("Queen"))
			   cardValue[i] = 12;
		   else if (temp_deck[i].getFace().equals("King"))
			   cardValue[i] = 13;
	   }
	   int numOfCard = 0;
	   for (int m = 0; m < 5; m++) 
	   {
		   for (int j = m + 1; j < 5; j++)
		   {
			  if (cardValue[m] + 1 == cardValue[j])
				   numOfCard++;
		   }
	   }
	   if (numOfCard == 4)
		   return 4;
	   
	   return numOfCard;
   }
   
   
   
   public int checkFullHouse()
   {
	   int numOfPairs = 0;
	   for (int m = 0; m < 5; m++)
	   {
		   
		   for (int i = m + 1; i < 5; i++)
		   {
			   
			   if (temp_deck[m].getFace() == temp_deck[i].getFace())
			   {
				   numOfPairs++;
			   }
		   }
	   }
	   
	   int numOfMatches = 0;
	   for (int m = 0; m < 5; m++)
	   {
		   numOfMatches = 0;
		   for (int i = m + 1; i < 5; i++)
		   {
			   if(temp_deck[m].getFace() == temp_deck[i].getFace())
			   {
				   numOfMatches++;
			   }
		   }
		   if (numOfPairs >= 1 && numOfMatches == 3)
			   return 6;
	   }
	   return numOfPairs + numOfMatches;
   } 
} // end class DeckOfCards