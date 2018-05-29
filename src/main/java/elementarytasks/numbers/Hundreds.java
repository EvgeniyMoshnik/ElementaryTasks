package elementarytasks.numbers;

public enum Hundreds {

    ONE_HUNDRED("сто"),
    TWO_HUNDRED("двести"),
    THREE_HUNDRED("триста"),
    FOUR_HUNDRED("четыресто"),
    FIVE_HUNDRED("пятьсот"),
    SIX_HUNDRED("шестьсот"),
    SEVEN_HUNDRED("семьсот"),
    EIGHT_HUNDRED("восемьсот"),
    NINE_HUNDRED("девятьсот");

    private String value;

    Hundreds(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
