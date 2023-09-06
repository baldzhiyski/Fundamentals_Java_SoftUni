
import java.util.*;

public class MoreEx3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Map<String , Map<String , Integer>> storedPlayersMap = new LinkedHashMap<>();
        while(!input.equals("Season end")){
            if(input.contains(" -> ")){
                String playerName = input.split(" -> ")[0];
                String position  = input.split(" -> ")[1];
                int skill = Integer.parseInt(input.split(" -> ")[2]);
                if(!storedPlayersMap.containsKey(playerName)){
                    storedPlayersMap.put(playerName, new LinkedHashMap<>());
                    storedPlayersMap.get(playerName).put(position,skill);
                } else if (!storedPlayersMap.get(playerName).containsKey(position)) {
                storedPlayersMap.get(playerName).put(position, skill);
               } else if (storedPlayersMap.get(playerName).get(position) < skill) {
                storedPlayersMap.get(playerName).put(position, skill);
                }

            }else{
                String firstPlayer = input.split(" vs ")[0];
                String secondPlayer = input.split(" vs ")[1];
                if(storedPlayersMap.containsKey(firstPlayer) && storedPlayersMap.containsKey(secondPlayer)){
                    for (Map.Entry<String, Integer> entryFirst : storedPlayersMap.get(firstPlayer).entrySet()) {
                        String currentPosition = entryFirst.getKey();
                        for (Map.Entry<String, Integer> entrySecond : storedPlayersMap.get(secondPlayer).entrySet()) {
                            if (currentPosition.equals(entrySecond.getKey())) {
                                int firstPoints = storedPlayersMap.get(firstPlayer).values().stream().mapToInt(integer -> integer).sum();
                                int secondPoints = storedPlayersMap.get(secondPlayer).values().stream().mapToInt(integer -> integer).sum();
                                if (firstPoints>secondPoints) {
                                    storedPlayersMap.remove(secondPlayer);
                                } else if (secondPoints>firstPoints) {
                                    storedPlayersMap.remove(firstPlayer);
                                }
                            }
                        }
                    }
                }

            }
            input= scan.nextLine();
        }

        storedPlayersMap.entrySet().stream()
                .sorted((p1, p2) -> {
                    int result = Integer.compare(p2.getValue().values().stream().mapToInt(Integer::intValue).sum(),
                            p1.getValue().values().stream().mapToInt(Integer::intValue).sum()); // sorting the players based on all points
                    // p1 and p2 represents entries
                    if (result == 0) {
                        result = p1.getKey().compareTo(p2.getKey());
                    }
                    return result;
                    //When you use the sorted method on a Stream, it doesn't modify the original data,
                    // but it does ensure that the elements are processed and printed in a specific order.
                    // By returning the result we make sure that they will be in this order printed !
                })
                .forEach(overall -> {
                    System.out.printf("%s: %d skill%n", overall.getKey(), overall.getValue().values().stream().mapToInt(Integer::intValue).sum());
                    overall.getValue()
                            .entrySet()
                            .stream()
                            .sorted((p1, p2) -> {
                                int result = Integer.compare(p2.getValue(), p1.getValue()); // sorting the position
                                // from the highest to the lowest
                                if (result == 0) {
                                    result = p1.getKey().compareTo(p2.getKey());
                                }
                                return result;
                            })
                            .forEach(item -> {
                                System.out.printf("- %s <::> %d%n", item.getKey(), item.getValue());
                            });
                });
    }
}
