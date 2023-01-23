package demo.interview.problem;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RotateArray {

    public static void main(String[] args) {
       // System.out.println(timeConversion("07:05:45PM"));
       // node arr[] = { new node( 100,"xbnnskd"), new node(50,"geek"),new node(50,"sasa")};
        //sortRecords(arr,2);
        System.out.println(printString("Thisisdemostring",'i',3));

    }

    public static String timeConversion(String s) {
        // Write your code here
        //hh:mm:ssAM
        int hr=Integer.parseInt(s.split(":")[0]);
        int min=Integer.parseInt(s.split(":")[1]);
        String str=s.split(":")[2];
        int sec=Integer.parseInt(str.substring(0,str.length()-3));
        String format=str.substring(str.length()-2,str.length()-1);
        if(format.equals("PM") && hr<12){
            hr=hr+12;
        }
        if(format.equals("AM") && hr==12){
            hr=0;
        }
        System.out.println(hr+"s");
        if(hr+"".length()==1){
            return hr+""+hr+":"+min+":"+sec;
        }
        return hr+":"+min+":"+sec;

    }

    static void  sortRecords(node arr[],int n)
    {
        Comparator<node> c=((e1,e2)->(e1.salary==e2.salary)?(e1.name.compareTo(e2.name)):((e1.salary>e2.salary?-1:1)));
       Arrays.sort(arr,c);
        for(node e:arr){
            System.out.println(e.name +" "+e.salary);
        }

    }

    public static String printString(String S, char ch, int count) {
        int occurance=0;
        int index=0;
        for (int i = 0; i < S.length()-1; i++) {
            if(S.charAt(i)==ch)
                occurance++;
            if(occurance==count){
                index=i+1;
                break;
            }
        }
        return S.substring(index,S.length());
    }


}

class node
{
    int salary;
    String name;

    public node(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public void setSalary(int a)
    {
        this.salary=a;
    }
    public void setName(String s)
    {
        this.name=s;
    }
}

