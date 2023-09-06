import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Map<String , List<String>> teamsMap = new LinkedHashMap<>();
        while(!input.equals("Lumpawaroo")){
            if(input.contains(" | ")){
                String team = input.split(" \\| ")[0];
                String player = input.split(" \\| ")[1];
                if(!teamsMap.containsKey(team)){
                    teamsMap.put(team,new ArrayList<>());
                }
                checkIfAbsent(teamsMap, team, player);
            }else if (input.contains(" -> ")){
                String player = input.split(" -> ")[0];
                String team = input.split(" -> ")[1];
                teamsMap.entrySet().forEach(entry -> entry.getValue().remove(player)); // we remove it if there is such name in every team
                if(!teamsMap.containsKey(team)){
                    teamsMap.put(team,new ArrayList<>());
                    teamsMap.get(team).add(player);
                }else{
                    teamsMap.get(team).add(player);
                }
                System.out.printf("%s joins the %s side!%n",player,team);
            }

            input=scan.nextLine();
        }
        teamsMap.entrySet().stream().filter(entry -> entry.getValue().size()>0)
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n",entry.getKey(),entry.getValue().size());
                    entry.getValue().forEach(player -> System.out.println("! " + player));
                });    // it will leave just these , which answer the task

    }

    private static void checkIfAbsent(Map<String, List<String>> teamsMap, String team, String player) {
        boolean isExisting = false; // it checks the player , if he is a part of another team
        for (List<String> list : teamsMap.values()) { // for each list of the teamsMap we see if there is our name
            if(list.contains(player)){
                isExisting=true;
                break;
            }
        }
        if(!isExisting){
            teamsMap.get(team).add(player);
        }
    }
}
