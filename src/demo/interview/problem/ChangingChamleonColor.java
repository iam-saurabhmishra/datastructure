package demo.interview.problem;

public class ChangingChamleonColor implements demo{
    public static void main(String[] args) {

        int[][] arr={{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},
                {0,0,0,1,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};


        int start=2;
        int target=3;
        int count =0;
        boolean flag=true;
        while(flag){
            for(int j=0;j<10;j++){
                if(arr[start][j]==1){
                    start=j;
                    count=count+1;
                    break;
                }
            }
            if(start==target){
                flag=false;
            }
            if(count==0){
                flag=false;
                count=-1;
            }
        }
        System.out.println(count);
        new ChangingChamleonColor().display();
        System.out.println(demo.sa);

    }

    @Override
    public void display() {
        System.out.println("saurabh");
    }
}

interface demo{

    public static int sa=10;
    public void display();
}
