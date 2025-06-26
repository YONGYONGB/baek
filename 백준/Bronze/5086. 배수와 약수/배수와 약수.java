import java.io.*;

public class Main{
    
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
       
        
        for(int i=0; i< 10000; i++){
            String[] num = br.readLine().split(" ");
            int num1 = Integer.parseInt(num[0]);
            int num2 = Integer.parseInt(num[1]);
            if(num1 == 0 && num2 == 0){
                break;
            }else{
                if(num1 < num2 && num2%num1 == 0){
                    System.out.println("factor");
                }else if(num1 > num2 && num1%num2 == 0){
                    System.out.println("multiple");
                }else{
                    System.out.println("neither");
                }
            }
        }
        
        
    }
}