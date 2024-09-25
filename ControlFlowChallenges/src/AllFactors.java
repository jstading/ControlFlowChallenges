public class AllFactors {

    public static void main(String[] args){
        printFactors(100);
    }

    public static void printFactors(int num1){
        if (num1 < 1){
            System.out.println("Invalid Value");
        } else {
            String factors = "1";

            for (int i = 2; i <= num1/2; i++){
                if (num1%i == 0){
                    factors = factors + " " + i;
                }
            }

            if (num1 == 1){
                System.out.println(factors);
            }else {
                factors = factors + " " + num1;
                System.out.println(factors);
            }
        }
    }

}
