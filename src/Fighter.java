public interface Fighter {
    int Hurt(LivingThing unlucky);
    int getHealth(LivingThing a);
    void setHealth(LivingThing a);
    boolean isDead(LivingThing a);
}
