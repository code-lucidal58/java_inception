// Mathematical Magic trick
// answer will always be 7

public class MathMagic{
    public static void main(String[] args){
        int myNumber = 6; // enter any number here
        int stepOne = myNumber * 2;
        int stepTwo = stepOne + 9;
        int stepThree = stepTwo + myNumber;
        int stepFour = stepThree / 3;
        int stepFive = stepFour + 4;
        int stepSix = stepFive - myNumber;
        System.out.println(stepSix);
    }
}