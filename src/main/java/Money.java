public abstract class Money {

    protected int amount;

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
}