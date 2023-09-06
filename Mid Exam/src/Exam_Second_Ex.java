import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exam_Second_Ex {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        List<String> names = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());
        String input = scan.nextLine();
        int blacklisted = 0;
        int lost = 0;
        while(!input.equals("Report")){
            String command = input.split(" ")[0];
            switch (command){
                case"Blacklist":
                    String name = input.split(" ")[1];
                    if(names.contains(name)){
                        blacklisted++;
                        System.out.printf("%s was blacklisted.%n",name);
                        names.set(names.indexOf(name),"Blacklisted");
                    }else{
                        System.out.printf("%s was not found.%n",name);
                    }
                    break;
                case "Error":
                    int index = Integer.parseInt(input.split(" ")[1]);
                    if(isValid(index,names)){
                        if(!names.get(index).equals("Blacklisted") && !names.get(index).equals("Lost")){
                            lost++;
                            System.out.printf("%s was lost due to an error.%n",names.get(index));
                            names.set(index,"Lost");
                        }
                    }
                    break;
                case "Change":
                    int indexX = Integer.parseInt(input.split(" ")[1]);
                    String newName = input.split(" ")[2];
                    if(isValid(indexX,names)){
                        String currentName = names.get(indexX);
                        names.set(indexX,newName);
                        System.out.printf("%s changed his username to %s.%n",currentName,newName);
                    }
                    break;
            }
            input=scan.nextLine();
        }
        System.out.printf("Blacklisted names: %d%n",blacklisted);
        System.out.printf("Lost names: %d%n",lost);
        System.out.println(names.toString().replace("[","").replace("]","").
                replaceAll(",","").trim());
    }
    private static boolean isValid(int index,List<String> names){
        return index>=0 && index<=names.size()-1;
    }
}
