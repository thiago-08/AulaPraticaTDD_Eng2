public abstract class Money {

    protected int amount;

    protected String currency;

    static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    abstract Money times(int multiplier);

    public boolean equals(Object object) {
        Money money = (Money) object;

        return amount == money.amount
                && getClass().equals(money.getClass());
    }

    static Money franc(int amount) {
        return new Franc(amount);
    }

    String currency() {
        return currency;
    }

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
}