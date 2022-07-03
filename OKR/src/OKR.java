import java.util.Scanner;

public class OKR
{

    public  int[] Arr(int arr[], int n) {

        System.println("Введите значение k");
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int flag=0;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]%10==k)
            {
                flag++;
            }
        }
        int[] arr1=new int[flag];
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]%10==k)
            {
                arr1[i]=arr[i];
            }
        }
        return arr1;
    }

}
