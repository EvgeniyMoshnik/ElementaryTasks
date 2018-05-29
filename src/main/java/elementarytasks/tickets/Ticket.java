package elementarytasks.tickets;

public class Ticket {
    private static final int LENGTH_TICKET = 6;
    private int numberTicket;

    public Ticket(int number) {
        this.numberTicket = number;
    }

    boolean isTicket(String number) {
        return number.length() == LENGTH_TICKET;
    }

    static boolean isLuckyMoscow(int numberTicket) {
        int delimiter = 1000;
        int partOne = numberTicket / delimiter;
        int partTwo = numberTicket % delimiter;

        return countNum(partOne) == countNum(partTwo);
    }

    static int countNum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    static boolean isLuckyPeter(int numberTicket) {
        int num;
        int sumEven = 0;
        int sumOdd = 0;
        while (numberTicket > 0) {
            num = numberTicket % 10;
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
            numberTicket /= 10;
        }
        return sumEven == sumOdd;
    }

    public int getNumberTicket() {
        return numberTicket;
    }

    public void setNumberTicket(int numberTicket) {
        this.numberTicket = numberTicket;
    }
}
