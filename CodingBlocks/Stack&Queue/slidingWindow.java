public void slidingWindows()
    {
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        int n=s.nextInt();
        Queue<Integer> queue=new LinkedList<>();
        int sum=0;
        while(n!=-1)
        {
            sum+=n;
            queue.add(n);
            if(queue.size()>k)
            {
                sum -= queue.peek();
                queue.poll();
            }

            System.out.format(" %.2f",(double) (sum)/queue.size());
//            System.out.println(" ");
            n=s.nextInt();
        }
        System.out.println(" ");
    }
