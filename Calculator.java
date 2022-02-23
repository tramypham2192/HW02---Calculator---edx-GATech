import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        mainOptions();
    }

    public static void mainOptions(){
        Scanner sc = new Scanner(System.in);
        showOptions();
        String option =  sc.next();

        while (option != "exit"){
            switch(option){
                case "add":
                    List<Integer> arr = inputTwoNumbers();
                    int result = arr.get(0) + arr.get(1);
        
                    System.out.println("Answer: " + result);
                    mainOptions();
                    break;
                case "subtract":
                    List<Integer> arr2 = inputTwoNumbers();
                    int resultSubtract = arr2.get(0) - arr2.get(1);
                    System.out.println("Answer: " + resultSubtract);
                    mainOptions();
                    break;
                case "multiply":
                    List<Integer> arr3 = inputTwoNumbers();
                    int resultMultiply = arr3.get(0) * arr3.get(1);
                    System.out.println("Answer: " + resultMultiply);
                    mainOptions();
                    break;
                case "divide":
                    List<Integer> arr4 = inputTwoNumbers();
                    int resultDivide = arr4.get(0) / arr4.get(1);
                    System.out.println("Answer: " + resultDivide);
                    mainOptions();
                    break;
                }
        }
        
    }

    public static List<Integer> inputTwoNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int lst[] = {};
        List<Integer> arrlist = new ArrayList<Integer>();

        for (int i = 0; i < 2; i++){
            int num = sc.nextInt();
            arrlist.add(num);
        }
        return arrlist;
    }

    public static void showOptions(){
        System.out.println("List of operations: add subtract multiply divide alphabetize");
        System.out.println("Enter an operation: ");
    }
}