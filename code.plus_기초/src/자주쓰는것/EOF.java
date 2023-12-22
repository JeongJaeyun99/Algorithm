package 자주쓰는것;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EOF {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null) {
		    // 파일의 끝에 도달하기 전까지 한 줄씩 읽음
		    // line에 읽은 문자열이 저장되며, 파일의 끝에 도달하면 null이 반환됨
		}

		br.close();
	}

}
