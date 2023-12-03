import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt( br.readLine());
        int[] input = new int[n];
        //max값은 반드시 3은 돼야함 2칸앞의 원소도 정의돼있어야하니.
        int max=3;
        for (int i=0; i<n; i++){
            input[i] = Integer.parseInt(br.readLine());
            max=Math.max(max,input[i]);
        }


        int[][] dp = new int[max+1][2];
        dp[0][0]=1;
        dp[0][1]=0;
        dp[1][0]=0;
        dp[1][1]=1;
        for( int i=2; i<=max; i++){
            dp[i][0]=dp[i-1][0]+dp[i-2][0];
            dp[i][1]=dp[i-1][1]+dp[i-2][1];
        }
        for (int x : input){
            System.out.println(dp[x][0]+" "+dp[x][1]);
        }
    }
    }



