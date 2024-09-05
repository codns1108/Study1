public class Main {
    public static void main(String[] args) {
        int[] drive = new int[50];
        RandomG2 randomG2 = new RandomG2();
        randomG2.randomG(drive);

        NumberCounter2 numberCounter2 = new NumberCounter2();
        numberCounter2.numberCount(drive, 2);
        NumberCounter2 numberCounter3 = new NumberCounter2();
        numberCounter3.numberCount(drive, 3);
        NumberCounter2 numberCounter4 = new NumberCounter2();
        numberCounter4.numberCount(drive, 5);

        NumberPrinter2 numberPrinter2 = new NumberPrinter2();
        numberPrinter2.numberPrinter(drive);

    }
}
