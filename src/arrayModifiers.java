import java.sql.Array;
import java.util.Random;

public class arrayModifiers {
    public static void main(String[] args) {
        int[] data = generateDataArray(10);
        System.out.println("generated:");
        printArray(data);

        System.out.println("reversed:");
        printArray(reverseArray(data));

        System.out.println("Max:" + max(data));
        System.out.println("Min:" + min(data));
    }

    public static void printArray(int[] data){
        for (int i = 0;i < data.length; i++){
            System.out.println(data[i]);
        }
    }

    public static int[] generateDataArray(int size){
        int[] data = new int[size];
        Random random = new Random();
        for (int i = 0; i < data.length; i++){
            data[i] = random.nextInt(100);
        }
        return data;
    }

    public static int[] reverseArray(int[] data){
        int[] reversedArray = new int[data.length];

        for (int i = 0; i < data.length; i++){
            reversedArray[data.length-1-i] = data[i];
        }

        return reversedArray;
    }

    public static int max(int[] data){
        int max = 0;

        for (int i = 0; i < data.length; i++){
            if(max < data[i]){
                max = data[i];
            }
        }

        return max;
    }

    public static int min(int[] data){
        int min = data[0];

        for (int i = 0; i < data.length; i++){
            if(min > data[i]){
                min = data[i];
            }
        }

        return min;
    }
}
