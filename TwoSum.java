public class TwoSum{
    public static void main(String[] args) {
        int[] numbers = {
            10,
            16,
            3,
            7
        };
        int k = 25;
        System.out.println(isTwoElementsAddUpTo(numbers, k));
    }
    static boolean isTwoElementsAddUpTo(int[] numbers, int k) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == k) {
                    return true;
                }
            }
        }
        return false;
    }
}