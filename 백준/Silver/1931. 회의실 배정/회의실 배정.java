import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int len = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int ans=0;
        int[][] arr = new int[len][2];
        for (int i=0; i<len; i++){
            st=new StringTokenizer(br.readLine());
            int s= Integer.parseInt(st.nextToken());
            int e= Integer.parseInt(st.nextToken());
            arr[i][0]=s;
            arr[i][1]=e;
        }
        int x=0;
        Arrays.sort(arr,(o1,o2)->o1[1]==o2[1]? o1[0]-o2[0] : o1[1]-o2[1]);
        for(int i=0; i<len; i++){
            int s=arr[i][0];
            int e=arr[i][1];
            if(s>=x){
                ans++;
                x=arr[i][1];
            }
        }

        System.out.println(ans);

    }
}
