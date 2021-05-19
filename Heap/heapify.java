 public void heapify(int[] arr)
  {
     //      To make this logic more optimize
    //      LastParentIndex= N/2-1
   //      example for(int i=LastParentIndex;i>=0;i--}
  
     for(int i=0;i<arr.length;i++)
     {
         heapify(arr,i);
     }
  }
  public void heapify(int[] arr,int index) {
      var largestIndex = index;  //Assuming index is our largestElement(root)
      var leftIndex = index * 2 + 1;
      var rightIndex = index * 2 + 2;

          if (leftIndex < arr.length && arr[leftIndex] > arr[index]) {
              largestIndex = leftIndex;
          }
          if (rightIndex < arr.length && arr[rightIndex] > arr[index]) {
              largestIndex = rightIndex;
          }
          if (index == largestIndex) {
              return;
          }
          swap(arr,index, largestIndex);
          heapify(arr,largestIndex);

  }
    public void swap(int[] arr,int first,int sec)
    {
        int temp=arr[first];
        arr[first]=arr[sec];
        arr[sec]=temp;
    }
