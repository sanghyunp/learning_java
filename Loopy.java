public class Loopy{
    public static void main(String[] args){
        int x = 1;
        System.out.println("Before Loop");
        while(x<4){
            System.out.println("Inside of Loop");
            System.out.println("x value is " +x+".");
            x = x+1;
        }
        System.out.println("This is after Loop");
    }
}