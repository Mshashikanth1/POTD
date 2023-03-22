// Problem :https://practice.geeksforgeeks.org/problems/d25f415de2ff3e02134de03e17ad019d723ab2e9/1
//User function Template for Java
//String rp or pr.java
class Solution 
{ 
    static long solve(int X,int Y, String S)
	{    
	    // code here
	    long count_pr=0,count_rp=0;
	    if(X>=Y){
	        //check for more pr
	        while(S.contains("pr")){
	             count_pr+=1;
	             S.replaceFirst("pr","");
	             System.out.println(S+","+count_pr+","+count_rp);
	        }
	        //then check for rp
	        while(S.contains("rp")){
	             count_rp+=1;
	             S.replaceFirst("rp","");
	             System.out.println(S+","+count_pr+","+count_rp);

	         }
	    }
	    else{
	       //check for more rp
	        while(S.contains("rp")){
	             count_rp+=1;
	             S.replaceFirst("rp","");
	             System.out.println(S+","+count_pr+","+count_rp);

	         
	         }
	         //then check more for pr
	         while(S.contains("pr")){
	             count_pr+=1;
	             S.replaceFirst("pr","");
	             System.out.println(S+","+count_pr+","+count_rp);

	        }
	       
	    }
	    return count_pr*X + count_rp*Y;
        
	}
} 

