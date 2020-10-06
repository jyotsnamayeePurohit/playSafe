package casino.game.roulette;

import casino.game.BetTarget;

public class NumberTarget implements BetTarget {

    public static final double PAYOFF = 36.0;
    private final int number;

    NumberTarget(final int number) {
        this.number = number;
    }

    public double payoff() {
        return PAYOFF;
    }

   
    public String valueToString() {
        return String.valueOf(number);
    }

    public boolean equals(final BetTarget other) {
        try {
            return this.number == Integer.valueOf(other.valueToString());
        } catch (NumberFormatException ex) {
            return false;
        }
    }

}
