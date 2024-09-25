public class EvenDigitSum {
    public static void main(String[] args){
        System.out.println(getEvenDigitSum(2020));
    }

    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        } else {
            int digitSums = 0;
            String numString = Integer.toString(number);

            for(int i = 0; i<numString.length(); i++){
                int checkEven = Integer.parseInt(String.valueOf(numString.charAt(i)));

                if (checkEven % 2 == 0){
                    digitSums = digitSums + checkEven;
                }
            }

            return digitSums;
        }
    }

}
