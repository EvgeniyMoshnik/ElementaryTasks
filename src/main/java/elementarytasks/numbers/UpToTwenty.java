package elementarytasks.numbers;

public enum UpToTwenty {
    ZERO("ноль"),
    ONEm("один"),
    ONEf("одна"),
    TWOm("два"),
    TWOf("две"),
    THREE("три"),
    FOUR("четыре"),
    FIVE("пять"),
    SIX("шесть"),
    SEVEN("семь"),
    EIGHT("восемь"),
    NINE("девять"),
    TEN("десять"),
    ELEVEN("одинадцать"),
    TVELVE("двенадцать"),
    THIRTEEN("тринадцать"),
    FOURTEEN("четырнадцать"),
    FIFTEEN("пятнадцать"),
    SIXTEEN("шестнадцать"),
    SEVENTEEN("семнадцать"),
    EIGHTEEN("восемнадцать"),
    NINETEEN("девятнадцать");

    private String value;

    UpToTwenty(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
