import java.util.Scanner;

public class BMICalc {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Witaj w programie do obliczania BMI (Body Mass Index)!");
        System.out.println("Podaj swoją wagę [kg]:");
        float waga = in.nextFloat();
        System.out.println("Podaj swój wzrost [m]:");
        float wzrost = in.nextFloat();
        float bmi = waga/(wzrost*wzrost);
        System.out.printf("Twoje BMI wynosi: %.2f\n", bmi);
        if (bmi < 16)
        {
            System.out.println("BMI wskazuje na wygłodzenie! Zjedz coś!");
        } else if (bmi >= 16 & bmi <= 16.99)
        {
            System.out.println("BMI wskazuje na (spowodowane często przez anoreksję lub inną ciężką chorobę)! Ogarnij się!");
        } else if (bmi >= 17 && bmi <= 18.49)
        {
            System.out.println("BMI wskazuje na niedowagę!");
        } else if (bmi >= 18.5 && bmi <= 24.99)
        {
            System.out.println("BMI idealne! Tak trzymać!");
        } else if (bmi >= 25 && bmi <= 29.99)
        {
            System.out.println("BMI wskazuje, że masz nadwagę! Ogarnij się!");
        } else if (bmi >= 30 && bmi <= 34.99)
        {
            System.out.println("BMI wskazuje, że jesteś grubasem! To ostatnia deska ratunku!");
        } else if (bmi >= 35 && bmi <= 39.99)
        {
            System.out.println("BMI wskazuje, że jesteś grubasem drugiego stopnia! Teraz bedzie tylko gorzej!");
        } else if (bmi >= 40)
        {
            System.out.println("BMI wskazuje, że jesteś grubasem trzeciego stopnia! Idź na liposukcję!");
        }
    }
}