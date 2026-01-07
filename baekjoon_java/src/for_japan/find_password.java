package for_japan;

import java.io.*;
import java.util.*;

public class find_password {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,String> map = new HashMap<String,String>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for(int i = 0;i < n;i++){
            StringTokenizer name_password = new StringTokenizer(br.readLine());
            map.put(name_password.nextToken(),name_password.nextToken());
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i < m;i++){
            String site = br.readLine();
            if(map.containsKey(site)) ans.append(map.get(site) + "\n");
        }
        System.out.println(ans);
    }
}
