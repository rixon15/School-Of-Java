public class Lion extends Animal {

    protected void setProperties(int age, String n) {
        setAge(age);
        name = n;
    }

    public void roar() {
        System.out.println(name + ", age " + getAge() + ", says: Roar!");
    }

    static void main() {
        var lion = new Lion();
        lion.setProperties(3, "kion");
        lion.roar();
    }
}
