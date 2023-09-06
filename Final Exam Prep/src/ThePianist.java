import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

    public class ThePianist {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = Integer.parseInt(scan.nextLine());
            Map<String,String[]> contentsMap = new LinkedHashMap<>();
            for (int i = 0; i < n; i++) {
                String[] inputArr = scan.nextLine().split("\\|");
                String pieceName = inputArr[0];
                String composer = inputArr[1];
                String key = inputArr[2];

                addingMethodToTheMap(contentsMap, pieceName, composer, key);
            }
            String input = scan.nextLine();
            while(!input.equals("Stop")){
                String[] commandArr = input.split("\\|");
                String command = commandArr[0];
                switch (command){
                    case"Add":
                        String pieceToAdd = commandArr[1];
                        String composer = commandArr[2];
                        String key = commandArr[3];
                        if(!contentsMap.containsKey(pieceToAdd)){
                            addingMethodToTheMap(contentsMap,pieceToAdd,composer,key);
                            System.out.printf("%s by %s in %s added to the collection!%n",pieceToAdd,composer,key);
                        }else{
                            System.out.println(pieceToAdd + " is already in the collection!");
                        }
                        break;
                    case "Remove":
                        String pieceToRemove = commandArr[1];
                        if (!contentsMap.containsKey(pieceToRemove)) {
                            System.out.printf("Invalid operation! %s does not exist in the collection.%n",pieceToRemove);
                        }else{
                            contentsMap.remove(pieceToRemove);
                            System.out.printf("Successfully removed %s!%n",pieceToRemove);
                        }
                        break;
                    case"ChangeKey":
                        String pieceToChange = commandArr[1];
                        String newKey = commandArr[2];
                        if (!contentsMap.containsKey(pieceToChange)) {
                            System.out.printf("Invalid operation! %s does not exist in the collection.%n",pieceToChange);
                        }else{
                            contentsMap.get(pieceToChange)[1]=newKey;
                            System.out.printf("Changed the key of %s to %s!%n",pieceToChange,newKey);
                        }
                        break;

                }
                input=scan.nextLine();
            }
            contentsMap.entrySet().forEach(stringEntry -> {
                System.out.printf("%s -> Composer: %s, Key: %s%n",stringEntry.getKey(),stringEntry.getValue()[0],stringEntry.getValue()[1]);
            });
        }

        private static void addingMethodToTheMap(Map<String, String[]> contentsMap, String pieceName, String composer, String key) {
            contentsMap.putIfAbsent(pieceName,new String[2]);
            contentsMap.get(pieceName)[0]= composer;
            contentsMap.get(pieceName)[1]= key;
        }
    }
