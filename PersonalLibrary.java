/* a simple Library tool to help analyze completed books in a small, personal library
The tool will print out the books that a user has fully read
We will store the books and their completion status in a HashMap */

import java.util.HashMap;

class PersonalLibrary{
	public PersonalLibrary(){
  
  }
  
  public void getFinishedBooks(HashMap<String, Boolean> library){
  	if(library.size() <1){
    	System.out.println("List of books is empty");
    } else {
    	for(String book:library.keySet()){
      	if(library.get(book)){
        	System.out.println(book);
        }
      }
    }
  }
  
  public void getUnfinishedBooks(HashMap<String, Boolean> library){
  	if(library.size() <1){
    	System.out.println("List of books is empty");
    } else {
    	for(String book:library.keySet()){
      	if(!library.get(book)){
        	System.out.println(book);
        }
      }
    }
  }
  
  public static void main(String[] args){
    HashMap<String, Boolean> myBooks = new HashMap<String, Boolean>();
    myBooks.put("Road Down The Funnel", true);
    myBooks.put("Rat: A Biology", false);
    myBooks.put("TimeIn", true);
    myBooks.put("3D Food Printing", false);
    
    PersonalLibrary myLibrary = new PersonalLibrary();
    myLibrary.getFinishedBooks(myBooks);
    myLibrary.getUnfinishedBooks(myBooks);
  }
}