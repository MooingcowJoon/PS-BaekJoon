import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;


public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt( br.readLine());
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++){
            arr[i]=Integer.parseInt(br.readLine().split(" ")[0]);
        }
        int[][] dp = new int[n+1][2];
        dp[1][0]=arr[1];
        dp[1][1]=arr[1];
        for(int i=2; i<=n; i++) {
            int x = arr[i];
            dp[i][1] = Math.max(dp[i - 1][0], dp[i - 2][1]) + x;
            dp[i][0] = dp[i - 2][1] + x;
        }
        System.out.println(Math.max(dp[n][0],dp[n][1]));
    }


}
