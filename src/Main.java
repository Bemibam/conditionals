public class Main {
    public static void go(int age){
        if(age >= 18){
            System.out.println("GO VOTE!!!");
        }else{
            System.out.println("GO PLAY");
        }
    }

    public static void respond(char answer){
        if(answer == 'Y' || answer == 'y'){
            System.out.println("YUP YUP YUP");
        }else{
            System.out.println("NOPE NOPE NOPE");
        }
    }

    public static void drink(int age) {
        if(age < 21){
            System.out.println("juice");
        }else if(age < 50) {
            System.out.println("adult beverage");
        }else if(age < 77) {
            System.out.println("tea");
        }else{
            System.out.println("heavy beverage");
        }
    }
    public static void thankYou() {
        System.out.println("Thank you for coming to our restaurant!");
    }

    public static void main(String[] args) {
        drink(5); // juice
        drink(45); // adult beverage
        drink(51); // tea
        drink(85); // heavy beverage

        for(String a : args) {
            System.out.println(a);
        }

        go(13);
        go(21);

        respond('Y');
        respond('N');
        thankYou();

    }
}