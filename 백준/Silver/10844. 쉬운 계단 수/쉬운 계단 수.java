import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt( br.readLine());
        long[][] dp = new long[n+1][10];
        for( int i=1; i<10; i++){
            dp[1][i]=1;
        }
        long ceil=1_000_000_000;
        for(int i=2; i<n+1; i++ ){
            for(int j=0; j<10; j++){
                long x=dp[i-1][j]%ceil;
                if(j==0){
                    dp[i][1]=(dp[i][1]+x)%ceil;
                }else if(j==9){
                    dp[i][8]=(dp[i][8]+x)%ceil;
                }else{
                    dp[i][j-1]=(dp[i][j-1]+x)%ceil;
                    dp[i][j+1]=(dp[i][j+1]+x)%ceil;
                }
            }
        }
            long ans = 0;
            for(int i=0; i<10; i++){
                ans=(ans+dp[n][i])%ceil;
            }
            System.out.println(ans);
        }
    }



