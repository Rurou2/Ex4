import java.util.*;

public class DiceGame {
    private Die die1, die2;
    private final int luckuNumber;

    public DiceGame() {
        var rand = new Random();
        luckuNumber = rand.nextInt(12) + 1;
        die1 = new Die();
        die2 = new Die();
    }

    public void play(Player p) {
        System.out.println( "Rolling the dice..." );

        die1.roll();
        die2.roll();
    
        System.out.println( "Die 1: " + die1.getFaceValue() );
        System.out.println( "Die 2: " + die2.getFaceValue() );

        var total = die1.getFaceValue() + die2.getFaceValue();
        System.out.println( "Total value: " +  total);

        if( total > 7 ) {
            System.out.println( p.getName() + " won!" );
        } else {
            System.out.println( p.getName() + " lost." );
            if( total == luckuNumber ) {
                System.out.println( "\nOops, you seem lucky!!" );
                die1.roll();
                die2.roll();
                total = die1.getFaceValue() + die2.getFaceValue();
                System.out.println( "Total value: " +  total);
    
                if( total > 7 ) {
                    System.out.println( p.getName() + " won!" );
                } else {
                    System.out.println( p.getName() + " lost." );
                }
            }
        }
    }

    public static void main(String[] args) {
        var dg = new DiceGame();
        dg.play( new Player() );
    }
}