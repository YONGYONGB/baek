import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String[] args)throws IOException{
        
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int[] in = new int[n];
        
        for(int i=0; i<n; i++){
            in[i] = Integer.parseInt(br.readLine());
        }
        sb.append(one(in)).append("\n");
        sb.append(two(in)).append("\n");
        sb.append(three(in)).append("\n");
        sb.append(four(in)).append("\n");
        
        System.out.print(sb);
    }
    
    public static int one(int[] in){
        int num = 0;
        int a = in.length;
        for(int i=0; i<a; i++){
            num += in[i];
        }
        return Math.round((float)num / a);
    }
    public static int two(int[] in){
        Arrays.sort(in);
        int a = in.length/2;
        return in[a];
    }
    public static int three(int[] in){
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : in) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = Collections.max(map.values());

        List<Integer> modeList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                modeList.add(entry.getKey());
            }
        }

        Collections.sort(modeList);

        return modeList.size() > 1 ? modeList.get(1) : modeList.get(0);
    }
    public static int four(int[] in){
        Arrays.sort(in);
        return in[in.length - 1] - in[0]; 
    }
}