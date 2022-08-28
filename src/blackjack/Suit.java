package blackjack;

public enum Suit {

	Clubs {
		@Override
		public int getRank() {
			return 1;
		}
		@Override
		public String toString() {
			return "Clubs";
		}
	}, Diamonds {
		@Override
		public int getRank() {
			return 2;
		}
		@Override
		public String toString() {
			return "Diamonds";
		}		
	}, Hearts {
		@Override
		public int getRank() {
			return 3;
		}
		@Override
		public String toString() {
			return "Hearts";
		}

	}, Spades {
		@Override
		public int getRank() {
			return 4;
		}
		@Override
		public String toString() {
			return "Spades";
		}

	};

	public abstract int getRank();
	public abstract String toString();
}
