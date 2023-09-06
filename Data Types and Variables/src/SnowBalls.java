import java.util.Scanner;

public class SnowBalls {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int numberOfBalls = Integer.parseInt(scan.nextLine());
        double max = Double.MIN_VALUE;
        int MaxQuality = 0;
        int MaxTime = 0;
        int MaxSnow = 0;
        for (int i = 1; i <=numberOfBalls ; i++) {
            int snowBallSnow = Integer.parseInt(scan.nextLine());
            int snowBallTime = Integer.parseInt(scan.nextLine());
            int snowBallQuality = Integer.parseInt(scan.nextLine());
            double snowBallValue2 =Math.pow( (snowBallSnow*1.0/snowBallTime) ,snowBallQuality);
            if (snowBallValue2>max){
                max=snowBallValue2;
                MaxSnow=snowBallSnow;
                MaxTime=snowBallTime;
                MaxQuality=snowBallQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)",MaxSnow,MaxTime,max,MaxQuality);

    }
}
