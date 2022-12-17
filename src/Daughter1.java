public class Daughter1 extends Mum implements Printable{


    private Integer hair;
    private String eye;

    public Daughter1(Integer age, String name, Integer hair, String eye) {
        super(age, name);
        this.hair = hair;
        this.eye = eye;
    }
    @Override
    public void print() {
        System.out.println(getInfo() + "\n Hair: "+ hair+"\n Eye: "+eye);
    }
}

