import java.io.*;
import java.util.*;
public class leastnumber {

	public static void main(String[] args) {
		int out1=0;
		String out="";
		Scanner in=new Scanner(System.in);
		String a=in.nextLine();
		int n=in.nextInt();
		String arr[]=new String[a.length()];
		
		arr=a.split("");
		Arrays.sort(arr);
		int arrl=arr.length-n;
		
		for(int i=0;i<arrl;i++)
		{
			out=out+arr[i];
			
		}
		out1=Integer.parseInt(out);
		
		System.out.println("out1 : "+out1);
	}

}
