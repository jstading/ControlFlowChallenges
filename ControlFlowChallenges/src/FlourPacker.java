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
        int bigWeight = bigCount *5;
        boolean packed = false;

        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)){
            return false;
        } else if (goal <= (bigWeight)){
            int remainder = goal % bigWeight;
            if (smallCount >= remainder){
                packed = true;
            }
        } else if (bigWeight < goal){
            int remainder = goal - bigWeight;
            if (remainder <= smallCount){
                packed = true;
            }
        }
        return packed;
    }

    /*public static boolean canPack(int bigCount, int smallCount, int goal){
        boolean packed = false;
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)){
            return false;
        } else if ((goal <= ((bigCount*5) + (smallCount))) ){
            for (int i = 0; i <=bigCount; i++){
                if (i*5 + smallCount >= goal){
                    packed = true;
                } else if ((goal % 5 == 0)){
                    packed = true;
                }
            }
            if (bigCount * 5 > goal){
                packed = false;
            }
        } else {
            packed = false;
        }
    return packed;
    }*/


}
