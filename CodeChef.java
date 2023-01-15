import java.util.*;
public class CodeChef {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int t=sc.nextInt();
        int i=0,a,b,p;
        float s;
        while(i<t){
            a=sc.nextInt();
            b=sc.nextInt();
            s=(b/a)*100;
            if(s>=50){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            //s=a*b;
            //if(s%4==0){
              //  System.out.println(s%4);
            //}else{
            //System.out.println(s%4+1);}
            //in=sc.nextInt();
            //if(in>100){
              //  System.out.println(in-10);
            //}else{
              //  System.out.println(in);
            i++;
            }
        } 
}
