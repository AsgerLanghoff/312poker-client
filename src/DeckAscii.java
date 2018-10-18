public class DeckAscii {
	static final char SPADES = '♠';
	static final char HEARTS = '♥';
	static final char DIAMONDS = '♦';
	static final char CLUBS = '♣';

	
	public static void main(String[] args) {
		int[] value = {11, 5};
		int[] color = {1, 3};

		
		printHand(value, color);

	}
	
	
	public static void printHand(int[] value, int[] color) {
		
		if (value.length != 2  && color.length != 2 ) {
			System.out.println("Table:");
		} else {
			System.out.println("Hand:");
		}
		String rank[] = new String[value.length];
		char suit[] = new char[color.length];

		for (int c = 0; c < value.length; c++) {
			switch (value[c]) {
			case 0: // ace
				rank[c] = " A";
				break;
			case 1: // two
				rank[c] = " 2";
				break;
			case 2: // three
				rank[c] = " 3";
				break;
			case 3: // four
				rank[c] = " 4";
				break;
			case 4: // five
				rank[c] = " 5";
				break;
			case 5: // six
				rank[c] = " 6";
				break;
			case 6: // seven
				rank[c] = " 7";
				break;
			case 7: // eight
				rank[c] = " 8";
				break;
			case 8: // nine
				rank[c] = " 9";
				break;
			case 9: // ten
				rank[c] = "10";
				break;
			case 10: // jack
				rank[c] = " J";
				break;
			case 11: // queen
				rank[c] = " Q";
				break;
			case 12: // king
				rank[c] = " K";
				break;
			default:
				break;
			}
		}

		for (int c = 0; c < color.length; c++) {
			switch (color[c]) {
			case 0:
				suit[c] = SPADES;
				break;
			case 1:
				suit[c] = HEARTS;
				break;
			case 2:
				suit[c] = DIAMONDS;
				break;
			case 3:
				suit[c] = CLUBS;
				break;
			default:
				break;
			}
		}
		
//		Top of card
		for (int i = 0; i < rank.length; i++) {
			System.out.print("┌─────");
		}
		System.out.println("───┐");

		
//		Middle of card
		for (int i = 0; i < rank.length; i++) {
			System.out.print("│" + rank[i] + " " + suit[i] + " ");
		}
		System.out.println("· ·│");

		for (int line = 0; line < 3; line++) {
			for (int i = 0; i < rank.length; i++) {
				System.out.print("│ · · ");
			}
			System.out.println("· ·│");
		}
		for (int i = 0; i < rank.length-1; i++) {
			System.out.print("│ · · ");
		}
		System.out.println("│ · ·" + rank[rank.length-1] + " " + suit[suit.length-1] + "│");

		
//		Bottom of card
		for (int i = 0; i < rank.length; i++) {
			System.out.print("└─────");
		}
		System.out.println("───┘");

	}

}