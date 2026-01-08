package for_japan;

import java.io.*;
import java.util.*;

public class fashion_king {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < T;i++){
            int n = Integer.parseInt(br.readLine());
            HashMap<String,Integer> clothes = new HashMap<String,Integer>();
            for(int j = 0;j < n;j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String kind = st.nextToken();
                clothes.put(kind,clothes.getOrDefault(kind, 0) + 1);
            }
            int ans = 1;
            for(String key : clothes.keySet()){
                if(clothes.get(key) >= 1){
                    ans *= (clothes.get(key)+1);
                }
            }
            sb.append(ans-1 + "\n");
        }
        System.out.println(sb);
    }
}
