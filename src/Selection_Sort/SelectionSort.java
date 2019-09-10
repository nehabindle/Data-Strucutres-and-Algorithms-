//Implementing Selection sort by pushing the minimum element in the beginning of array
package Selection_Sort;

public class SelectionSort {
    public static void main(String[] args)
    {
        int[] intArray = {20, 35,35, -15, 7, 55, -10,-67,1, -22,-22,-22};

  for(int i=0; i < intArray.length-1; i++){
      int min = i;

      for (int j= i+1; j<intArray.length;j++)
      {

        if (intArray[j]<intArray[min])
              min = j;

          }
swap(intArray,i,min);

  }
  for (int i=0; i<intArray.length-1;i++)
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


