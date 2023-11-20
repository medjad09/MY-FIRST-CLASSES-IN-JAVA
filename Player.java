public class Player {
    private int number;
    private String name;
    private int rank;
    private int age;

    public Player(int number, String name, int rank, int age) {
        this.number = number;
        this.name = name;
        this.rank = rank;
        this.age = age;
    }

    public void info() {
        System.out.println("The player number " + number + ", " + name + ", rank is " + rank + ", age is " + age);
    }

    public static void main(String[] args) {
        Player player1 = new Player(1, "Ali", 5, 22);
        Player player2 = new Player(2, "Anas", 8, 32);

        player1.info();
        player2.info();
    }
}