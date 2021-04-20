package character;

public class Support extends Hero implements Healer {

    public Support(String name){
        super(name);
    }
    @Override
    public void heal() {
        System.out.println("进行治疗");
    }
}

//add modification in testing branch only add more 2
