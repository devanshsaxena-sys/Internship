public class squarerootarray {
     public static void root(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
          int sqrt=0;
            for(int j=1;j<=arr[i];j++)
          {
            if(j*j==arr[i])
            {
                sqrt=j;
            }
          }
          arr[i]=sqrt;
        }
    }
     public static void main(String[] args)
    {
        int[] a={4,16,25};
        root(a);
        for(int i=0;i<3;i++)
        {
           System.out.print(a[i]+" ");
        }

    }
    
    
}
