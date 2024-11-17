import java.util.Scanner;

public class script {

    public void main(String[]args){
        double objectiveDoub = Math.random()*100;
        char objective = (char) objectiveDoub;
        boolean on=true;
        while(on){
           Scanner scanner = new Scanner(System.in);
           char num = scanner.next().charAt(0);
           if(num == objective){
               System.out.println("Ganaste");
               scanner.close();
               on = false;
           }
           if(num < objective){
                System.out.println("Tu numero es inferior");
           }
            if(num > objective){
                System.out.println("Tu numero es superior");
           }
       }
    }
}