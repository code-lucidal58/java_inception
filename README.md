<b>This repo is for recapulation of basic syntax in use in Java. It also contains small projects to illustrate execution od common methods. Hope this helps people who have to switch languages often and are baffled by the varying styles of development. Keep rocking codes! ;)<b>

Java is a programming language designed to build secure, powerful applications that run across multiple operating systems, including Linux, Mac OS X, and Windows. The Java language is known to be flexible, scalable, and maintainable.

A java file will always contain a class. Inside the class there will a  main function (compulsary if you are run the file).
E.g. public class Arithmetic {
	public static void main(String[] args) {
    }}
You can create Arthimetic class object inside the main class.
System.out.println("Aanisha Mishra"); //to print to the console
Boolean values are true and false.
Basic Data Types: int, char, boolean.

Whitespace is one or more characters (such as a space, tab, enter, or return) that do not produce a visible mark or text. Whitespace is often used to make code visually presentable. 

Java supports single line comments (//) and multi-line comments (/* */)
Java has usual relational operators ( < > <= >= ).

 Java programs can follow different sets of instructions depending on the values that we provide to them. This is called control flow.

(&& and), (|| or), (! not) operator while performing condition check.
Evaluation precedence: ! > && > ||

Java supports if, if else, if else if else as cpp.
Syntax for switch is same as cpp.

Java is an object-oriented programming (OOP) language, which means that we can design classes, objects, and methods that can perform certain actions.
Constructor Syntax: public ClassName(params){}
Variables declared inside class are called instance variables.

Creating instance of class: ClassName instanceName = new ClassName(params);
Method declaration: public/private returntype methodname(params){}

For loop: Syntax: same as cpp

ArrayList (a pre-defined java class) stores a list of data of a specified type. E.g. ArrayList<Integer> quizGrades = new ArrayList<Integer>(); 
// to add values to the arraylist
quizGrades.add(95);
quizGrades.get(index)
quizGrades.add(index, value);
.size() method to find length of ArrayList and HashMap.

ForEach Loop: for (Integer grade : quizGrades){
    System.out.println(grade);
}

A HashMap contains a set of keys and a value for each key.
E.g. HashMap<String, Integer> myFriends = new HashMap<String, Integer>();
myFriends.put(keyString, valueInteger);
myFriends.get(keyString); // this will return value of the key

Iterating through HashMap: for(String item: hashmapName.keySet()){}
