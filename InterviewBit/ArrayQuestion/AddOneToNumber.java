blic class Main {
    public static ArrayList<Integer> plusOne(ArrayList<Integer> A)
    {
        int start=0;
        int end=A.size()-1;
        int last=A.get(end);
        if(last<9)
        {
            A.set(end,last+1);
        }
        else
        {
            int carry=1;
            A.set(end,0);
            int i=end-1;
            while(i>=start && carry!=0)
            {
                int currvalue=A.get(i);
                if(A.get(i)<9)
                {
                    A.set(i,currvalue+1);
                    carry=0;
                }
                else
                {
                    A.set(i,0);
                    carry=1;
                }
                i--;
            }
            if(carry==1)
                A.set(0,1);
            if(A.get(0)==0)
                A.remove(0);
        }
        for(int i=0;i<end;i++){
            if(A.get(0)==0)
            {
                A.remove(0);
            }
            else
                break;
        }
        return A;
    }


    public static void main(String[] args) {
       ArrayList<Integer> val=new ArrayList<>();
       val.add(1);
       val.add(2);
       val.add(3);

        System.out.println(plusOne(val));

    }
}

