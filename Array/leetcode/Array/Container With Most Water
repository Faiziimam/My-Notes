class Solution {
    public int maxArea(int[] a) {
       int area=0,l=0,h=a.length-1;
        while(l<=h)
        {
            area=Math.max(area,Math.min(a[l],a[h])*(h-l));
            
            if(a[l]<a[h])
                l++;
            else
                h--;
        }
    return area;
    }
}
