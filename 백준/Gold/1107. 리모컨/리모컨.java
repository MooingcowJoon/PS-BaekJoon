import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {


    static int cal(int[] num){
        int p = 1;
        int ch = 0;
        for (int z = num.length - 1; z >= 0; z--) {
            ch += p * num[z];
            p *= 10;
        }
        return ch;
    }

    static boolean high(TreeSet<Integer> set, int k, int[] num, int min) {
        if(set.contains(num[k])){
            if(k<num.length-1){
                return high(set,k+1,num,min);
            }
            return true;
        }
        while(k>=0 && set.higher(num[k])==10){
            k--;
        }
        if(k==-1){
            return false;
        }
        num[k]=set.higher(num[k]);
        for(int i=k+1; i<num.length; i++){
            num[i]=min;
        }
        return true;
    }
    static boolean low(TreeSet<Integer> set, int k, int[] num,int max) {
        if(set.contains(num[k])){
            if(k<num.length-1){
                return low(set,k+1,num,max);
            }
            return true;
        }
        while(k>0 && set.lower(num[k])==-1){
            num[k]=0;
            k--;
        }
        if(k==0){
            if(num.length>2){
                k=1;
            }else{
                return false;
            }
        }else{
            num[k]=set.lower(num[k]);
        }
        for(int i=k+1; i<num.length; i++){
            num[i]=max;
        }
        return true;
    }
    static int[] test(boolean[] btn, String s ){
        int[] arr = new int[3];
        int n = s.length();
        int[] num = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            num[i] = s.charAt(i - 1) - 48;
        }
        int t=0;
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0; i<10; i++){
            if(btn[i]){
                set.add(i);
            }else{
                t++;
            }
        }
        int snum = Integer.parseInt(s.strip());
        int alt = Math.min(Math.abs(snum - 100), Math.abs(100 - snum));
        if (t < 10) {
            if (t == 0) {
                int cost =Math.min(alt, n);
                arr[0]=cost;
                return arr;
            }
            int max= set.last();
            int min = set.first();
            set.add(-1);
            set.add(10);
            int low = 0;
            int high = 0;
            boolean pass=true;
            int[] num2=num.clone();
            boolean flag2 = false;
            for (int i = 1; i < n + 1; i++) {
                if (!btn[num[i]]) {
                    pass=false;
                    if(high(set, 1, num,min)){
                        high=cal(num);
                    }else{
                        high=-1;

                    }
                    if(low(set, 1,num2,max)){
                        low=cal(num2);
                    }else{
                        low=-1;

                    }
                    if(high==-1){
                        high=low;
                    }
                    if(low==-1){
                        low=high;
                    }
                    break;
                }
            }

            if(pass){
                int cost = Math.min(s.length(),alt);
                arr[0]=cost;
                return arr;
            }else{
                String hs = String.valueOf(high);
                String ls= String.valueOf(low);
                int ans= Math.min(Math.abs(high-snum)+hs.length(),Math.abs(snum-low)+ls.length());
                ans=Math.min(ans,alt);
                arr[0]=ans;
                arr[1]=low;
                arr[2]=high;
                return arr;
            }

        }else{
            arr[0]=alt;
            return arr;
        }
    }
    public static void main(String[] args) throws IOException {
            boolean[] btn=new boolean[10];
            for(int i=0; i<10; i++){
                btn[i]=true;
            }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length();
        int[] num = new int[n + 1];
        int t = Integer.parseInt(br.readLine().strip());
        if(t>0){
            String[] ss = br.readLine().split(" ");
            for (String d : ss) {
                int a = Integer.parseInt(d);
                btn[a] = false;
            }
        }

        System.out.println(test(btn,s)[0]);


//        boolean[] btn=new boolean[10];
//
//        String filePath = "C:\\untitled\\src\\tc.txt";
//        int index=0;
//        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//
//                for( int i=0; i<10; i++){
//                    btn[i]=true;
//                }
//                String[] s = line.split(" ");
//                int ch=Integer.parseInt(s[0]);
//
//
//                int n = Integer.parseInt(s[1]);
//                int i=2;
//                for(int j=0; j<n; j++){
//                    int x = Integer.parseInt(s[i++]);
//                    btn[x]=false;
//                }
//                    int expected = Integer.parseInt(s[i++]);
//                    int[] output =test(btn,ch+"");
//                    if(expected!=output[0]){
//                        for(int a=0;a<10;a++){
//                            if(!btn[a]){
//                            }
//                        }
//                        System.out.println(line);
//                        System.out.println("index = "+index+++" ch: "+ch+ " 정답 : "+expected+" ls : "+ output[1] + " hs : "+output[2]);
//                    }else{
//                    }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}







