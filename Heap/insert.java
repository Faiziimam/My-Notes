package com.company;

public class Main {
    private int[] item=new int[10];
    private int size;

    public void insert(int data)
    {
        if(isFull())
        {
            throw new IllegalStateException();
        }
        item[size++]=data;
        
        //This function swap the nodes if the child node is larger than the parent node.
        bubbleUp();
    }
    public void bubbleUp() {
        var index = size - 1;
        var parentIndex = (index - 1) / 2;
        while (index > 0 && item[index] > item[parentIndex]) {
            swap(index, parentIndex);
            index = (index - 1) / 2;
        }
    }
    //This will check if the size has become equal to the size of the array.
  public boolean isFull() { return (size==item.length); }
    private void swap(int first, int second) {
        var temp=item[first];
        item[first]=item[second];
        item[second]=temp;
    }


    public static void main(String[] args)
    {
         Main heap=new Main();
         heap.insert(10);
         heap.insert(5);
         heap.insert(17);
        System.out.println("Done");


    }
}
