package practice.Array.demo;

public class MergeSortedArray {

    public static void main(String[] args) {

        int [] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(" "+nums1[i]);
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int l1=0,l2=0,count=0;
        while (l1<m || l2<n){

            if(nums1[l1]<=nums2[l2]){
                nums1[count]=nums1[l1];
                l1++;
            }
            else{
                nums1[count]=nums2[l2];
                l2++;
            }
            count++;
        }

    }
}
