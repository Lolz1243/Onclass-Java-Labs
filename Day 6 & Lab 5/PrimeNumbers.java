package P625;

public class trials {
	
	public static int is_num_prime(int num){ // creates new method
	   	int is_prime = 1; 
	   	
    	for (int i = 2; i <= num / 2; i++){ 
    		if (num % i == 0){
    			is_prime = 0; 
    			break;
    		}
    	}

    	return is_prime; // returns value 1 if num is prime.
    } // returns value 0 if num is not prime.
	
	public static void main(String[]args){

	    for(int num = 2; num < 10000; num++){
	    	
	    	int prime = is_num_prime(num); // calling the method
	    	
	    	if (prime == 1){ //checking the conditions
	    		System.out.println(num); // printing the num.
	    	}
	    }
	}
		
}

