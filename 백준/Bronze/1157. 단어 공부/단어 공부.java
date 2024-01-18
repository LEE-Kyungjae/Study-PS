import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input =in.readLine();
		int[] arr= new int[26];
		int cnt = 0;
		int max = 0;
		int num = 0;
		boolean check = false;
		
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i)>=97) {
				arr[input.charAt(i)-97]++;
			}else {
				arr[input.charAt(i)-65]++;
			}
		}
		for (int i = 0; i < 26; i++) {
			if(max<arr[i]) {
				max=arr[i];
				num=i;
			}
		}
		for(int i = 0 ; i<26; i++) {
			if(arr[i]==max) {
				cnt++;
			};
		}
		if(cnt>1) {
			check=!check; 
		}
		if (check) {
			System.out.println("?");
		} else {
			System.out.println((char)(num+65));
		}

	}
}