
import java.util.ArrayList;
import java.util.Collection;

public class BelajarCollection {
    public static void main(String[] args) {
        Collection<String> bahasa = new ArrayList<>();

        bahasa.add("Java");
        bahasa.add("Python");
        bahasa.add("C++");

        System.out.println("Daftar Bahasa: ");
        int no = 1;
        for (String b : bahasa) {
            System.out.println(no + ". " + b);
            no++;
        }

        System.out.println("Total: " + bahasa.size());
        System.out.println();
        
        for (String b : bahasa) {
            if (b.equalsIgnoreCase("Python")) {
                System.out.println("Hapus Bahasa: " + b);
                bahasa.remove("Python");
            }
        }

        System.out.println();
        System.out.println("Setelah dihapus: " + bahasa);
        
    }


}
