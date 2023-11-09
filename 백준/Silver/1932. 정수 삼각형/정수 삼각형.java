import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
            문제 개요
              정수 삼각형의 최상단 꼭지점부터 한칸씩 아래로 최하단 층까지 하나의 정수를 택하며,
              지나온 경로에 해당되는 정수의 합중 그 합이 가장 큰 경로의 합을 구하는 것

            예제 입력
                5
                1
                1 1
                5 1 1
                1 1 1 1
                1 1 1 1 10
            예제 출력
                14

            Constraints
                - 1 <= n <= 500
                - 0 <= x <= 9999

            요구조건
                1. 입력값의 정수들을 자료구조에 담아야 함
                    - 렝스가 n인 2차배열 선언
                    - br.readLine() 반복문으로 입력 문자열 라인 받고,
                    - br의 iterator 또는 next()로 요소 받고 문자열 splice 후 각 숫자 취득
                    - 각 숫자는 반복문 내 지역변수 i+1의 렝스로 담음

               2. 경로 진행의 연산 방법
                    - arr[n][x] --> arr[n+1][x] || arr[n+1][x+1]
                    - 대각선으로만 이동한다 했으니
                    - 첫째원소랑 마지막원소는 확정이고 중간애들만 연산

               3. DP 로직
                    - 경로를 각 층으로 분리하여 각 층마다 누적합을 정의해서 자기가 가질수있는 최대값으로 할당한다
                    - 즉, 2^n 의 경우의 수를 2n 으로 완화
                    - dp[n][0] = dp[n-1][0]+arr[n][0]
                    - dp[n][i-1] = dp[n-1][i-1]+arr[n][i-1]
                    - dp[n][x] = Math.max(dp[n-1][x-1],dp[n-1][x]) + arr[n][x]
                    - dp 배열 객체는 따로 생성할 필요 없이 기존 arr 객체에 overwrite
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt( br.readLine());
        int[][] arr= new int[n][];
        StringTokenizer st;
        StringBuilder sb= new StringBuilder();
        for( int i=0; i<n; i++){
            st= new StringTokenizer(br.readLine());
            int l = st.countTokens();
            arr[i]= new int[l];
            for(int j=0; j<l; j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        for( int i=1; i<n; i++){
            int l = arr[i].length;
            for (int j=0; j<l; j++){
                if(j==0){
                    arr[i][j]=arr[i-1][j]+arr[i][j];
                }else if(j==l-1){
                    arr[i][j]=arr[i-1][j-1]+arr[i][j];
                }else{
                    arr[i][j]=Math.max(arr[i-1][j],arr[i-1][j-1])+arr[i][j];
                }
            }
        }

        System.out.println(Arrays.stream(arr[n-1]).max().getAsInt());
    }
}
