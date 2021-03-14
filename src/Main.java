public class Main {
    public static void main(String[] args) {
        int client = 300;
        int total = 2100;
        int bonus = 0;
        if (total >=1000) {
            bonus = total / 100;
        }
        int balance = total + client + bonus;
        System.out.println(balance);
    }
}
