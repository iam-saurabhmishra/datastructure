package practice.Array.demo;

class FindSingle
{
    /**
     * Each number is repeated twice except one . Find that one non-repeated number.
     * @param ar
     * @param ar_size
     * @return
     */
    static int findSingle(int ar[], int ar_size)
    {

        int res = ar[0];
        for (int i = 1; i < ar_size; i++)
            res = res ^ ar[i];

        return res;
    }

    // Driver code
    public static void main (String[] args)
    {
        //int ar[] = {2, 3, 5, 4, 5, 3, 4};
        int ar[] = {2, 3, 2};
        int n = ar.length;
        System.out.println("Element occurring once is " +
                findSingle(ar, n) + " ");
    }
}

