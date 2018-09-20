package com.capgemini.basics;

public class PrimeRange {

	public static int findPrime(int range) {
       
		String primenumbers="";
		if(range==1 || range==2)
			return 1;
		else if(range<=0)
			return 0;
		else if(range>=3) {
			for(int j=1;j<=range;j++) {
				int flag=0;
                      for(int i=j;i>=1;i--) {
					       if(j%i==0)
						  flag =flag+1;
					     
					  }
                      if(flag==2)
                    primenumbers = primenumbers+j+" ";
                     
		    }
			 System.out.println(primenumbers);
			 return 1;
		}
		
	

		
		
		
		
		
		
		
		
		
		
		
		return range;
		
		
		
		
		}
}

