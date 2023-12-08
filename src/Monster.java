public class Monster extends LivingThing implements Fighter{
    public Monster(String name, int health, String pieceColor, int damage){
        super(name, health, pieceColor);
        this.damage = damage;
    }
    public Monster(String name, int health){
        super(name, health);
    }
    private int damage;
    @Override
    public int Hurt(LivingThing unlucky){
        unlucky.setHealth(unlucky.getHealth() - damage);
        return damage;
    }

    @Override
    public int getHealth(LivingThing a) {
        return 0;
    }

    @Override
    public void setHealth(LivingThing a) {

    }

    @Override
    public boolean isDead(LivingThing a) {
        return false;
    }

    public int getDamage() {
        return damage;
    }
}