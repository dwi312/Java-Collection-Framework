# Java Collection Framework (JCF)
## Ringkasan
### 1. Pengertian
Java Collection Framework adalah sekumpulan kelas dan interface yang disediakan Java untuk menyimpan, mengelola, dan memanipulasi data secara efisien. Framework ini menggantikan penggunaan array biasa yang terbatas (fixed size) dengan struktur data dinamis seperti List, Set, Map, dan Queue.
Keuntungan menggunakan JCF:
- Struktur data dinamis (bisa bertambah/berkurang).
- Menyediakan algoritma built-in seperti sort, search, dan shuffle.
- Konsistensi API (interface standar: Collection, List, Set, dll).
- Lebih mudah dalam pemrosesan data kompleks.

---

### 2. Hierarki Dasar Java Collection
Secara umum, JCF terbagi menjadi dua kategori:
- 1. Interface utama:
    - `Collection` (super interface untuk List, Set, Queue)
    - `Map` (key-value pair, tidak turunan dari `Collection`)
- 2. Implementasi:
    - `ArrayList`, `LinkedList` (List)
    - `HashSet`, `TreeSet` (Set)
    - `HashMap`, `TreeMap` (Map)
    - `PriorityQueue`, `LinkedList` (Queue)

---

### 3. Interface dan Implementasi Penting
- **A. List**
    - Menyimpan elemen **berurutan dan dapat duplikat**.
    - Akses menggunakan indeks (seperti array, tapi dinamis).
    - Implementasi umum:
        - `ArrayList` – berbasis array, cepat untuk akses (get), lambat untuk insert di tengah.
        - `LinkedList` – berbasis node (doubly linked), lebih cepat untuk insert/hapus.
    Contoh:
    ```java
    import java.util.ArrayList;
    import java.util.Collections;

    public class DemoList {
        public static void main(String[] args) {
            ArrayList<String> daftarNama = new ArrayList<>();
            daftarNama.add("Andi");
            daftarNama.add("Budi");
            daftarNama.add("Citra");

            Collections.sort(daftarNama);  // mengurutkan
            for (String nama : daftarNama) {
                System.out.println(nama);
            }
        }
    }

    ```
- **B. Set**
    - Menyimpan **elemen unik** (tidak duplikat).
    - Tidak menjamin urutan.
    - Implementasi umum:
        - `HashSet` – tidak berurutan, performa cepat.
        - `TreeSet` – terurut otomatis (ascending).
        - `LinkedHashSet` – mempertahankan urutan penambahan.

        
    Contoh:
    ```java
    import java.util.HashSet;

    public class DemoSet {
        public static void main(String[] args) {
            HashSet<String> hobi = new HashSet<>();
            hobi.add("Membaca");
            hobi.add("Olahraga");
            hobi.add("Membaca"); // duplikat, akan diabaikan

            for (String h : hobi) {
                System.out.println(h);
            }
        }
    }

    ```
- **C. Map**
    - Menyimpan data dalam bentuk **key-value pair**.
    - Key harus **unik**, value boleh duplikat.
    - Implementasi umum:
        - `HashMap` – key tidak berurutan.
        - `TreeMap` – key otomatis terurut.
        - `LinkedHashMap` – mempertahankan urutan penambahan.
        
    Contoh:
    ```java
    import java.util.HashMap;

    public class DemoMap {
        public static void main(String[] args) {
            HashMap<String, String> ibukota = new HashMap<>();
            ibukota.put("Indonesia", "Jakarta");
            ibukota.put("Jepang", "Tokyo");

            System.out.println("Ibukota Indonesia: " + ibukota.get("Indonesia"));
        }
    }

    ```
- **D. Queue**
    - Digunakan untuk **struktur antrian (FIFO)**.
    - Implementasi umum:
        - `LinkedList` – untuk antrian umum.
        - `PriorityQueue` – elemen dengan prioritas tertentu diproses lebih dahulu.
        
    Contoh:
    ```java
    import java.util.LinkedList;
    import java.util.Queue;

    public class DemoQueue {
        public static void main(String[] args) {
            Queue<String> antrian = new LinkedList<>();
            antrian.add("A001");
            antrian.add("A002");
            antrian.add("A003");

            System.out.println("Dipanggil: " + antrian.poll()); // hapus elemen depan
            System.out.println("Berikutnya: " + antrian.peek()); // lihat elemen depan
        }
    }

    ```
---

### 4. Iterator
Digunakan untuk **menelusuri elemen Collection** satu per satu.

Contoh:
```java
import java.util.ArrayList;
import java.util.Iterator;

public class DemoIterator {
    public static void main(String[] args) {
        ArrayList<Integer> angka = new ArrayList<>();
        angka.add(10);
        angka.add(20);
        angka.add(30);

        Iterator<Integer> itr = angka.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

```
---

### 5. Comparable dan Comparator
Digunakan untuk pengurutan kustom.
- `Comparable` – objek itu sendiri menentukan cara dibandingkan (mengimplementasi `compareTo()`).
- `Comparator` – membuat kelas pembanding terpisah.

Contoh:
```java
import java.util.*;

class Siswa implements Comparable<Siswa> {
    String nama;
    int nilai;

    Siswa(String n, int v) { nama = n; nilai = v; }

    @Override
    public int compareTo(Siswa s) {
        return this.nilai - s.nilai; // urut naik berdasarkan nilai
    }
}

public class DemoComparable {
    public static void main(String[] args) {
        ArrayList<Siswa> daftar = new ArrayList<>();
        daftar.add(new Siswa("Andi", 80));
        daftar.add(new Siswa("Budi", 90));

        Collections.sort(daftar);
        for (Siswa s : daftar) {
            System.out.println(s.nama + " - " + s.nilai);
        }
    }
}

```
--- 

### 6. Kapan Menggunakan Apa?
- **ArrayList** → akses cepat, data dinamis, jarang tambah/hapus di tengah.
- **LinkedList** → sering menambah/menghapus data di tengah.
- **HashSet** → data unik, urutan tidak penting.
- **TreeSet** → data unik yang terurut otomatis.
- **HashMap** → key-value, akses cepat tanpa urutan.
- **TreeMap** → key-value dengan key terurut.
- **Queue / PriorityQueue** → sistem antrian.

---

#### Dwi312