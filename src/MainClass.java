public class MainClass {
    static final int ARRAY_NUMBER = 8;
    public static void main(String[] args) {
        int[][] arr = new int[ARRAY_NUMBER][ARRAY_NUMBER];
        arrayInitialize(arr);


    }
    public static void arrayInitialize(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(i % 2 == 0){
                    array[i][j] = j+1;
                } else {
                array[i][j] = array.length - j;}
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
