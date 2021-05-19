public void heapSort()
{
  int[] number={5,4,3,2,1};
  for(int number:number)
  {
     heap.insert(number);
  }
  for(int i=0;i<number.length;i++)
  {
      number[i]=heap.remove;
  }
  System.out.println(Arrays.toString(number));
}
