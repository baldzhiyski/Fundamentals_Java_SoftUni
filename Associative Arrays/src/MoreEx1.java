import java.util.*;

public class MoreEx1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String , String> contestMap = new LinkedHashMap<>();
        Map<String, List<String>> userContents = new TreeMap<>();
        Map<String,Integer> contestentsPoitns = new TreeMap<>();
        String input = scan.nextLine();
        while(!input.equals("end of contests")){
            String[] commandArray = input.split(":");
            String contest = commandArray[0];
            String password  =commandArray[1];
            contestMap.put(contest,password);
            input=scan.nextLine();
        }
        String nextInput = scan.nextLine();
        while(!nextInput.equals("end of submissions")){
            String[] nextArray = nextInput.split("=>");
            String contestSecond = nextArray[0];
            String pass = nextArray[1];
            String username = nextArray[2];
            int points = Integer.parseInt(nextArray[3]);
            if (contestMap.containsKey(contestSecond)) {
                if (pass.equals(contestMap.get(contestSecond))) {
                    if (!userContents.containsKey(username)) {
                        userContents.put(username, new ArrayList<>());
                        userContents.get(username).add(contestSecond);
                        userContents.get(username).add(String.valueOf(points));
                    } else {
                        if(userContents.get(username).contains(contestSecond)){
                            int indexOfPoints = userContents.get(username).indexOf(contestSecond) + 1;
                            int currentPoints = Integer.parseInt(userContents.get(username).get(indexOfPoints));
                            int maxPoints = Math.max(currentPoints,points);
                            userContents.get(username).set(indexOfPoints,String.valueOf(maxPoints));
                        }else{
                            userContents.get(username).add(contestSecond);
                            userContents.get(username).add(String.valueOf(points));
                        }
                    }
                }
            }
            nextInput=scan.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : userContents.entrySet()) {
            int contestantPoints = 0;
            for (int i = 1; i < entry.getValue().size(); i+=2) {
                contestantPoints += Integer.parseInt(entry.getValue().get(i));
            }
            contestentsPoitns.put(entry.getKey(), contestantPoints);
        }
        String topContestant = "";
        int pointsOfTheTopContestant = -1;
        for (Map.Entry<String, Integer> entry : contestentsPoitns.entrySet()) {
            if (entry.getValue() > pointsOfTheTopContestant){
                topContestant = entry.getKey();
                pointsOfTheTopContestant = entry.getValue();
            }
        }
        System.out.printf("Best candidate is %s with total %d points.%n", topContestant, pointsOfTheTopContestant);
        System.out.println("Ranking:");
        for (Map.Entry<String, List<String>> entry : userContents.entrySet()) {
            System.out.println(entry.getKey());
            Map<Integer, String> contestsSortMap = new TreeMap<>(Collections.reverseOrder());
            for (int i = 0; i < entry.getValue().size(); i+=2) {
                contestsSortMap.put(Integer.parseInt(entry.getValue().get(i + 1)), entry.getValue().get(i));
            }
            for (Map.Entry<Integer, String> contest : contestsSortMap.entrySet()) {
                System.out.printf("#  %s -> %d%n", contest.getValue(), contest.getKey());
            }
        }

    }
}

