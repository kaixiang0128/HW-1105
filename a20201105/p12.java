package a20201105;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p12 {
	public static void main(String[] args) throws Exception
	{
		System.out.println("請輸入整數");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		if(num == 1)
		{
			System.out.println("輸入的是1");
		}
		else if(num == 2)
		{
			System.out.println("輸入的是2");
		}
		else
		{
			System.out.println("請輸入1或2");
		}
	}
}
