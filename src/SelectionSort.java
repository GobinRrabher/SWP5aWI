import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int[] data = generateDataArray(10);
        printArray(data);
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
}
