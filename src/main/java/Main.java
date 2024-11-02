
public class Main{
	
	 public static boolean isPrime(int number, int divisor) {
	        // מספרים קטנים מ-2 אינם ראשוניים
	        if (number < 2) {
	            return false;
	        }
	        // אם הגענו לשורש הריבועי של המספר, המספר ראשוני
	        if (divisor > Math.sqrt(number)) {
	            return true;
	        }
	        // אם המספר מתחלק ב-divisor, הוא לא ראשוני
	        if (number % divisor == 0) {
	            return false;
	        }
	        // המשך הבדיקה עם divisor אחד יותר
	        return isPrime(number, divisor + 1);
	    }

		 
	public static int recursiveSumArray(int[]array, int index) {
		
		if (index == 0) {
			return array[0];
		}
		
		return recursiveSumArray(array, index-1)+ array[index];	
	}


  
	public static int recursivePositiveNums(int[]array, int index) {
		
		if(index == 0) {
			if(array[index] > 0) {
				return 1;
			}
			else {
				return 0;
			}
		}
		
		if(array[index]>0) {
			return recursivePositiveNums(array,index-1) + 1;
		}
		else {
			return recursivePositiveNums(array,index-1);
		}
		
	}
	

  
	public static int indexInArr(int[] array , int num , int index) {
		
		if(index == array.length) {
			return -1;
		}
		
		if(array[index]== num) {
			return index;
		}
		
		return indexInArr(array, num , index+1);
	}
	
	
	
	public static boolean risingArr(int[] array, int index) {
		
		
		if (index == array.length - 1 || array.length == 0) {
            return true;
        }
		
		if(array[index] > array[index+1]) {
			return false;
		}
		
		return risingArr(array, index + 1);
	}


  
	public static boolean noPrimeNums ( int[] array , int index) {
		
		if(index == array.length) {
			return true;
		}
		
		if(isPrime(array[index])) {
			return false;
		}
		
		return noPrimeNums(array,index+1);
		
	}
		 
		 
		 
		 
	// main loop
	public static void main(String []args) {
		
		System.out.println(isPrime(4));
		
		
		//ex14
		int[] array = {1, 2, 3, 4, 5};
		int[] array2 = {4,6,8,10,29};
    int i = 3;
    int num = 4;
        
    System.out.println(recursiveSumArray(array,I));
        
    //ex15
		System.out.println(recursivePositiveNums(array,i));
		
		//ex16
		// index always starts with 0 :
		System.out.println(indexInArr(array,num,0));
		
		//ex17
		//index always starts with 0 :
		System.out.println(risingArr(array,0));

		//ex18
		//index always starts with 0 :
		System.out.println(noPrimeNums(array2,0));

		
	}



}
