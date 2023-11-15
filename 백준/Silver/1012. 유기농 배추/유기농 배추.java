import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    static void recur(int x, int y, int[][] mat){
        if(mat[x][y]<1){
            return;
        }
        mat[x][y]=-1;
        for ( int k=-1; k<=1; ){
            if(mat[x+k][y]==1){
                recur(x+k,y,mat);
            }
            if(mat[x][y+k]==1){
                recur(x,y+k,mat);
            }
            k+=2;
        }
    }

    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] E_Sense = new int[n];
        String[] s;
        for (int i = 0; i < n; i++) {
            s = br.readLine().split(" ");
            int w=Integer.parseInt(s[0])+2;
            int h=Integer.parseInt(s[1])+2;
            int BatChu= Integer.parseInt(s[2]);
            int[][] mat = new int[w][h];

            for (int j = 0; j < BatChu; j++) {
                s = br.readLine().split(" ");
                mat[Integer.parseInt(s[0])+1][Integer.parseInt(s[1])+1]++;
            }

            for( int x=1; x<w; x++){
                for (int y=1; y<h; y++){
                    if(mat[x][y]==0){
                        continue;
                    }else {
                        if(mat[x][y]==1){
                            E_Sense[i]++;
                            recur(x,y,mat);
                        }
                    }
                }
            }
        }
        for (int Blanky_Munn : E_Sense){
            System.out.println(Blanky_Munn);
        }
    }
    }



