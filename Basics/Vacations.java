import java.util.Scanner;

public class Vacations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(sc.nextLine());
        double sum = 0;
        String group = sc.nextLine();
        String dayOfWeek = sc.nextLine();
        switch (group){
            case "Students":
                if (dayOfWeek.equals("Friday")){
                    sum=numberOfPeople*8.45;
                }else if(dayOfWeek.equals("Saturday")){
                    sum=numberOfPeople*9.80;
                }else if (dayOfWeek.equals("Sunday")){
                    sum = numberOfPeople*10.46;
                }
                if (numberOfPeople>=30){
                    sum=0.85*sum;
                }
                break;
            case "Business":
                if (numberOfPeople>=100){
                    numberOfPeople-=10;
                }
                if (dayOfWeek.equals("Friday")){
                    sum=numberOfPeople*10.9;
                }else if(dayOfWeek.equals("Saturday")){
                    sum=numberOfPeople*15.6;
                }else if (dayOfWeek.equals("Sunday")){
                    sum = numberOfPeople*16;
                }

                break;
            case "Regular":
                if (dayOfWeek.equals("Friday")){
                    sum=numberOfPeople*15;
                }else if(dayOfWeek.equals("Saturday")){
                    sum=numberOfPeople*20;
                }else if (dayOfWeek.equals("Sunday")){
                    sum =numberOfPeople*22.5;
                }
                if (numberOfPeople>=10 && numberOfPeople<=20){
                    sum=0.95*sum;
                }
                break;
        }
        System.out.printf("Total price: %.2f",sum);

    }
}
