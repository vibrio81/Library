# Library

Step One: Implement Book 
First we need a class to model books. This class defines methods to get the title of a book, find out if it is available, borrow the book, and return the book. When you run the program, the output should be: 

Title (should be The Da Vinci Code): The Da Vinci Code   
Rented? (should be false): false  
Rented? (should be true): true  
Rented? (should be false): false   


Step Two: Implement Library 
Next build the class that will represent each library, and manage a collection of books. All libraries have the same hours: 9 AM to 5 PM daily. However, they have different addresses and book collections (i.e., arrays of Book objects). 

Notes   
Some methods will need to be static methods, and some need to be instance methods. 
Be careful when comparing Strings objects. Use string1.equals(string2) for comparing the contents of string1 and string2. 
You should get a small part working at a time. Start by commenting the entire main method, then uncomment it line by line. Run the program, get the first lines working, then uncomment the next line, get that working, etc. 
You must not modify the main method. 
