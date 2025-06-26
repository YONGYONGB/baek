import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] num = br.readLine().split(" ");
            int num1 = Integer.parseInt(num[0]);
            int num2 = Integer.parseInt(num[1]);
        
        int count = 0;
        
        for(int i=1; i<= num1; i++){
            if(num1%i ==0){
                count++;
            }
            if(num2 == count){
                System.out.print(i);
                break;
            }
        }
        
        if(count<num2){
             System.out.print(0);
        }
        
        
    }
}