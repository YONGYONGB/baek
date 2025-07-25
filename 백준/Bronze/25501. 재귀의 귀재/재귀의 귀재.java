import java.io.*;

public class Main{
    static int count;
    
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++){
            String input = br.readLine();
            count = 0;
            int start = 0;
            int end = input.length()-1;
            sb.append(recursion(input,start,end)).append(" ").append(count).append("\n");
        }
        System.out.print(sb);
    }
    public static int recursion(String input,int start, int end){
        count++;
        if(start >= end) return 1;
        else if(input.charAt(start) != input.charAt(end)) return 0;
        else return recursion(input, start+1, end-1);
    }
}