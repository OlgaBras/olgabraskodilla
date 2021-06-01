public class RandomNumbers {
    private int max = 0;
    private int min = Integer.MAX_VALUE;
public void generateNumbers() {
    Random random = new Random();
        int sum = 0;
        while(sum < 5000) {
            int number= random.nextInt( bound:30);
            sum += number;
            if (max < number) {
                max=number;
            }
            if (min > number) {
                min=number;
            }
        }
    }

    int getMax() {
        return max;
    }

    int getMin() {
        return min;
    }
}
