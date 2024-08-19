package RecursionAlgorithms;

public class TowersOfHanoi {

    public static void main(String[] args) {
        towersOfHanoi(3,'a','c','b');
    }

    public static void towersOfHanoi(int n, char fromRod, char toRod, char auxRod) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + fromRod + " to " + toRod);
            return;
        }
        towersOfHanoi(n - 1, fromRod, auxRod, toRod);
        System.out.println("Move disk " + n + " from " + fromRod + " to " + toRod);
        towersOfHanoi(n - 1, auxRod, toRod, fromRod);
    }

}
