//MAIN FILE
//--------------------
public class Main {

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(2.3);
        calculator.setSecondNumber(1.2);

//        output
        double numOne = calculator.getFirstNumber();
        double numTwo = calculator.getSecondNumber();
        System.out.println("first: " + numOne + " second " + numTwo);
        double add = calculator.getAdditionResult();
        double subs = calculator.getSubtractionResult();
        double mult = calculator.getMultiplication();
        double div = calculator.getDivision();
        System.out.println("add: " + add);
        System.out.println("subs: " + subs);
        System.out.println("mult: " + mult);
        System.out.println("div: " + div);
        System.out.println("add: " + add);

    }

}
//==========================================
//SIMPLE CALCULATOR FILE
//------------------------------------
public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

//    set firtNumber and second Number

    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

//    get first name and second name

    public double getFirstNumber(){
        return this.firstNumber;
    }

    public double getSecondNumber(){
        return this.secondNumber;
    }

    public double getAdditionResult(){
        return this.firstNumber + this.secondNumber;
    }

    public double getSubtractionResult(){
        return  this.firstNumber - this.secondNumber;
    }

    public double getDivision(){
        if(this.firstNumber == 0 || this.secondNumber == 0){
            return 0;
        } else {
            return this.firstNumber / this.secondNumber;
        }

    }

    public double getMultiplication(){
        return this.firstNumber * this.secondNumber;
    }
}
