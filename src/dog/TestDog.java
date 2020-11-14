package dog;

public class TestDog {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog("Chester");
        Dog d3 = new Dog("Robert", 5);

        d2.setAge(2);
        d1.setName("Dean");
        d1.setAge(8);
        System.out.println(d3.toStr());
        System.out.println("Name "  + d1.getName());
        System.out.println("Age "  + d2.getAge());
        d1.intoHumaneAge();
        d2.intoHumaneAge();
        d3.intoHumaneAge();
    }
}
