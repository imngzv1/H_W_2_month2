public class Daughter3 extends Mum implements Printable{
    private String ColorOfEye;
    private Integer SizeOfClothes;

    public Daughter3(Integer age, String name, String colorOfEye, Integer sizeOfClothes) {
        super(age, name);
        this.ColorOfEye = colorOfEye;
        this.SizeOfClothes = sizeOfClothes;
    }
    @Override
    public void print() {
        System.out.println(getInfo()+"\n ColorOfEye: "+ColorOfEye+"\n SizeOfClothes: "+SizeOfClothes);
    }
}
