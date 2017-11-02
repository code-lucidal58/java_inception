// To perform add, subtract, multiply, divide and modulo

class BasicCalculator{
  public BasicCalculator(){
    
  }
  
  public int add(int a , int b){
    return a+b;
  }
  
  public int subtract(int a, int b){
    return a-b;
  }
  
  public int multiply(int a, int b){
    return a*b;
  }
  
  public int divide(int a, int b){
    if(b!=0){
      return a/b;
    } else {
      System.out.println("Error! Dividing by zero is not allowed.");
    }
    return 0;
  }
  
  public int modulo(int a, int b){
    if(b!=0){
      return a%b;
    } else {
      System.out.println("Error! Dividing by zero is not allowed.");
    }
    return 0;
  }
  
  public static void main(String[] args){
    BasicCalculator myCalculator = new BasicCalculator();
    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.subtract(45,11));
  }
}