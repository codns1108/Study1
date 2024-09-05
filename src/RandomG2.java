import java.util.Random;

public class RandomG2 {
    public void randomG(int[] drive) {
        Random random = new Random();
        for (int i = 0; i < drive.length; i++) {
            drive[i] = random.nextInt(10);
        }
    }
}