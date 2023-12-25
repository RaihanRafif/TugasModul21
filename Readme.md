# Pengujian Fitur Aplikasi

## Tujuan
Melakukan pengujian terhadap fitur login dan menambahkan barang ke keranjang untuk memastikan fungsionalitas bekerja sebagaimana mestinya.

### Fitur yang Diuji
1. **Login Test**
    - Pengujian menggunakan data yang valid untuk memastikan pengguna dapat login dengan hasil positif.
    - Pengujian menggunakan data yang tidak valid untuk memastikan sistem memberikan hasil negatif.

2. **Add Cart**
    - Pengujian menambahkan barang ke keranjang setelah pengguna berhasil login.
    - Pengujian menghapus barang dari keranjang setelah pengguna berhasil login dan menambahkan barang.

## Cara Menjalankan Pengujian

Pengujian ini dapat dilakukan dengan beberapa cara:

### 1. Melalui Runner CucumberTest
- Lokasi: File `CucumberTest` pada direktori tertentu.
- Cara Menjalankan: Jalankan runner ini, dan laporan pengujian akan tergenerate secara otomatis.

### 2. Cara Manual
- Lokasi: Masing-masing file `.feature` yang tersedia.
- Cara Menjalankan: Pilih dan jalankan fitur tertentu atau semua fitur sekaligus sesuai dengan kebutuhan pengujian.

## Catatan Penting
- Pastikan semua dependensi dan lingkungan pengujian telah terkonfigurasi dengan benar sebelum menjalankan skenario pengujian.
- Review dan sesuaikan parameter pengujian sesuai dengan lingkungan dan kebutuhan Anda.
- Cek laporan pengujian untuk menganalisis hasil dan melakukan tindakan perbaikan jika diperlukan.

