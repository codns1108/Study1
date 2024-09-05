public class NumberPrinter2 {
    public void numberPrinter(int[] drive) {
        for(int i = 0; i < drive.length; i++) {
            System.out.print(drive[i]);
            if((i+1)%5==0) System.out.println();
        }
    }

}