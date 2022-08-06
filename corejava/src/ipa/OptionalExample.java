package ipa;

import java.util.Optional;


public class OptionalExample {
	public static void main(String[] args) {
		 String[] str = new String[10];  
		 str[5] = "sdf";
	        Optional<String> checkNull = Optional.ofNullable(str[5]);  
	        System.out.println(checkNull);
	        if(checkNull.isPresent()){  // check for value is present or not  
	            String lowercaseString = str[5].toLowerCase();  
	            System.out.print(lowercaseString);  
	        }else  
	            System.out.println("string value is not present"); 
	        
	       Optional<String> value = Optional.of(str[2]);
	        
	        //System.out.println("=="+value);
	        
	        Optional<OptionalExample> test = Optional.ofNullable(OptionalExample.test());
	        Optional<User> test1 = Optional.ofNullable(OptionalExample.test1());
	        System.out.println(test);
	    }
	
	public static OptionalExample  test() {
		return null;
	}
	
	public static User  test1() {
		return new User();

	}
	
	public static void  test2() {
		int i = 5;
		int num[]= {1,2,3,4,i};
		Optional<Integer> ofNullable = Optional.ofNullable(num[i]);
		ofNullable.ifPresent(System.out::println);
	}

	  

}