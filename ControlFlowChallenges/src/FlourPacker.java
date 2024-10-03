// DEV
public class FlourPacker {
    public static void main(String[] args){
        System.out.println(canPack(4, 18, 19));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)){
            return false;
        } else if ((goal <= ((bigCount*5) + (smallCount)))){
            int bigFull = goal/5;
            int remainder = goal%5;

            if ((remainder <= smallCount) && (bigFull < bigCount)) {
                return true;
            } else {
                return true;
            }

        }
        return true;
    }

}
