package InsertionSort;

public class InsertionSort {
    public static void main(String[] args)
    {
        int[] intArray = {30,-4,5,20,12,-67,45};
        int keyValue;
        for(int i=1; i<intArray.length;i++)
        {
            keyValue = intArray[i];
            int j = i-1;
            while(j>=0 && intArray[j]>=keyValue)
            {
                intArray[j+1] = intArray[j];
                j=j-1;
            }
            intArray[j+1] = keyValue;

        }
        for(int i=0 ; i<intArray.length;i++)
        {
            System.out.println(intArray[i]);
        }

    }
}
