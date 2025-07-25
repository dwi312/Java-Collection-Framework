# Hari 1 - Pengantar Collection Framework & Interface Collection

**Tanggal:**  
**Waktu Belajar:**  

---

## Tujuan Pembelajaran
- Memahami konsep Java Collection Framework.
- Mengenal hirarki utama: `Iterable`, `Collection`, `List`, `Set`, `Queue`.
- Mempelajari metode dasar interface `Collection`.  
- Menggunakan `Iterator` untuk traversing koleksi.

---

## Materi Ringkasan
1. **Apa itu Collection Framework**  
   Sekumpulan class & interface bawaan Java (di `java.util`) untuk menyimpan dan memanipulasi data.

2. **Hirarki Dasar**
   ```plaintext

   java.lang.Iterable
       └── java.util.Collection
            ├── List
            ├── Set
            └── Queue
  
   ```
3. **Metode Umum di Collection**
- `add(E e)`
- `remove(Object o)`
- `contains(Object o)`
- `size()`, `isEmpty()`, `clear()`
- `iterator()`

4. **Iterator**
Digunakan untuk menelusuri elemen koleksi:
```java
Iterator<String> itr = koleksi.iterator();
while (itr.hasNext()) {
    System.out.println(itr.next());
}

```

5. **Generics & Wrapper**
- Collection hanya mendukung objek (`Integer` bukan `int`).
- Gunakan autoboxing untuk angka.

---

## Referensi
1. [Java SE Documentation – Collections Framework](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/index.html)  
2. [Oracle Java Tutorials – Collections](https://docs.oracle.com/javase/tutorial/collections/index.html)  
3. Catatan eksperimen pribadi

---
