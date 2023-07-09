public enum Discount {
    zero(0),
    five(5),
    ten(10),
    fifteen(15),
    twenty(20);

    private final int value;

    Discount(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
