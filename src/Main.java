import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int value1 = 10;
        int value2 = value1;
        System.out.println(value1);
        System.out.println(value2);
        value1--;
        value2++;
        System.out.println(value1);
        System.out.println(value2); //although value 2 is assigned to value 1, the memory location is different such
        // that value2 is unaffected by any later value1 modifications

        int[] array1 = new int[2];
        int[] array2 = array1;
        array1[0] = 10;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        array2[0]--;
        array1[0]*=2;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2)); //array2 did not use 'new' keyword, therefor, both variables array1
        //and array2 both point to the same address in memory for the same array object

        modifyArray(array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        array2 = new int[2]; // derefenced array2 via 'new' keyword and has its own memory lcoation
        array2[0] = 500;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

    }

    public static void modifyArray(int[] array){ // 'array' is the third reference to the same memory location
        array[0]/=3;
    }
}