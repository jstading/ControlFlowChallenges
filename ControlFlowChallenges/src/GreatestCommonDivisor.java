public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(15, 25));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int highestFactor = 1;

        if (first < 10 || second < 10) {
            return -1;
        } else {
            for (int i = 1; i <= first; i++) {
                for (int j = 1; j <= second; j++){
                    if ((first % i == 0) && (second % j == 0) && (i == j)) {
                        highestFactor = i;
                    }
                }
            }
        }

        return highestFactor;
    }

}