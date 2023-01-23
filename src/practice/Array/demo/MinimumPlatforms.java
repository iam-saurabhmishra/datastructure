package practice.Array.demo;


import java.util.Arrays;

/**
 * Given arrival and departure times of all trains that reach a railway station.
 * Find the minimum number of platforms required for the railway station so that no train is kept waiting.
 * Consider that all the trains arrive on the same day and leave on the same day.
 * Arrival and departure time can never be the same for a train but we can have arrival time of one train
 * equal to departure time of the other. At any given instance of time, same platform can not be used for both
 * departure of a train and arrival of another train. In such cases, we need different platforms.
 *
 * Input: n = 6
 * arr[] = {0900, 0940, 0950, 1100, 1500, 1800}
 * dep[] = {0910, 1200, 1120, 1130, 1900, 2000}
 * Output: 3
 * Explanation:
 * Minimum 3 platforms are required to
 * safely arrive and depart all trains.
 */
public class MinimumPlatforms {
    public static void main(String[] args) {


       // int arr[] ={900,1100,1235};
       // int dep[] ={1000,1200,1240};

        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};

        System.out.println(findPlatform_allPassed(arr,dep,6));

    }

    public static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int departure=dep[0];
        int ptCount=0;

        for (int i = 1; i < n ; i++) {
           if(arr[i]<departure){
               ptCount++;
           }
           if(dep[i]<departure){
               departure=dep[i];
           }
        }
        return ptCount;

    }

    static int findPlatform_allPassed(int arr[], int dep[], int n)
    {

        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=1,j=0,totalPlatform=1;
        while(i<n && j<n) {
            if(dep[j]<arr[i]) {
                i++;
                j++;
            } else {
                i++;
                totalPlatform++;
            }
        }
        return totalPlatform;

    }
}
