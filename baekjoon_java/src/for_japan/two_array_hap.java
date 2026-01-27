package for_japan;

import java.io.*;
import java.util.*;;

public class two_array_hap {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer n_m = new StringTokenizer(br.readLine());
        int arr[][] = new int[Integer.parseInt(n_m.nextToken())][Integer.parseInt(n_m.nextToken())];
        int sum = 0;
        for(int i = 0;i < arr.length;i++){
            StringTokenizer m_tachi = new StringTokenizer(br.readLine());
            for(int j = 0;j < arr[i].length;j++){
                arr[i][j] = Integer.parseInt(m_tachi.nextToken());
            }
        }
        StringBuilder sb = new StringBuilder();
        int test_case = Integer.parseInt(br.readLine());
        for(int a = 0;a < test_case;a++){
            StringTokenizer i_j_x_y = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(i_j_x_y.nextToken()) - 1;
            int j = Integer.parseInt(i_j_x_y.nextToken()) - 1;
            int x = Integer.parseInt(i_j_x_y.nextToken()) - 1;
            int y = Integer.parseInt(i_j_x_y.nextToken()) - 1;
            for(int b = i;b <= x;b++){
                for(int c = j;c <= y;c++){
                    sum += arr[b][c];
                }
            }
            sb.append(sum + "\n");
            sum = 0;
        }
        System.out.println(sb);
    }
}
