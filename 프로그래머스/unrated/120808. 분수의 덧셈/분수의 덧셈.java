class Solution {// 12/18 --> 6/ 9 
     void module(int[] arr,int x, int y){
        for(int i = 2; i <= Math.min(arr[x],arr[y]); i++){
            if(arr[x]%i==0 && arr[y]%i==0){
                arr[x]/=i;
                arr[y]/=i;
                i=1;
            }
        }
    }
    public int[] solution(int a, int b, int c, int d) {
        int[] arr = {a,b,c,d};
        module(arr,0,1);
        module(arr,2,3);
        int[] answer= new int[2];
        if(arr[1]==arr[3]){
            answer[0]=arr[0]+arr[2];
            answer[1]=arr[1];
        }else{
            answer[0]=arr[0]*arr[3]+arr[1]*arr[2];
            answer[1]=arr[1]*arr[3];
        }
        module(answer,0,1);
        return answer;
    }
}