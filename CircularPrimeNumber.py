   def circular(self,n):
        n=str(n)
        arr=[]
        m=n[-1]+n[:-1]
        arr.append(m)
        while n!=m:
            m=m[-1]+m[:-1]
            arr.append(m)
        return arr
        
        
    def prime(self,n):
        if n==1:
            return False
        for i in range(2,n):
            if n%i==0:
                return False
        return True
        
        
        
        
	def isCircularPrime(self,n):
		# Code here
		arr=self.circular(n)
		#print(arr)
		for i in arr:
		    if not self.prime(int(i)):
		        return 0
		return 1
    
    
    #driver code
    n=int(input())
    print(isCircularPrime(n))
