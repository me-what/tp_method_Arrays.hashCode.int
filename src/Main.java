import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ival = new int[] { 3, 5 };
        System.out.println(Arrays.toString(ival));
        int retval = ival.hashCode();
        System.out.println("The hash code of value1 is: " + retval+"\n");


        ival = new int[] { 19, 75 };
        retval = ival.hashCode();
        System.out.println("The hash code of value2 is: " + retval);
        System.out.println(Arrays.toString(ival));
    }
}