import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] stand = br.readLine().split(" ");
        int n = Integer.parseInt(stand[0]);
        int m = Integer.parseInt(stand[1]);
        
        int ans = 0;
        String[] temp = new String[n];
        
        for(int i=0; i<n+m;i++){
            String a = br.readLine();
            if(i<n){
                temp[i] = a;
            }else if(n <= i){
                for(int j=0; j<n;j++){
                    if(temp[j].equals(a)){
                        ans++;
                        break;
                    }
                }
            }
        }
        System.out.print(ans);
        
    }
    
}