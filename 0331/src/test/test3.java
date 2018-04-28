package test;

public class test3 {

	public static void main(String[] args) {
	
		int a=8;
		int c=0;
		
		for(int i=0;i<9;i++){
			

		    for(int j=0;j<9;j++){
		    	int b=a;
		    	if(j>b-1){
		    		b--;
		    

		        System.out.print("*");
		    	}
		    	else{
		        System.out.print(" ");
		    
		    }
		    	c=a-b+1;
		    for(int k=2;k<9;k++){
		    	if(c>1){
		    		
			        System.out.print("*");
			        c--;

		    	}
		    }
		    
		    }
		    a--;
		//
		    

		    System.out.println("");

		
		}}}


	


