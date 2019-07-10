public class DiceGame {
    private Die die1, die2;

    public DiceGame() {
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
    }

    public static void main(String[] args) {
        var dg = new DiceGame();
        dg.play( new Player() );
    }
}