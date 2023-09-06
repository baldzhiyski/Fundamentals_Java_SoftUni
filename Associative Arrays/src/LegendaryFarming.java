import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String , Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments",0);
        materials.put("motes",0);

        Map<String , Integer> junks = new LinkedHashMap<>();

        boolean isWin = false;
        while(!isWin){
            String input = scan.nextLine();
            String[] array = input.split("\\s+");
            for (int i = 0; i <=array.length-1 ; i+=2) {
                int quantity = Integer.parseInt(array[i]);
                String material = array[i + 1].toLowerCase();
                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentQuantity = materials.get(material);
                    materials.put(material, currentQuantity + quantity);
                } else {
                    if (junks.containsKey(material)) {
                        int currentQuantity = junks.get(material);
                        junks.put(material, currentQuantity + quantity);
                    } else {
                        junks.put(material, quantity);
                    }
                }
                if (materials.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    isWin = true;
                    materials.put("shards", materials.get("shards") - 250);
                    break;
                } else if (materials.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    isWin = true;
                    materials.put("fragments", materials.get("fragments") - 250);
                    break;
                } else if (materials.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    isWin = true;
                    materials.put("motes", materials.get("motes") - 250);
                    break;
                }
            }
        }
        materials.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        junks.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
