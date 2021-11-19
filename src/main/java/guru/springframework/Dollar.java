package guru.springframework;

public class Dollar extends Money {

    // private String currency;

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        // return new Dollar(amount * multiplier);
        return Money.dollar(amount * multiplier);
    }
}
