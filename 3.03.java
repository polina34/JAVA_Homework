import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(9);
        numbers.add(3);
        numbers.add(7);

        int min = numbers.get(0);
        int max = numbers.get(0);
        double sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
            sum += numbers.get(i);
        }

        double average = sum / numbers.size();

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + average);
    }
}