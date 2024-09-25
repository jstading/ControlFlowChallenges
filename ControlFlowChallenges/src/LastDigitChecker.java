public class LastDigitChecker {
    public static void main(String[] args){
        System.out.println(hasSameLastDigit(12, 22, 45));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if ((num1 < 10 || num1 > 1000) || (num2 < 10 || num2 > 1000) || (num3 < 10 || num3 > 1000)){
            return false;
        } else {
            String strNum1 = Integer.toString(num1);
            String strNum2 = Integer.toString(num2);
            String strNum3 = Integer.toString(num3);

            int i = strNum1.length() - 1;
            int j = strNum2.length() - 1;
            int k = strNum3.length() - 1;

            /*if ( (strNum1.charAt(i) == strNum2.charAt(j)) || (strNum1.charAt(i) == strNum3.charAt(k)) ||
                    (strNum2.charAt(j) == strNum3.charAt(k))){
                return true;
            }*/

            if (strNum1.charAt(i) == strNum2.charAt(j)){
                return true;
            } else if (strNum1.charAt(i) == strNum3.charAt(k)){
                return true;
            }else if (strNum2.charAt(j) == strNum3.charAt(k)){
                return true;
            }else{
                return false;
            }
        }
    }

}
