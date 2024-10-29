Feature: View & Export Data User

  Scenario: Filter data valid
    When Admin click menu view export
    And Admin memilih start date
    And Admin memilih end date
    And Admin click filter
    Then Menampilkan data user yang telah difilter

  Scenario: Filter data invalid: tanpa start date
    When Admin click menu view export
    And Admin tidak memilih start date
    And Admin memilih end date
    And Admin click filter
    Then Menampilkan alert please fill out this field start date

  Scenario: Filter data invalid: tanpa end date
    When Admin click menu view export
    And Admin memilih start date
    And Admin tidak memilih end date
    And Admin click filter
    Then Menampilkan alert please fill out this field end date

  Scenario: Refresh data user
    When Admin sudah filter data user
    And Admin click button refresh
    Then Semua field filter ke reset kembali ke awal sebelum difilter


  Scenario: Filter data invalid : pilih date DESC
    When Admin click menu view export
    And Admin memilih start date desc
    And Admin memilih end date asc
    And Admin click filter
    Then Tidak  berhasil menampilkan data user berdasarkan date yang dipilih


  Scenario: Menampilkan foto sales Faskes Awal
    When Admin sudah filter data user
    And Admin click tag link pada tabel foto faskes awal
    Then Menampilkan foto faskes awal di new tab browser

  Scenario: Menampilkan foto sales Faskes Tujuan
    When Admin sudah filter data user
    And Admin click tag link pada tabel foto faskes tujuan
    Then Menampilkan foto faskes tujuan di new tab browser

  Scenario: Menampilkan PDF agreement sales
    When Admin sudah filter data user
    And Admin click tag link pdf agreement
    Then Menampilkan file format pdf di new tab browser

  Scenario: Menampilkan view data user yang telah di filter
    When Admin click menu view export
    And Admin memilih start date
    And Admin memilih end date
    And Admin click filter
    And Admin click button view pada tabel user
    Then Menampilkan page view data user di new tab browser

  Scenario: Mengexport Data user valid
    When Admin click menu view export
    And Admin memilih start date
    And Admin memilih end date
    And Admin click filter
    And Admin click button Export
    Then Admin mendownload file export berformat xls


  Scenario: Mengexport data invalid : tanpa filter data
    When Admin click menu view export
    And Admin click button Export
    Then Menampilkan alert mohon isi start_date dan end_date terlebih dahulu!!!

  Scenario: Mengexport Data user invalid : tidak ada data pada tanggal di filter
    When Admin click menu view export
    And Admin memilih tanggal yang tidak ada data
    And Admin click filter
    And Admin click button Export
    Then Menampilkan alert Data tidak ada

  Scenario: Mendownload Data user valid
    When Admin click menu view export
    And Admin memilih start date
    And Admin memilih end date
    And Admin click filter
    And Admin click button Download
    Then Admin mendownload file download berformat zip
#

  Scenario: Menndowload data invalid : tanpa filter data
    When Admin click menu view export
    And Admin click button Download
    Then Menampilkan alert mohon isi start_date dan end_date terlebih dahulu!!!

  Scenario: Mendownload Data user invalid : tidak ada data pada tanggal di filter
    When Admin click menu view export
    And Admin memilih tanggal yang tidak ada data
    And Admin click filter
    And Admin click button Download
    Then Menampilkan alert Data tidak ada

  Scenario: View Data (Preview Data)
    When Admin click menu view export
    And Admin sudah filter data user
    And Admin click button view pada tabel user
    And Admin click priview button
    Then menampilkan file berformat PDF pada new tab browser
