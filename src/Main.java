import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();
        String key;
        Student data;

        students.put("1", new Student("Putri", "3H", "Struktur Data", 2020000));
        students.put("2", new Student("Agus", "3A", "Matematika", 2020012));
        students.put("3", new Student("Arro", "3D", "Pemrogramman", 2020017));

        System.out.print("Masukan kunci: ");
        key = input.nextLine();
        data = students.get(key);

        if (data != null) {
            System.out.printf("Nama: %s\nKelas: %s\nMata Kuliah: %s\nNIM: %d\n", data.getName(), data.getClassroom(), data.getCourse(), data.getId());
        }

        input.close();
    }
}