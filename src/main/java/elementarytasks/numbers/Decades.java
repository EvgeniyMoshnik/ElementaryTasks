package elementarytasks.numbers;

public enum Decades {

    TWENTY("двадцать"),
    THIRTY("тридцать"),
    FORTY("сорок"),
    FIFTY("пятьдесят"),
    SIXTY("шестьдесят"),
    SEVENTY("семьдесят"),
    EIGHTY("восемьдесят"),
    NINETY("девяносто");

    private String value;

    Decades(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
