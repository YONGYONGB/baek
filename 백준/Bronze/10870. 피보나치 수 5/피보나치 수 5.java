import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        System.out.print(fab(n));
    }
    
    public static int fab(int n){
        if(n < 2) return n;
        return fab(n-1) + fab(n-2);
    }
}