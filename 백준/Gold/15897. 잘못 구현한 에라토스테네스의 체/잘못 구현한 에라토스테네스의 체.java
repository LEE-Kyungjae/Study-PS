import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//조화수열
//잘못구현한 에라토스테네스의 체
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		long n =Integer.parseInt(bf.readLine());
		long ans = n;
		for (long i = 2, j=0 ; i < n ; i=j+1) {
			j=(n-1)/((n-1)/i);
			long num = 1+(n-1)/i;
			ans +=(j-i+1)*num;
		}
		if(n!=1)
			ans++;
		System.out.println(ans);
	}
}
