import java.util.Scanner;
public class Exercise25 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input you weight(kg)");
        double weight = scan.nextDouble();
        System.out.print("Input your height (cm)");
        double height = scan.nextDouble();
        double h =(height/100);
        double bmi = weight/(h*h);
        System.out.println("Your bmi is : "+bmi);
        String status ="";
        if (bmi >= 30)
            status="Very fat";
        else if (bmi >=25)
            status = "fat";
        else if (bmi >=25)
            status = "fat";
        else if (bmi >=23)
            status = "overweight";
        else if (bmi >=18)
            status = "normal";
        else
            status = "too skinny";
        System.out.println("You are:"+ status);
    }    
}