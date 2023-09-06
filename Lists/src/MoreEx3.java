import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoreEx3 {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<String> nonNumbersList = new ArrayList<>();
        List<Integer> numbersList = new ArrayList<>();
        sortingMethod(input, nonNumbersList, numbersList);
        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();
        addingNumbers(numbersList, takeList, skipList);
        String resultString = "";
        for (int i = 0; i <numbersList.size()/2 ; i++) {
            int numToTake = takeList.get(i);
            int numberToSkip = skipList.get(i);
            if (numToTake > 0) {
                if (numToTake > nonNumbersList.size()) {
                    for (int j = 0; j < nonNumbersList.size(); j++) {
                        String wordToAdd = nonNumbersList.get(j);
                        resultString += wordToAdd;
                    }
                    break;
                }else{
                    for (int j = 0; j < numToTake; j++) {
                        String wordToAdd = nonNumbersList.get(0);
                        nonNumbersList.remove(wordToAdd);
                        resultString += wordToAdd;
                        }
                }
            }
            if(numberToSkip>0){
                if(numberToSkip>nonNumbersList.size()){
                    for (int j = 0; j <nonNumbersList.size() ; j++) {
                    String wordToRemove = nonNumbersList.get(0);
                    nonNumbersList.remove(wordToRemove);
                    }
                    break;
                }else{
                    for (int j = 0; j < numberToSkip ; j++) {
                        String wordToSkip = nonNumbersList.get(0);
                        nonNumbersList.remove(wordToSkip);
                    }
                }
            }
        }
        System.out.println(resultString);
    }
    private static void sortingMethod(String input, List<String> nonNumbersList, List<Integer> numbersList) {
        for (char symbol : input.toCharArray()) {
            if(Character.isDigit(symbol)){
                numbersList.add(Character.getNumericValue(symbol));
            }else{
                String wordToAdd = String.valueOf(symbol);
                nonNumbersList.add(wordToAdd);
            }
        }
    }

    private static void addingNumbers(List<Integer> numbersList, List<Integer> takeList, List<Integer> skipList) {
        for (int i = 0; i < numbersList.size() ; i++) {
           int numToAdd = numbersList.get(i);
            if(i%2==0){
                takeList.add(numToAdd);
            }else{
                skipList.add(numToAdd);
            }
        }
    }
}

