class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i<n; i++){
            boolean[] check = new boolean[n];
            int a1 = arr1[i];
            int a2 = arr2[i];
            int count = (int)Math.pow(2,n-1);
            
            for(int j=0; j<n; j++){
                if(a1/count == 1 || a2/count == 1){
                    check[j] = true;
                    a1 = a1%count;
                    a2 = a2%count;
                    count = count/2;
                }else{
                    count = count/2;
                }        
            }
            
            StringBuilder sb = new StringBuilder();
            for(int k=0; k<n; k++){
                
                if(check[k] == true){
                    sb.append("#");
                }else{
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
            
        }
            
        
        
        return answer;
    }
}