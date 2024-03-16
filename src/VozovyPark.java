public class VozovyPark {
    public static void main(String[] args) {
        Garaz garaz = new Garaz();
        Auto skoda = new Auto("123ABC", "modrá");
        skoda.zaparkuj(garaz);
        System.out.println(garaz);
    }
}