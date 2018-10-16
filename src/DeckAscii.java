
public class DeckAscii {
    static final char SPADES = '♠';
    static final char HEARTS = '♥';
    static final char DIAMONDS = '♦';
    static final char CLUBS = '♣';

	public static void main(String[] args) {
		int rank = 2;
		char suit = SPADES;
		
		System.out.println("┌────────┐");
		System.out.println("│ "+ rank + " " + suit + " · ·│");
		for(int line = 0; line < 3; line++) {
			System.out.println("│ · · · ·│");
		}
		System.out.println("│ · · "+ rank + " " + suit + "│");
		System.out.println("└────────┘");
	}

}
