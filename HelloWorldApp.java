/**
 * The HelloWorldApp class implements an application that
 * simply prints "Hello World!" to standard output.
 */

//above we have a doc comment: /** documentation */

class HelloWorldApp { //every application begins with a class definition
	public static void main(String[] args){ //every application must contain a main method, 
		                                //it's similar to the main function in C and C++
						//The main method accepts a single argument: an array of elements of type String.
						//that way i can provide arguments through the command line to the application without having to recompile it 
		System.out.println("Hello World!"); //Display the string using the "System" class from the core library to print the "Hello World!" message to standard output.
	}
}
