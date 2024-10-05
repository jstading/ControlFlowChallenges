// DEV
public class FlourPacker {
    public static void main(String[] args){
        //System.out.println(canPack(4, 18, 19));
        //System.out.println(canPack(2, 10, 18));
        //System.out.println(canPack(0, 5, 4));
        //System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(2, 1, 5));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){

        int BIG_WEIGHT = 5;

        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)){
            return false;
        }

        boolean result = false;
        int totalBigweight = bigCount * BIG_WEIGHT;
        if (goal <= (totalBigweight)){
            int remaining = goal % BIG_WEIGHT;
            if (smallCount >= remaining){
                result = true;
            }
        } else {
            if (smallCount >= goal - totalBigweight){
                result = true;
            }
        }
        return result;
    }


}
