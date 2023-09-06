import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, int[]> listOfHeroes = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            String[] inputArr = input.split("\\s+");
            String name = inputArr[0];
            int hitPoints = Integer.parseInt(inputArr[1]);
            int mana = Integer.parseInt(inputArr[2]);
            listOfHeroes.putIfAbsent(name, new int[2]);
            listOfHeroes.get(name)[0] = hitPoints;
            listOfHeroes.get(name)[1] = mana;
        }
        String command = scan.nextLine();
        while(!command.equals("End")){
            String[] commandArr = command.split(" - ");
            String heroName = commandArr[1];
            switch (commandArr[0]){
                case "CastSpell":
                    int mpNeeded = Integer.parseInt(commandArr[2]);
                    String spellName = commandArr[3];
                    int currentMana = listOfHeroes.get(heroName)[1];
                    if( currentMana>=mpNeeded){
                        listOfHeroes.get(heroName)[1]=currentMana-mpNeeded;
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n",heroName,spellName,currentMana-mpNeeded);
                    }else{
                        System.out.printf("%s does not have enough MP to cast %s!%n",heroName,spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(commandArr[2]);
                    String attacker = commandArr[3];
                    int currentHealth = listOfHeroes.get(heroName)[0];
                    if(currentHealth-damage<=0){
                        System.out.printf("%s has been killed by %s!%n",heroName,attacker);
                        listOfHeroes.remove(heroName);
                    }else{
                        listOfHeroes.get(heroName)[0]=currentHealth-damage;
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",heroName,damage,attacker,currentHealth-damage);
                    }
                    break;
                case "Recharge":
                    int amount = Integer.parseInt(commandArr[2]);
                    int health = listOfHeroes.get(heroName)[1];
                    int recharged;
                    if(health+amount>=200){
                        listOfHeroes.get(heroName)[1]=200;
                        recharged=200-health;
                    }else{
                        listOfHeroes.get(heroName)[1]=health+amount;
                        recharged=amount;
                    }
                    System.out.printf("%s recharged for %d MP!%n",heroName,recharged);
                    break;
                case "Heal":
                    int amountSecond= Integer.parseInt(commandArr[2]);
                    int healthSecond = listOfHeroes.get(heroName)[0];
                    int healing;
                    if(healthSecond+amountSecond>=100){
                        listOfHeroes.get(heroName)[0]=100;
                        healing=100-healthSecond;
                    }else{
                        listOfHeroes.get(heroName)[0]=healthSecond+amountSecond;
                        healing=amountSecond;
                    }
                    System.out.printf("%s healed for %d HP!%n",heroName,healing);
                    break;
            }
            command=scan.nextLine();
        }
        listOfHeroes.entrySet().forEach(entry->{
            System.out.println(entry.getKey());
            System.out.println("  HP: "+ entry.getValue()[0]);
            System.out.println("  MP: "+ entry.getValue()[1]);
        });
    }
}
