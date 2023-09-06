import java.util.*;

public class ExamThirdExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String,Integer> animalMap = new LinkedHashMap<>();
        Map<String, List<String>> areaMap = new LinkedHashMap<>();
        String input = scan.nextLine();
        while(!input.equals("EndDay")){
            String[] inputArr = input.split(":");
            String[] inputArrSecond = inputArr[1].split("-");
            String animalName = inputArrSecond[0];
            int food = Integer.parseInt(inputArrSecond[1]);
            if(inputArr[0].equals("Add")){
                String area = inputArrSecond[2];
                animalMap.putIfAbsent(animalName,0);
                animalMap.put(animalName,animalMap.get(animalName)+food);
                if(areaMap.containsKey(area)){
                   if(!areaMap.get(area).contains(animalName)){
                       areaMap.get(area).add(animalName);
                   }
                }else {
                    areaMap.put(area,new ArrayList<>());
                    areaMap.get(area).add(animalName);
                }
            }else if(inputArr[0].equals("Feed")){
                if(animalMap.containsKey(animalName)){
                    int currentFood = animalMap.get(animalName);
                    if(currentFood-food<=0){
                        System.out.printf("%s was successfully fed%n",animalName);
                        animalMap.remove(animalName);
                        for (List<String> value : areaMap.values()) {
                            value.remove(animalName);
                        }
                    }else{
                        animalMap.put(animalName,animalMap.get(animalName)-food);
                    }
                }
            }
            input=scan.nextLine();
        }
        System.out.println("Animals:");
        animalMap.entrySet().forEach(entry-> System.out.printf("%s -> %sg%n",entry.getKey(),entry.getValue()));
        System.out.println("Areas with hungry animals:");
        areaMap.entrySet().stream().filter(stringListEntry -> stringListEntry.getValue().size()>0).
                forEach(stringListEntry ->  System.out.println(stringListEntry.getKey() +": "+ stringListEntry.getValue().size()));
    }
}
