package demo.interview.problem;


import java.util.List;

public class Demo {

    public static void main(String[] args) {

        System.out.println(areRootsReal("4*x^2-7.5"));
        //a*x^2+b*x+c
        //D=b^2-4*a*c

    }

    public static String areRootsReal(String expr){
        String[] str=expr.split("/+");
        int len= str.length;
        double A=0;
        double B=0;
        float C=0;
        Double D;

        if(len==3){
             A=Double.parseDouble(str[0].split("/*")[0]);
             B=Double.parseDouble(str[1].split("/*")[0]);
            // C=Double.parseDouble(str[2]);
             C=Float.parseFloat(str[2]);

        }
        if(len==2){
            B=Double.parseDouble(str[0].split("/*")[0]);
            //C=Double.parseDouble(str[1]);
            C=Float.parseFloat(str[1]);
        }
        if(len==1){
            //C=Double.parseDouble(str[0]);
            C=Float.parseFloat(str[0]);
        }
        D=(B*B)-(4*A*C);

        if(D>0){
            return "Real Roots";
        }
        else{
            return "Not Real Roots";
        }

    }

}

