Feature: Input Data

  Scenario: TCC.SILOAM.063 Browser menampilkan halaman home siloam
    When TCC.SILOAM.063 Browser menampilkan halaman home siloam
    And TCC.SILOAM.063 Klik menu input
    Then TCC.SILOAM.063 Menampilkan halaman input

  Scenario: Input form data
    When Menampilkan halaman input
    And Input nama
    And Input nomor bpjs
    And input nomor ktp
    And input alamat
    And input kota ktp
    And input faskes awal
    And input faskes tujuan
    And klik button simpan data
    Then masuk halaman upload data
