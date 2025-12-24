package for_japan;

import java.io.*;
import java.util.*;

public class word_num {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sentence = new StringTokenizer(br.readLine());
        System.out.println(sentence.countTokens());
    }
}
