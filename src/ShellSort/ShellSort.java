package ShellSort;

public class ShellSort {
    public static void main(String[] args)
    {
        int[] intArray = {30,-4,5,20,12,-67,45};
        int keyValue;
        int gap;
       for (gap = intArray.length/2 ; gap>0; gap=gap/2)
        for(int i=gap; i<intArray.length;i++)
        {
            keyValue = intArray[i];
            int j=i;

            while(j>= gap && intArray[j-gap] >keyValue)
            {
               intArray[j]=intArray[j-gap];
               j = j - gap;

            }
        intArray[j] = keyValue;
        }
        for(int i=0 ; i<intArray.length;i++)
        {
            System.out.println(intArray[i]);
        }

    }
}
