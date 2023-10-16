# android lifecycle
- class Activity memiliki sejumlah callback yg berfungsi menentukan perilaku saat pengguna keluar dan memasuki aktivitas

- penerapan callback dapat menghindari error ketiak pengguna menerima telp atau beralih ke apk lain, menghindari penggunaan sumber daya sistem yg berharga, menghindari kehilangan progres pengguna ketika pengguna keluar dari apk, menghindari error/kehilangan progres pengguna ketika layar diputar menjadi lanskap dan potret

- class Activity menyediakan set inti 6 callback yaitu onCreate(), onStart(), onResume(), onPause(), onStop(), onDestroy()

- onCreate(), callback ini wajib karena perlu untuk membuat aktivitas. Didalam onCreate() terdapat logika yg hanya boleh dijalankan sekali. method ini menerima parameter savedInstanceState dari objek Bundle yang berisi aktivitas yang sebelumnya disimpan. Jika belum pernah disimpan sebelumnya, maka Bundle null
