package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Forces641 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t--!=0) {
        int n = Integer.parseInt(br.readLine());
        if(n<=8)
        {
        	System.out.println("NO");
            continue;
        }
        if(isPrime(n)) {
        	System.out.println("NO");
            continue;
        }
        int a1=0;
        for(int i=2;i*2<=n;i++)
        {
        	if(n%i==0)
        	{
        		n=n/i;
        		a1=i;
        		break;
        	}
        }
        
        if(isPrime(n))
        {
        	System.out.println("NO");
        	continue;
        }
        int a2=0;
        for(int j=a1+1;j*2<=n;j++)
        {
        	if(n%j==0)
        	{
        		n=n/j;
        		a2=j;
        		break;
        	}
        }
        if(n==a1 || n==a2 || n==1 || a2==0)
        {
        	System.out.println("NO");
        }
        else {
        	System.out.println("YES");
        	System.out.println(a1+" "+a2+" "+n);
        	
        }
        
	    }

}
	   static boolean isPrime(int n) 
	    { 
	        // Corner cases 
	        if (n <= 1) 
	            return false; 
	        if (n <= 3) 
	            return true; 
	  
	        // This is checked so that we can skip 
	        // middle five numbers in below loop 
	        if (n % 2 == 0 || n % 3 == 0) 
	            return false; 
	  
	        for (int i = 5; i * i <= n; i = i + 6) 
	            if (n % i == 0 || n % (i + 2) == 0) 
	                return false; 
	  
	        return true; 
	    } 
}
