package BubbleSort;

public class bubble {
    public static void main(String[] args){
     int[] intArray = {20, 35, -15, 7, 55, 1, -22};

//     for( int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex-- )
//     {
//         for (int i=0 ; i<lastUnsortedIndex; i++)
//         {
//             if(intArray[i] > intArray[i+1])
//             {
//                 swap(intArray, i ,i+1);
//
//             }
//         }
//     }
//    for (int i = 0; i<intArray.length;i++)
//    {
//        System.out.println(intArray[i]);
//    }
        for(int i = 0; i <intArray.length-1 ; i++)
        {
            for(int j = 0 ; j<intArray.length-i-1; j++)
            {
                if(intArray[j]>intArray[j+1])
                {
                    swap(intArray,j,j+1);
                }
            }
        }
        for (int i = 0; i<intArray.length;i++)
    {
        System.out.println(intArray[i]);
    }
    }
// Swap funtion to swap element in Array
    public static void swap(int[] array,int i, int j)
    {
        if( i==j)
        {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
