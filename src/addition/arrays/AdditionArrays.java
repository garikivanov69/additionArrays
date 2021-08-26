package addition.arrays;

public class AdditionArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};
        int[] resultArray = AdditionArrays.addArrays(array1, array2);
        AdditionArrays.showArray(resultArray);
    }

    public static int[] addArrays(int[] array1, int[] array2) {
        int lengthOfResultArray = array1.length + array2.length;
        int[] resultArray = new int[lengthOfResultArray];
        int i = 0;

        for (int j=0; j < array1.length; j++){
            resultArray[i] = array1[j];
            i++;
        }

        for (int j=0; j < array2.length; j++){
            resultArray[i] = array2[j];
            i++;
        }

        return  resultArray;
    }

    public static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
