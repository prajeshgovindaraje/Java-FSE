import java.util.Scanner;

interface Character {
    void attack();
}

class Warrior implements Character {
    public void attack() {
        System.out.println("Warrior swings a sword!");
    }
}

class Mage implements Character {
    public void attack() {
        System.out.println("Mage casts a fireball!");
    }
}

class Archer implements Character {
    public void attack() {
        System.out.println("Archer shoots an arrow!");
    }
}

class CharacterFactory {
    public static Character create(String type) {
        switch (type.toLowerCase()) {
            case "warrior":
                return new Warrior();
            case "mage":
                return new Mage();
            case "archer":
                return new Archer();
            default:
                throw new IllegalArgumentException("Unknown character type");
        }
    }
}

public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose your character (Warrior / Mage / Archer): ");
        String input = sc.nextLine();

        Character player = CharacterFactory.create(input);
        player.attack();
        sc.close();
    }
}
