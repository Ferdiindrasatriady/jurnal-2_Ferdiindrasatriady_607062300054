/**
 * main
 */
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        gen <atk> atkList = new gen<>(5);
        gen <bug> bugList = new gen<>(5);

        atkList.addData(new atk("A0001", "pensil", "Joyko 2B", 25));
        atkList.addData(new atk("A0002", "pensil", "Faber Castle 2B", 30));
        atkList.addData(new atk("A0003", "Pulpen", "Joyk0 Merah", 22));
        atkList.addData(new atk("B0001", "Kertas", "Karton", 25));
        atkList.addData(new atk("B0002", "Kertas", "HVS", 105));

        bugList.addData(new bug("C0001", "Dasi", "Dasi Merah SD", 50));
        bugList.addData(new bug("C0002", "Dasi", "Dasi Biru SMP", 50));
        bugList.addData(new bug("C0003", "Dasi", "Dasi Biru SMA", 50));
        bugList.addData(new bug("C0004", "Sabuk", "Sabuk SD", 50));
        bugList.addData(new bug("C0005", "Sabuk", "Sabuk SMP", 50));

        atkList.display();
    }
}