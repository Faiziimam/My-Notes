 public static void plusMinus(List<Integer> list) {
       int pos = 0, neg = 0, zero = 0;
       for (int i = 0; i < list.size(); i++) {
           if (list.get(i) == 0)
               zero++;
           else if (list.get(i)>=1)
               pos++;
           else if (list.get(i)<=1)
               neg++;
       }
