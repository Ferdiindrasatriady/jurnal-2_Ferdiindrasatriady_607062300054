public class main {

    public static void main(String[] args) {
        kiw <String> queue = new kiw<>();

        queue.enqueue(" Tugas Isd");
        queue.printQueue();
        System.out.println();

        queue.enqueue("Tugas SBD");
        queue.printQueue();
        System.out.println();

        queue.dequeue();
        queue.printQueue();
        System.out.println();

        queue.enqueue("Menampilkan Seluruh");
        queue.printQueue();
        System.out.println();
    }
}