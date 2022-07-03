import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalInt;

/**
 * Класс для нахождения среднего арифметического минимального и максимального значений матрицы элементов,расположенных выше побочной диагонали.
 * @author Саша Янушевич
 * @version 1.1
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrix = createMatrix(4,5);
        for (int[] line : matrix) {
            System.out.println(Arrays.toString(line));
        }
        System.out.println(func(matrix,4,5));
    }
    /**
     * Функция получения среднего арифмитического
     * @param size размер матрицы
     * @param size1 размер матрицы
     * @return возвращает среднее арифмитическое
     *
     */
    public static int[][] func(int[][] matrix, int size,int size1) {
        int[] mas1=new int[size1];
        int[] mas2=new int[size1];
        int sredn=0;
        for (int i = 0; i < size; i++) {
            mas1[i]=matrix[i][0];
            mas2[2]=matrix[i][size1];
        }
        int flag=0;
        int help;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size1; j++) {
                if(j%2==0){
                    do {
                        for (int k = 0; k <= size; k++){
                            if(matrix[k][j]>matrix[k++][j])
                            {
                                flag++;
                            }else{
                                help=matrix[k++][j];
                                matrix[k++][j]=matrix[k][j];
                                matrix[k++][j]=help;
                                flag=0;
                            }
                        }
                    }while (flag!=size1);
                }

            }
        }
        return matrix;
    }
    /**
     * Функция создания матрицы
     * @return возвращает заполненую матрицу
     * @param size размер матрицы
     * @param size1 размер матрицы

     */
    public static int[][] createMatrix(int size,int size1) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int) (Math.random());
            }
        }
        if(matrix == null || matrix.length == 0) return null;
        return matrix;
    }
}


