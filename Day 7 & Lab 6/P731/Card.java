package P731;
// Fig. 7.9: Card.java
// Card class represents a playing card.

public class Card 
{
   private final String face; // face of card ("Ace", "Deuce", ...)
   private final String suit; // suit of card ("Hearts", "Diamonds", ...)

   // two-argument constructor initializes card's face and suit
   public Card(String face, String suit)
   {
      this.face = face;
      this.suit = suit; 
   } 

   // return String representation of Card
   public String toString() 
   { 
      return face + " of " + suit;
   } 
   
   public String getFace()
   {
	   return face;
   }
   
   public String getSuit()
   {
	   return suit;
   }
} // end class Card