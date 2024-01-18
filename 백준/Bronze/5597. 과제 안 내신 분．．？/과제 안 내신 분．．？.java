import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int temp=-1;
		int[] arr =new int[30];
		int i;
		
		for (i = 0; i < arr.length-2; i++) {
			temp=Integer.parseInt(in.readLine());
			arr[temp-1]=1;
		}
		
		for (i = 0; i < arr.length; i++) {
			if(arr[i]==0) {
				System.out.println(i+1);
				arr[i]=0;
				break;
			}
		}
		for (int j=i+1; j < arr.length; j++) {
			if(arr[j]==0) {
				arr[j]=0;
				System.out.println(j+1);
				break;
			}
		}
	}
}
