public class Hero extends Explorer implements Fighter{
    public Dice attackDice = new Dice(1, 6);

    public Hero(String name, int health, String pieceColor) {
        super(name, health, pieceColor);
    }

    public Hero(String name, int health, String pieceColor, int min, int max) {
        super(name, health, pieceColor);
        attackDice = new Dice(min, max);
    }

    @Override
    public int Hurt(LivingThing unlucky) {
        unlucky.setHealth(unlucky.getHealth() - attackDice.getRollValue());
        return attackDice.getRollValue();
    }

    @Override
    public int getHealth(LivingThing a) {
        return a.getHealth();
    }

    @Override
    public void setHealth(LivingThing a) {

    }

    @Override
    public boolean isDead(LivingThing a) {
        return a.getHealth() <= 0;
    }


}
