import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args){
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        int SUM = 0;
        long AVG = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while(true){
            try{
                String numInput = scanner.nextLine();
                int number = Integer.parseInt(numInput);
                SUM += number;
                count++;
            } catch (NumberFormatException badUserData){
                break;
            }
        }

        if (count >0){
            AVG = Math.round((double) SUM/count);
        }
        System.out.println("SUM = " + SUM + " AVG = " + AVG);
    }

}
