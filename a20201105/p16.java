package a20201105;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p16 {
	public static void main(String[] args) throws Exception
	{
		System.out.println("請輸入a或b");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char letter  =str.charAt(0);
		switch (letter)
		{
		case 'a':
		{
			System.out.println("輸入是a");
			break;
		}
		case 'b':
		{
			System.out.println("輸入是b");
			break;
		}
		default:
		{
			System.out.println("請輸入a或b");
			break;
		}
		}
	}
}