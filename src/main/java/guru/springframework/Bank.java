package guru.springframework;

public class Bank {

    Money reduce(Expression source, String toCurrency) {
        return source.reduce(toCurrency);
        //Sum sum = (Sum) source;
        // int amount = sum.augmend.amount + sum.addmend.amount;
        //return new Money(amount, toCurrency);
        /*if(source instanceof Money) {
            return (Money) source;
        }
        Sum sum = (Sum) source;
        return sum.reduce(toCurrency);*/

    }
}
