package for_japan;

import java.io.*;

public class wrong_input {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String keyboard[] = new String[4];
        keyboard[0] = "`1234567890-=";
        keyboard[1] = "QWERTYUIOP[]\\";
        keyboard[2] = "ASDFGHJKL;'";
        keyboard[3] = "ZXCVBNM,./";

        String question;
        while ((question = br.readLine()) != null) {
            StringBuilder answer = new StringBuilder(); 
            
            for (int i = 0; i < question.length(); i++) {
                char cur = question.charAt(i);
                boolean found = false;

                for (int j = 0; j < 4; j++) {
                    int index = keyboard[j].indexOf(cur);
                    if (index != -1) {
                        answer.append(keyboard[j].charAt(index - 1));
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    answer.append(cur);
                }
            }
            System.out.println(answer.toString());
        }
    }
}