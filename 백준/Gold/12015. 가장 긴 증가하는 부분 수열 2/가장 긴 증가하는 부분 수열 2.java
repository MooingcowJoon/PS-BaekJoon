import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args)  throws IOException {
        /*
               https://www.acmicpc.net/problem/12015
               가장 긴 증가하는 부분 수열 2(LIS)

                문제 개요
                    주어진 수열에서 길이가 가장 긴 오름차순 부분수열의 렝스를 연산

                예제 입력
                    6
                    10 20 10 30 20 50
                예제 출력
                    4

                개념정리
                ## 노드방식으로는 릿코드 통과했지만 백준은 못통과함
                (공간복잡도 높은 객체참조때문에 순회시 배열특유의 빠른 물리메모리 접근대비 느린듯)

                   --> 바이너리서치 활용하여 풀어야함


                   백준 1% 타임아웃 코드
    static class Node{
        int val;
        Node child;
        Node(int val){
            this.val=val;
        }
    }
       Node root = new Node(arr[0]);
        int max=0;
        Node node;
        int a;
        for (int x: arr){
            a=1;
            node = root;
            while(node.val<x){
                if(node.child==null){
                    node.child=new Node(x);
                }
                node=node.child;
                a++;
            }
                node.val=x;
            max=Math.max(a,max);
        }
        System.out.println(max);




                    - BF, 배열의 각 인덱스를 수열의 첫째항으로 하는 수열들의 길이를 죄다 계산하는 방법
                        > 약간 문자열 서칭과 비슷함.
                            > 쭉 가다가 아닌거같으면 다시 한칸만 전진해서 계산
                            > 대략적인 시간복잡도 N^3
                    - DP ??
                        -> 뒤에서 붙이기?
                            - 증가하는 수열이어야 하기에 같은수면 무조건 인덱스가 낮은 원소를 고름

                        --> 부분의 합이 전체인가? X 언제든지 바뀔수있음
                            10 20 30 40 1 2 3 4 50 7 9 8 5 6
                            -> 즉, 원소 하나씩 전체 배열을 쭉 순회해봐야됨
                            -> 뒤에서붙이기해보자
                            -> 줄 잘서기
                        --> 이방법 1% 시간초과 즉 이방법 아님

                   # 수열이기 때문에 상대 위치만 중요
                        -> 값이 같은 원소는 앞선 원소만 선택;
                        -> 해쉬셋으로 중복제거하면 값다른애들만 남음
                   # 나온 수들을 다 저장해놨다가,
                     낮은 수부터 얘네들이 몇번 인덱스에 있는지 계산하는 방법



         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt( br.readLine());
        int[] arr= Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] bs=new int[n];
        int max=1;
        bs[0]=arr[0];
        for(int x: arr){
            if(bs[max-1]<x){
                bs[max]=x;
                max++;
            }else{
                int left = 0;
                int right = max-1;
                int mid=(left+right)/2;
                while(left < right){
                    mid=(left+right)/2;
                    if(bs[mid]==x){
                        left=mid;
                        break;
                    }else if(bs[mid]>x){
                        right=mid;
                    }else{
                        left=mid+1;
                    }
                }
                bs[left]=x;
            }
        }
        System.out.println(max);

    }


}
