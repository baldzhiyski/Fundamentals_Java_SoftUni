import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

    public class P10Second {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        List<String> topics = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());
        String input = scan.nextLine();
        while(!input.equals("course start")){
            String[] commandParts = input.split(":");
            String action = commandParts[0];
            String topic = commandParts[1];
            switch (action){
                case "Add":
                    if(!topics.contains(topic)){
                        topics.add(topic);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandParts[2]);
                    if(isValidIndex(index,topics.size())){
                        if(!topics.contains(topic)) {
                            topics.add(index, topic);
                        }
                    }
                    break;
                case "Remove":
                    int indexx = topics.indexOf(topic);
                    if(topics.contains(topic)){
                        topics.remove(topic);
                    }
                    if(indexx!=topics.size()-1){
                        if( indexx+1 < topics.size() && topics.get(indexx+1).equals(topic+"-Exercise")) {
                            topics.remove(topic + "-Exercise");
                            // we remove the exercise after it
                        }
                    }
                    break;
                case "Swap":
                    String topic2 = commandParts[2];
                    if(topics.contains(topic) && topics.contains(topic2)){
                        int indexFirst = topics.indexOf(topic);
                        int indexSecond = topics.indexOf(topic2);
                        topics.set(indexFirst,topic2);
                        topics.set(indexSecond,topic);

                        // we should change also the exercises
                        String exFirst = topic+ "-Exercise";
                        String exSecond = topic2+"-Exercise";
                        if(topics.contains(exFirst)){
                            topics.remove(topics.indexOf(exFirst));
                            topics.add(topics.indexOf(topic)+1,exFirst);
                        }
                        if(topics.contains(exSecond)){
                            topics.remove(topics.indexOf(exSecond));
                            topics.add(topics.indexOf(topic2)+1,exSecond);
                        }

                    }
                    break;
                case "Exercise":
                    String exercise = topic + "-Exercise";
                    if(topics.contains(topic)){
                        int indexTopic= topics.indexOf(topic);
                        if(indexTopic==topics.size()-1){
                            topics.add(indexTopic+1,exercise);
                        }else if(!topics.get(indexTopic+1).equals(exercise)){
                            topics.add(indexTopic+1,exercise);
                        }
                    }else{
                        // first add the topic and then the exercise
                        topics.add(topic);
                        topics.add(exercise);
                    }
                    break;
            }
            input=scan.nextLine();
        }
        for (int i = 0; i <topics.size() ; i++) {
            System.out.printf("%d.%s%n",i+1,topics.get(i));
        }

    }
    private static boolean isValidIndex(int index, int size) {
        return index >= 0 && index <= size;
    }
}
