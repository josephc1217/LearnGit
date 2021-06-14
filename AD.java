package character;

public interface AD {
    //物理+还是其他伤害
    public void physicAttack();

    default public void attack(){
        System.out.println("ad hero attack");

    }
    //first mod in 14
}
