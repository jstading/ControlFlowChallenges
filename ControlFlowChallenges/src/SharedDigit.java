public class SharedDigit {
    public static void main(String[] args){
        System.out.println(hasSharedDigit(12, 33));
    }

    public static boolean hasSharedDigit(int num1, int num2){
        if ((num1 <10 || num1 >99) || (num2 <10 || num2 >99)){
            return false;
        } else {
            String strNum1 = Integer.toString(num1);
            String strNum2 = Integer.toString(num2);

            for (int i = 0; i < strNum1.length(); i++){
                for (int j = 0; j <strNum2.length(); j++){
                    if (strNum1.charAt(i) == strNum2.charAt(j)){
                        return true;
                    }
                    }
                }
            }

            return false;
        }
    }



