import java.util.Scanner;

public class simpleCalculatorApp {
    public static void main(String[] args) {
    /*
    Dolgozzátok át a számológép programot úgy, hogy tartalmazzon külön metódust az
    adatokbekérésre a felhasználótól ( getNumberFromUser() ), valamint egyet az operátor
    beolvasásra (getOperatorFromUser() ). Ezt követően egy külön metódust amely elvégzi a
    műveletet és visszaadja az eredményt ( getCalculationResult(operator, number1,number2) ),
    Végül egy metódust ami kiírja az eredményt a konzolra (showResultToTheUser(result) )
     */

        float number1 = getNumberFromUser();
        float number2 = getNumberFromUser();
        String operator = getOperatorFromUser();
        float result=getCalculationResult(operator, number1, number2);
        System.out.println("The result for your calculation is: ");showResultToTheUser(result);

    }

    public static float getNumberFromUser(){
        System.out.println("Input your number: ");
        Scanner scan = new Scanner(System.in);
        float number = scan.nextInt();
        return number;
    }

    public static String getOperatorFromUser(){
        System.out.println("Input an operator: (/, *, +, -)");
        Scanner scan = new Scanner(System.in);
        String operator = scan.nextLine();
        return operator;
    }
    public static float getCalculationResult(String operator,float number1,float number2){
        float result = 0;
        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                ;
                break;
            case "/":
                result = (number1 / number2);
                break;
        }
        return result;
    }
    public static void showResultToTheUser(float result){
        System.out.println(result);
    }
}
