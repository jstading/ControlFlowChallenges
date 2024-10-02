public class NumberToWords {
    public static void main(String[] args){
        //System.out.println(reverse(-123));
        //System.out.println(getDigitCount(112));
        numberToWords(-123);
    }

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        } else {
            String numString = Integer.toString(number);
            char ch;

            for (int i = 0; i<getDigitCount(number); i++) {
                if (i == 0){
                    ch = numString.charAt(i);
                    switch (ch) {
                        case '0' -> System.out.print("Zero");
                        case '1' -> System.out.print("One");
                        case '2' -> System.out.print("Two");
                        case '3' -> System.out.print("Three");
                        case '4' -> System.out.print("Four");
                        case '5' -> System.out.print("Five");
                        case '6' -> System.out.print("Six");
                        case '7' -> System.out.print("Seven");
                        case '8' -> System.out.print("Eight");
                        case '9' -> System.out.print("Nine");
                    }
                } else {
                    ch = numString.charAt(i);
                    switch (ch) {
                        case '0' -> System.out.print(" Zero");
                        case '1' -> System.out.print(" One");
                        case '2' -> System.out.print(" Two");
                        case '3' -> System.out.print(" Three");
                        case '4' -> System.out.print(" Four");
                        case '5' -> System.out.print(" Five");
                        case '6' -> System.out.print(" Six");
                        case '7' -> System.out.print(" Seven");
                        case '8' -> System.out.print(" Eight");
                        case '9' -> System.out.print(" Nine");
                    }
                }
            }
        }
    }

    public static int reverse (int number){
        boolean isNegative = false;

        if (number < 0){
            isNegative = true;
            number = number * -1;
        }

        String numString = Integer.toString(number);
        String reverse = "";
        char ch;

        for (int i = 0; i<getDigitCount(number); i++){
            ch = numString.charAt(i);
            reverse = ch+reverse;
        }

        int numReverse = Integer.parseInt(reverse);

        if (isNegative){
            numReverse = numReverse * -1;
        }

        return numReverse;
    }

    public static int getDigitCount(int number){
        if (number < 0){
            return -1;
        } else{
            int digitCount = String.valueOf(number).length();
            return digitCount;
        }
    }

}
