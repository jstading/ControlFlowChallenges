public class FirstLastDigitSum {
    public static void main(String[] args){
        System.out.println(sumFirstAndLastDigit(1256));
    }

    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        } else {
            String numString = Integer.toString(number);
            int lastNum = numString.length() - 1;
            char ch;
            String str1 = "";
            String str2 = "";

            ch = numString.charAt(0);
            str1 = str1 + ch;
            int num1 = Integer.parseInt(str1);

            ch = numString.charAt(lastNum);
            str2 = str2 +ch;
            int num2 = Integer.parseInt(str2);

            return num1 + num2;
        }
    }


}
