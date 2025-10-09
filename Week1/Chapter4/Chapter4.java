void main() {

    int[] numAnimals;
    int [] numAnimals2;
    int []numAnimals3;
    int numAnimals4[];
    int numAnimals5 [];

    String[] bugs = { "cricket", "beetle", "ladybug" };
    String[] alias = bugs;
    String[] anotherArray = { "cricket", "beetle", "ladybug" };
    System.out.println(bugs.equals(alias));        // true
    System.out.println(bugs.equals(anotherArray)); // false
    System.out.println(bugs.toString());           // [Ljava.lang.String;@160bc7c0

}