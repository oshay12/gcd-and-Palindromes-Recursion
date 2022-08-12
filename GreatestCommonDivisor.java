import java.util.Random;

public class GreatestCommonDivisor {
    static int[][] xyValues = new int[10][10];

    public static void main(String[] args){
        final int TOP_BOUND = 21; // random method is exclusive to the top bound, so 21 makes the top bound 20
        final int BOTTOM_BOUND = 5;
        Random rand = new Random();

        for(int i = 0; i < xyValues.length; i++) {
            for(int j = 0; j < 2;j++){
                int randValue = rand.nextInt(TOP_BOUND - BOTTOM_BOUND) + BOTTOM_BOUND;
                xyValues[i][j] = randValue;
            }
        }
        System.out.println("x    y   gcd(x,y)");
        System.out.println("==   ==  ========");
        for(int i = 0; i < xyValues.length; i++){
            gcd(xyValues[i][0],xyValues[i][1]);
            System.out.println(padLeft(String.valueOf(xyValues[i][0]),2) + padLeft(String.valueOf(xyValues[i][1]),5) + padLeft(String.valueOf(gcd(xyValues[i][0],xyValues[i][1])),4));
        }
        for(int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int randValue = rand.nextInt(TOP_BOUND - BOTTOM_BOUND) + BOTTOM_BOUND;
                xyValues[i][j] = randValue;
            }
        }
        System.out.println("**** gcd(" + xyValues[0][0] + "," + xyValues[0][1] + ") ****");
        gcd(xyValues[0][0],xyValues[0][1],"");
        System.out.println("Returning: " + gcd(xyValues[0][0],xyValues[0][1]) + " from gcd(" + xyValues[0][0] + "," + xyValues[0][1] + ")" + "\n**** RESULT = " + gcd(xyValues[0][0],xyValues[0][1]) + " ****");
    }


    public static int gcd(int x, int y){
        if(y == 0){
            return x;
        }
        return gcd(y,x % y);
    }

    public static int gcd (int x, int y, String indent){
        if(y == 0){
            return x;
        }
        System.out.println(indent + "Calling: gcd(" + y + "," + x%y + ")");
        indent = indent + "  ";
        System.out.println(indent + "Returning: " + gcd(y,x%y,indent) + " from gcd(" + y + "," + x % y + ")");
        return gcd(y,x%y);
    }
    public static String padLeft(String s, int width)
    { 	String r = s;
        while (r.length() < width)
            r = " " + r;
        return r;
    }

}
