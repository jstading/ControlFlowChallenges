public class LargestPrime {
    public static void main(String[] args){
        System.out.println(getLargestPrime(21));
    }

    public static int getLargestPrime(int number){
        int largestFactor = -1;
        if (number <= 1){
            return -1;
        }
        for (int i = 2; i * i <= number; i++){
                if (number % i == 0){
                    largestFactor = i;
                    while (number % i == 0){
                        number /= i;
                    }
                }
            }
        return number == 1 ? largestFactor : number;
    }

}
