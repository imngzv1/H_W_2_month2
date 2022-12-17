public class Main {
    public static void main(String[] args) {
        Printable[] printables = {
                createObject("Daughter1"),
                createObject("Daughter2"),
                createObject("Daughter3")
        };
        for (Printable printable:printables
             ) {
            printable.print();

        }


    }

    public static Printable createObject(String className) {
        switch (className) {
            case "Daughter1":
                Daughter1 daughter1 = new Daughter1(10, "Anya", 15, "Blue");
                return daughter1;

            case "Daughter2":
                Daughter2 daughter2 = new Daughter2(90, "Volodya", "White");
                return daughter2;

            case "Daughter3":
                Daughter3 daughter3 = new Daughter3(30, "Kot", "Green", 30);
                return daughter3;
        }
        return null;
    }
}