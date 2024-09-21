public class NumberPalindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome(122));
    }

    public static boolean isPalindrome(int number){
        if (number < 0){
            number = number * -1;
        }

        String numString = Integer.toString(number);
        String reverse = "";
        char ch;

        for (int i = 0; i<numString.length(); i++){
            ch = numString.charAt(i);
            reverse = ch+reverse;
        }

        int numReverse = Integer.parseInt(reverse);

        if (numReverse == number){
            return true;
        } else{
            return false;
        }
    }
}
