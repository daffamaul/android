# android lifecycle
- class Activity memiliki sejumlah callback yg berfungsi menentukan perilaku saat pengguna keluar dan memasuki aktivitas

- penerapan callback dapat menghindari error ketiak pengguna menerima telp atau beralih ke apk lain, menghindari penggunaan sumber daya sistem yg berharga, menghindari kehilangan progres pengguna ketika pengguna keluar dari apk, menghindari error/kehilangan progres pengguna ketika layar diputar menjadi lanskap dan potret

- class Activity menyediakan set inti 6 callback yaitu onCreate(), onStart(), onResume(), onPause(), onStop(), onDestroy()

- onCreate(), callback ini wajib karena perlu untuk membuat aktivitas. Didalam onCreate() terdapat logika yg hanya boleh dijalankan sekali. method ini menerima parameter savedInstanceState dari objek Bundle yang berisi aktivitas yang sebelumnya disimpan. Jika belum pernah disimpan sebelumnya, maka Bundle null. Ketika onCreate() telah dieksekusi, maka sistem memanggil metode onStart() dan onResume().

- onStart(), callback ini membuat aktivitas terlihat oleh pengguna. Siklus proses aktivias akan menerima peristiwa ON_START. Eksekusi onStart() selesai dengan sangat cepat dan tidak lagi berada pada status Dimulai melainkan memasuki status Dilanjutkan dan akan memanggil metode onResume().

- onResume(), callback ini adalah status dimana aplikasi berinteraksi dengan pengguna. Aplikasi akan pada status ini sampai terjadi menerima telepon/beralih ke aktivitas lain/layar perangkat mati. Siklus proses aktivitas akan menerima peristiwa ON_RESUME, pada siklus ini dapat menjalankan fungsi apapun yan terlihat dan berada di latar depan. Jika terjadi interupsi, maka memasuki status Dijeda dengan memanggil callback onPause(). Jika aktivitas dilanjutkan maka status berubah lagi menjadi Dilanjutkan dengan memanggil metode onResume()

- onPause(), callback ini akan dipanggil yg mengindikasikan bahwa pengguna meninggalkan aktivitas dan aktivitas tidak lagi di latar depan meskipun masih terlihat di multi jendela. Siklus proses aktivitas akan menerima peristiwa ON_PAUSE yang dapat menghentikan fungsi apapun yang tidak perlu dijalankan. onPause() tidak boleh digunakan untuk menyimpan data pengguna, melakukan panggilan jaringan atau melakukan transaksi database.

- onStop(), callback ini mengindikasikan bahwa aktivitas tidak lagi terlihat oleh pengguna dan memasuki status Berhenti. Siklus proses aktivitas akan menerima peristiwa ON_STOP yg dapat menghentikan fungsi apapun yang tidak terlihat layar. Jika pengguna kembali ke aktivitas, sistem akan memanggil onRestart(). Jika aktivitas selesai berjalan, sistem akan memanggil onDestroy().

- onDestroy(), callback ini dipanggil sebelum aktivitas ditutup karena aktivitas benar-benar selesai dan sistem sementara ditutup karena perubahan konfigurasi. Siklus proses aktivitas akan menerima peristiwa ON_DESTROY ketika statusnya Ditutup.
