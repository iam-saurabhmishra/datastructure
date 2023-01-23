package demo;
import java.util.*;

public class DemoString {


    public static void main(String[] args) {

        // -1 4 4 5 8 8 -1 3
        // -1 4 4 5 8 8 -1 3
        int [] arr=printPreviousSmallerNumber(new int[]{4,2,1,5,6,3,2,4,2});
        for(Integer i:arr){
            System.out.print(i+" ");
        }
        System.out.println("");
        //-1 -1 -1 2 3 2 2 6 2
        //-1 -1 -1 2 3 2 2 6 2

        /////////////////////////////////////////////////////////////////////

        /////////////////////////////////////////////////////////////////////
        DemoString demoString=new DemoString();
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                demoString.printEven();
            }
        };
        Runnable r2=new Runnable() {
            @Override
            public void run() {
                demoString.printOdd();
            }
        };

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        //t1.start();
        //t2.start();

        ///////////////////////////////////////////////////////////////////////////////////////

        ///////////////////////////////////////////////////////////////////////////////////////
        String s= "aabaab!bb";
        System.out.println(getLongestSubStringWithNoRepeatingChar(s));

        ///////////////////////////////////////////////////////////////////////////////////////

        ///////////////////////////////////////////////////////////////////////////////////////
        Comparator<Employee1> c=(e1,e2)->-(e1.getName().compareTo(e2.getName()));
        List<Integer> list=Arrays.asList(1,2,3,4,5);
        TreeMap<Employee1,String> map=new TreeMap<>(c);
        Employee1 emp1= new Employee1("1","Saurabh","Sales",28,3000000);
        Employee1 emp2= new Employee1("2","Harish","IT",25,1500000);
        map.put(emp1,"Added");
        map.put(emp2,"Added");

        //System.out.println(map);

    }

    public synchronized void printEven() {


        //for even

        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Even "+i);
                notify();
            }
        }
    }

    public synchronized void printOdd() {


        //for odd

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Odd "+i);
                notify();
            }
        }
    }


    public static int[] printPreviousSmallerNumber(int arr[]){

        Stack<Integer> s=new Stack<>();
        int[] res=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            while (!s.isEmpty() && arr[i]<=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                res[i]=-1;
            }
            else {
                res[i]=s.peek();
            }
            s.push(i);
        }
        return res;
    }

    public static int getLongestSubStringWithNoRepeatingChar(String str){
        int maxLength=Integer.MIN_VALUE;

        Map<Character,Integer> map=new HashMap<>();
        int start,end;
        start=end=0;

        while (end<str.length()){

            Character ec=str.charAt(end);
            if(map.containsKey(ec)){
                int temp=start;

                start=Math.max(start,map.get(ec)+1);
                map.remove(str.charAt(temp));
                map.put(ec,start);

            }
            else {
                map.put(ec,end);
                maxLength=Math.max(maxLength,end-start+1);
            }
            end++;

        }

        return maxLength;
    }

    public static int getLongestNonRepatingSubstringLength(String str){
        int result=Integer.MIN_VALUE;

        Map<Character,Integer> map=new HashMap<>();

        int start,end;
        start=end=0;

        while (start<=end){
            Character c=str.charAt(end);
            if(!map.containsKey(c)){
                map.put(c,end);
                result=Math.max(result,(end-start)+1);
                end++;
            }
            else{
                start=Math.max(start,map.get(c));
            }
        }
        return result;
    }

}

