Feature: Sales input data customer
#
#  Scenario: User upload document valid
#    When User sudah input data dan click next
#    And User upload foto faskes awal
#    And User upload foto faskes tujuan
#    And User upload foto TTD digital
#    Then Menampilkan message dokumen sudah lengkap
#    And User click button next dan diarahkan ke tab TTD digital
##
#  Scenario: Upload dokumen invalid : tidak upload foto faskes awal
#    When User sudah input1 data dan click next
#    And User tanpa upload foto faskes awal
#    And User upload foto faskes tujuan
#    And User upload foto TTD digital
#    Then User tidak dapat menekan button selanjutnya
#
#  Scenario: Upload dokumen invalid : tidak upload foto faskes tujuan
#    When User sudah input2 data dan click next
#    And User upload foto faskes awal
#    And User tanpa upload foto faskes tujuan
#    And User upload foto TTD digital
#    Then User tidak dapat menekan button selanjutnya
#
#  Scenario: Upload dokumen invalid : tidak upload foto TTD digital
#    When User sudah input3 data dan click next
#    And User upload foto faskes awal
#    And User upload foto faskes tujuan
#    And User tanpa upload foto TTD digital
#    Then User tidak dapat menekan button selanjutnya
#
#  Scenario: Upload dokumen invalid : upload gambar faskes awal dengan format PNG
#    When User sudah input data dan click next : test format file
#    And User upload foto faskes awal dengan format PNG
#    And User click save gambar faskes awal
#    Then Menampilkan alert data berhasil di upload
#
#  Scenario: Upload dokumen invalid : upload gambar faskes tujuan dengan format PNG
#    When User upload foto faskes tujuan dengan format PNG
#    And User click save gambar faskes tujuan
#    Then Menampilkan alert data berhasil di upload
#
#  Scenario: Upload dokumen invalid : upload gambar TTD digital dengan format PNG
#    When User upload foto TTD digital format PNG
#    And User click save gambar TTD digital
#    Then Menampilkan alert data berhasil di upload
#
#  Scenario: Upload dokumen invalid : upload gambar faskes awal dengan size lebih dari 5mb
#    When User sudah input data dan click next : test size lebih dari 5mb
#    And User upload foto faskes awal dengan size lebih dari 5mb
#    And User click save gambar
#    Then Menampilkan alert upload is larger than the permitted size
#
#  Scenario: Upload dokumen invalid : upload gambar faskes tujuan dengan size lebih dari 5mb
#    When User upload foto faskes tujuan dengan size lebih dari 5mb
#    And User click save gambar
#    Then Menampilkan alert upload is larger than the permitted size
#
#  Scenario: Upload dokumen invalid : upload gambar TTD digital dengan size lebih dari 5mb
#    When User upload foto TTD digital dengan size lebih dari 5mb
#    And User click save gambar
#    Then Menampilkan alert upload is larger than the permitted size
##
#  Scenario: Upload dokumen invalid : memasukan gambar faskes awal dengan format JFIF
#    When User upload foto faskes awal dengan format JFIF
#    And User click save gambar
#    Then Menampilkan alert upload error
#
#  Scenario: Upload dokumen invalid : memasukan gambar faskes tujuan dengan format JFIF
#    When User upload foto faskes tujuan dengan format JFIF
#    And User click save gambar
#    Then Menampilkan alert upload error
#
#  Scenario: Upload dokumen invalid : memasukan gambar TTD digital dengan format JFIF
#    When User upload foto TTD digital dengan format JFIF
#    And User click save gambar
#    Then Menampilkan alert upload error
#
#  Scenario: Upload dokumen invalid : memasukan gambar faskes awal dengan format SVG
#    When User upload foto faskes awal dengan format SVG
#    And User click save gambar faskes awal
#    Then Menampilkan alert upload error
#
#  Scenario: Upload dokumen invalid : memasukan gambar faskes tujuan dengan format SVG
#
#    When User upload foto faskes tujuan dengan format SVG
#    And User click save gambar faskes tujuan
#    Then Menampilkan alert upload error
#
#  Scenario: Upload dokumen invalid : memasukan gambar TTD digital dengan format SVG
#    When User upload foto TTD digital dengan  format SVG
#    And User click save gambar
#    Then Menampilkan alert upload error
##
#  Scenario: Upload dokumen invalid : memasukan gambar faskes awal dengan format WEBP
#    And User upload foto faskes awal dengan format WEBP
#    And User click save gambar
#    Then Menampilkan alert upload error
#
#  Scenario: Upload dokumen invalid : memasukan gambar faskes tujuan dengan format WEBP
#    And User upload foto faskes tujuan dengan format WEBP
#    And User click save gambar
#    Then Menampilkan alert upload error
#
#  Scenario: Upload dokumen invalid : memasukan gambar TTD digital dengan format WEBP
#    And User upload foto TTD digital dengan format WEBP
#    And User click save gambar
#    Then Menampilkan alert upload error
#
#  Scenario: Upload dokumen invalid : memasukan gambar faskes awal dengan format RAW
#    And User upload foto faskes awal dengan format RAW
#    And User click save gambar
#    Then Menampilkan alert upload error
#
#  Scenario: Upload dokumen invalid : memasukan gambar faskes tujuan dengan format RAW
#    And User upload foto faskes tujuan dengan format RAW
#    And User click save gambar
#    Then Menampilkan alert upload error
#
#  Scenario: Upload dokumen invalid : memasukan gambar TTD digital dengan format RAW
#    And User upload foto TTD digital dengan format RAW
#    And User click save gambar
#    Then Menampilkan alert upload error
#
#
