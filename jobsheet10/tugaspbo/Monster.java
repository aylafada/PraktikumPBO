package jobsheet10.tugaspbo;

public abstract class Monster implements Damageable {
    protected int health;
    protected int level;

    public abstract void heal();
    public abstract void damaged();
    public abstract String getMonsterInfo();
}