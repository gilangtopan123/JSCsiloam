Feature: Input TTD Digital
#  ---------------nama-------------------------
#  Scenario: User edit dengan menghapus nama failed
#    Given User sudah membuka alamat url login input data dan upload dokumen
#    When User edit nama menjadi null
#    And User click simpan data
#    Then User mendapatkan message Please fill the fields nama
#
#  Scenario: User edit dengan menghapus nama Passed
#    When User edit nama menjadi null
#    And User click simpan data
#    Then User mendapatkan info data berhasil disimpan
#
##    ---------------bpjs-----------------------
#  Scenario: User edit dengan mengisi nomor bpjs kurang dari 13 digit
#    When User edit nomor bpjs kurang dari 13 digit
#    And User click simpan data
#    Then User mendapatkan message nomor bpjs kurang dari 13 digit
#
#  Scenario: User edit dengan menghapus nomor bpjs failed
#    When User edit nomor bpjs menjadi null
#    And User click simpan data
#    Then User mendapatkan message Please fill the fields nomor bpjs
#
#  Scenario: User edit dengan menghapus nomor bpjs passed
#    When User edit nomor bpjs menjadi null
#    And User click simpan data
#    Then User mendapatkan message bpjs already exist
#
##  ------------------nomor ktp--------------
#  Scenario: User edit dengan mengisi nomor ktp kurang dari 16 digit
#    When User edit nomor ktp kurang dari 16 digit
#    And User click simpan data
#    Then User mendapatkan message nomor ktp kurang dari 16 digit
#
#  Scenario: User edit dengan menghapus nomor ktp failed
#    When User edit nomor ktp menjadi null
#    And User click simpan data
#    Then User mendapatkan message Please fill the fields nomor ktp
#
#
##    -----------------alamat----------------------
#  Scenario: User edit dengan menghapus alamat passed
#    When User edit alamat menjadi null
#    And User click simpan data
#    Then User mendapatkan message Please fill the fields alamat
#
#  Scenario: User edit dengan menghapus alamat failed
#    When User edit alamat menjadi null
#    And User click simpan data
#    Then User mendapatkan info data berhasil disimpan
#
## -----------------ddown kota ktp----------------
#  Scenario: User edit dengan mengganti kota ktp
#    When User edit kota ktp
#    And User click simpan data
#    Then User mendapatkan info data berhasil disimpan
#
## -------------------faskes awal-----------------
#  Scenario: User edit dengan menghapus faskes awal failed
#    When User edit faskes awal menjadi null
#    And User click simpan data
#    Then User mendapatkan message Please fill the fields faskes awal
#
## ------------------faskes tujuan berbeda dari kota ktp-------------------
#  Scenario: User edit dengan mengganti faskes tujuan berbeda dengan kota ktp failed
#    When User edit faskes tujuan berbeda dari kota ktp
#    And User mengisi alasan null
#    And User click simpan data
#    Then User mendapatkan message Please fill the fields alasan
#
#
#  Scenario: User edit dengan mengganti faskes tujuan berbeda dengan kota ktp passed
#    When User edit faskes tujuan berbeda dari kota ktp
#    And User mengisi alasan
#    And User click simpan data
#    Then User mendapatkan info data berhasil disimpan
#
## ---------------------faskes tujuan kota ktp sama---------------
#  Scenario: User edit dengan mengganti faskes tujuan sama dengan kota ktp
#    When User edit faskes tujuan sama dari kota ktp
#    And User click simpan data
#    Then User mendapatkan info data berhasil disimpan
#
## --------------------Edit foto------------------------------------
#  Scenario: User edit dengan menghapus foto before
#    When User menekan tombol x di foto before
#    Then User mendapatkan message dokumen tidak lengkap
#
#  Scenario: User edit ganti foto before
#    When User mengganti foto before
#    Then User mendapatkan message dokumen lengkap
#
#  Scenario: User edit dengan menghapus foto after
#    When User menekan tombol x di foto after
#    Then User mendapatkan message dokumen tidak lengkap
#
#  Scenario: User edit ganti foto after
#    When User mengganti foto after
#    Then User mendapatkan message dokumen lengkap
#
#  Scenario: User edit dengan menghapus foto TTD Digital
#    When User menekan tombol x di foto TTD
#    Then User mendapatkan message dokumen tidak lengkap
#
#  Scenario: User edit ganti foto TTD
#    When User mengganti foto TTD
#    Then User mendapatkan message dokumen lengkap
#
#  Scenario: User menekan tombol submit
#    When User scroll ke tombol submit
#    And User menekan tombol submit
#    Then User menuju ke menu input



