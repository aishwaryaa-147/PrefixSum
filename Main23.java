import java.util.Scanner;
public class Main23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] pf = new int[n];
        pf[0] = arr[0];
        for(int i = 1; i < n; i++) {
            pf[i] = pf[i - 1] + arr[i];
        }

        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            int x = sc.nextInt();
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            if(x == 1) {
                int sum = pf[x2] - (x1 > 0 ? pf[x1 - 1] : 0);
                System.out.println(sum);
            }

            if(x == 2) {
                //arr[x1] += x2;
                // Recompute prefix  sum
               /*  pf[0] = arr[0];
                for(int j = 1; j < n; j++) {
                    pf[j] = pf[j - 1] + arr[j];
                }*/
                for(int j=x1;j<n;j++)
                {
                    pf[j]+=x2;
                }
            }
        }
    }
}
