public class Daughter2 extends Mum implements Printable{
     private String ColorOfHair;
     private Integer height;

    public Daughter2(Integer age, String name, String colorOfHair) {
        super(age, name);
        this.ColorOfHair = colorOfHair;
        this.height = height;
    }
    @Override
    public void print() {
        System.out.println(getInfo() + "\n Color hair: "+ ColorOfHair+"\n Height: "+height);
    }
}
