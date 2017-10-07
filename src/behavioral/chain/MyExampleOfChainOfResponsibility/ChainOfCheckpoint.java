package behavioral.chain.MyExampleOfChainOfResponsibility;

public class ChainOfCheckpoint {

    public static void main(String[] args) {
        AccessLevel cleaner = new Cleaner(ValueOfAccessLevel.LEVEL_ONE);
        AccessLevel engineer = new Engineer(ValueOfAccessLevel.LEVEL_TWO);
        AccessLevel boss = new Boss(ValueOfAccessLevel.LEVEL_THREE);

        cleaner.setNextAccessLevel(engineer);
        engineer.setNextAccessLevel(boss);

        cleaner.accessManager("was on the first floor...", ValueOfAccessLevel.LEVEL_ONE);
        cleaner.accessManager("was on the second floor...", ValueOfAccessLevel.LEVEL_TWO);
        cleaner.accessManager("was on the third floor...", ValueOfAccessLevel.LEVEL_THREE );
    }
}
