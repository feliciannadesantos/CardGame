import java.util.ArrayList;

public class CardGame
	{
  
		public static void main(String[] args)
			{
				Deck.fillDeck();
				Deck.shuffle();
				System.out.println("made change");
				System.out.println(Deck.deck.get(0).getRank());
				ArrayList<Card> player1 = new ArrayList<>();
				ArrayList<Card> player2 = new ArrayList<>();
				for (int i = 0; i < Deck.deck.get(0).getValue(); i++)
					{
						
					}
			}

	}
