public class Mum implements Printable {
    private Integer age;
    private String name;

    public Mum(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getInfo(){
        return "age: " + age+ " Name"+ name;
    }

    @Override
    public void print() {
        System.out.println(getInfo());
    }
}
