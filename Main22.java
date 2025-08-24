import java.util.Scanner;
public class Main22 {
    public static void main(String[] args){
    int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();//taking user input
    }
    int pf[]=new int[n];
    pf[0]=arr[0];
    for(int i=1;i<n;i++)
    {
        pf[i]=arr[i-1]+arr[i];
    }

    int T=sc.nextInt();
    for(int i=0;i<T;i++)
    {  //int sum=0;
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        /*for(int j=x1;j<=x2;j++)
        {
        sum+=arr[j];
        }*/

        System.out.println(pf[x2]-pf[x1-1]);

    }
    }
}

