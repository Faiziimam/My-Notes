 public void remove()
    {
        if(isEmpty())
        {
            throw new IllegalStateException();
        }
        item[0]=item[--size];
        bubbleUp();
    }
 //This function will work if the root node data is smaller than the child node data (it will swap the data of the larger child to the root node) 
    public void bubbleDown()
    {
        int index=0;
        while(index<=size && !isValid(index))
        {
           var largerChildIndex=largerChildIndex(index);
           swap(index,largerChildIndex);
           index=largerChildIndex;
        }
    }
// To distinguish whilch child node have larger data;
    public int largerChildIndex(int index) { return (leftIndex(index)> rightIndex(index))? leftChildIndex(index) : rightChildIndex(index); }
  
// These two functions are use to find the index of left and right child respectivly
    public int leftIndex(int index) { return item[leftChildIndex(index)]; }
    public int rightIndex(int index) { return item[rightChildIndex(index)]; }
// General Formula to find childs index
    public int leftChildIndex(int index) { return (index*2+1); }
    public int rightChildIndex(int index) { return (index*2+2); }

// This will tell you wether you need to perform bubble downn operation or not
    public boolean isValid(int index)
    {
        return item[index]>=leftIndex(index) && item[index]>=rightIndex(index);
    }
