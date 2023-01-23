package practice.backtracking.demo;

public class RatInAMaze {
    public static void main(String[] args) {
        printMazePathForRat(1,1,3,3,"");
    }

    public static void printMazePathForRat(int sr, int sc ,int tr, int tc,String path){

        if(sr>tr || sc>tc){
            System.out.println(path);
            return;
        }
        printMazePathForRat(sr,sc+1,tr,tc,path+"h");
        printMazePathForRat(sr+1,sc,tr,tc,path+"v");
    }
}
