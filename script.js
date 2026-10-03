// 1. Ambil elemen-elemen dari HTML berdasarkan id
const form = document.getElementById("form-registrasi");
const inputNama = document.getElementById("nama");
const inputEmail = document.getElementById("email");
const inputUsername = document.getElementById("username");
const inputPassword = document.getElementById("password");
const inputKonfirmasi = document.getElementById("konfirmasi");
const kotakKesalahan = document.getElementById("pesan-kesalahan");
const kotakSukses = document.getElementById("pesan-sukses");

// 2. Fungsi untuk menampilkan pesan kesalahan (merah)
function tampilkanKesalahan(pesan) {
  kotakSukses.hidden = true;
  kotakKesalahan.textContent = pesan;
  kotakKesalahan.hidden = false;
}

// 3. Fungsi untuk menampilkan pesan sukses (hijau)
function tampilkanSukses(pesan) {
  kotakKesalahan.hidden = true;
  kotakSukses.textContent = pesan;
  kotakSukses.hidden = false;
}

// 4. Pasang event submit pada form
form.addEventListener("submit", function (event) {
  // Cegah halaman dimuat ulang
  event.preventDefault();

  // Ambil nilai input (trim() membuang spasi di awal dan akhir)
  const nama = inputNama.value.trim();
  const email = inputEmail.value.trim();
  const username = inputUsername.value.trim();
  const password = inputPassword.value;
  const konfirmasi = inputKonfirmasi.value;

  // 5. Validasi dengan percabangan
  if (nama === "" || email === "" || username === "" || password === "" || konfirmasi === "") {
    tampilkanKesalahan("Semua kolom wajib diisi.");
  } else if (!email.includes("@")) {
    tampilkanKesalahan("Email harus mengandung tanda @.");
  } else if (password.length < 8) {
    tampilkanKesalahan("Password minimal 8 karakter.");
  } else if (password !== konfirmasi) {
    tampilkanKesalahan("Password dan konfirmasi password harus sama.");
  } else {
    // Semua validasi lolos
    tampilkanSukses("Registrasi berhasil! Terima kasih, " + nama + ".");
    form.reset(); // kosongkan semua kolom input
  }
});