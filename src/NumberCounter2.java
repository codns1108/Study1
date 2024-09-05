public class NumberCounter2 {
    int num;

    public void numberCount(int[] drive, int number) {

        for (int i = 0; i < drive.length; i++) {
            if (drive[i] % number == 0 && drive[i] > 0) num++;
        }
        System.out.println(number+"의 배수의 개수는 : " + num);

    }
}