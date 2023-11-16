import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int r = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);
        int x =0;
        n=(int)Math.pow(2.0,n);
        while(n>1){
            n/=2;
            int pass=n*n;
            int coef=0;
            if(r>=n ){
                coef+=2;
                r-=n;
            }
            if(c>=n){
                coef+=1;
                c-=n;
            }
            x+=coef*pass;

        }
        System.out.println(x);



    }
}



