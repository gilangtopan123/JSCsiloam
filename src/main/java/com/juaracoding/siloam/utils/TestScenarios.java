package com.juaracoding.siloam.utils;

public enum TestScenarios {
//    T1("User edit dengan menghapus nama failed"),
//    T2("User edit dengan menghapus nama Passed"),
//    T3("User edit dengan mengisi nomor bpjs kurang dari 13 digit"),
//    T4("User edit dengan menghapus nomor bpjs failed"),
//    T5("User edit dengan menghapus nomor bpjs passed"),
//    T6("User edit dengan mengisi nomor ktp kurang dari 16 digit"),
//    T7("User edit dengan menghapus nomor ktp failed"),
//    T8("User edit dengan menghapus alamat failed"),
//    T9("User edit dengan menghapus alamat passed"),
//    T10("User edit dengan mengganti kota ktp"),
//    T11("User edit dengan menghapus faskes awal failed"),
//    T12("User edit dengan mengganti faskes tujuan berbeda dengan kota ktp failed"),
//    T13("User edit dengan mengganti faskes tujuan berbeda dengan kota ktp passed"),
//    T14("User edit dengan mengganti faskes tujuan sama dengan kota ktp"),
//    T15("User edit dengan menghapus foto before"),
//    T16("User edit ganti foto before"),
//    T17("User edit dengan menghapus foto after"),
//    T18("User edit ganti foto after"),
//    T19("User edit dengan menghapus foto TTD Digital"),
//    T20("User edit ganti foto TTD"),
//    T21("User menekan tombol submit");

    //---------------------------------------------test input data---------------------------------------
//    T2("Input username null dan password null"),
//    T3("Input username valid dan password null"),
//    T4("Input username null dan password valid"),
//    T5("Input invalid username(case sensitive) dan password valid"),
//    T6("Input username valid dan password invalid case sensitive"),
//    T7("Input invalid username dan password valid"),
//    T8("Input invalid username dan password valid"),
//    T9("Input username kurang dari 8 atau lebih dari 16 digit dan password valid"),
//    T10("Input username valid dan password kurang dari 8 atau lebih dari 16 digit"),
//    T11("Input username dan password valid"),
//    T12("Sales logout dari web"),
//    T13("Sales Input username null dan password null"),
//    T14("Sales Input username null dan password valid"),
//    T15("Sales Input username valid dan password null"),
//    T16("Sales Input username invalid case sensitive dan password valid"),
//    T17("Sales Input username valid dan password invalid"),
//    T18("Sales Input username invalid dan password valid"),
//    T19("Sales Input username dan password valid"),
//    T20("Sales Input username valid dan password invalid case sensitive"),
//   T21("Sales Input data null nama"),
//    T22("Sales Input data null Nomor Bpjs"),
//    T23("Sales Input data Nomor Bpjs yang sudah terdaftar"),
//    T24("Sales Input data nomor Bpjs kurang dari 13 digit"),
//    T25("Sales Input karakter huruf di fields no Bpjs"),
//    T26("Sales Input data null Nomor KTP"),
//    T27("Sales Input data nomor KTP kurang dari 13 digit"),
//    T28("Sales Input data nomor KTP menggunakan karakter huruf"),
//    T29("Sales Input data null alamat"),
//    T30("Sales tidak mengisi kota KTP null"),
//    T31("Sales tidak mengisi faskes awal null"),
//    T32("Sales tidak mengisi faskes tujuan null"),
//    T33("Sales tidak mengisi alasan null"),
//    T34("Sales input valid data customer yang mempunyai kota ktp dan faskes tujuan sama"),
//    T35("Sales input valid data customer yang mempunyai kota ktp dan faskes tujuan beda");

    //upload document
    T36("User upload document valid"),
    T37("Upload dokumen invalid : tidak upload memasukan foto faskes awal"),
    T38("Upload dokumen invalid : tidak upload memasukan foto faskes tujuan"),
    T39("Upload dokumen invalid : tidak upload memasukan foto TTD digital"),
    T40("Upload dokumen invalid : upload gambar faskes awal dengan format PNG"),
    T41("Upload dokumen invalid : upload gambar faskes tujuan dengan format PNG"),
    T42("Upload dokumen invalid : upload gambar TTD digital dengan format PNG"),
    T43("Upload dokumen invalid : upload gambar faskes awal dengan size lebih dari 5mb"),
    T44("Upload dokumen invalid : upload gambar faskes tujuan dengan size lebih dari 5mb"),
    T45("Upload dokumen invalid : upload gambar TTD digital dengan size lebih dari 5mb"),
    T46("Upload dokumen invalid : memasukan gambar faskes awal dengan format JFIF"),
    T47("Upload dokumen invalid : memasukan gambar faskes tujuan dengan format JFIF"),
    T48("Upload dokumen invalid : memasukan gambar TTD digital dengan format JFIF"),
    T49("Upload dokumen invalid : memasukan gambar faskes awal dengan format SVG"),
    T50("Upload dokumen invalid : memasukan gambar faskes tujuan dengan format SVG"),
    T51("Upload dokumen invalid : memasukan gambar TTD digital dengan format SVG"),
    T52("Upload dokumen invalid : memasukan gambar faskes awal dengan format WEBP"),
    T53("Upload dokumen invalid : memasukan gambar faskes tujuan dengan format WEBP"),
    T54("Upload dokumen invalid : memasukan gambar TTD digital dengan format WEBP"),
    T55("Upload dokumen invalid : memasukan gambar faskes awal dengan format RAW"),
    T56("Upload dokumen invalid : memasukan gambar faskes tujuan dengan format RAW"),
    T57("Upload dokumen invalid : memasukan gambar TTD digital dengan format RAW");


    // View & Export
//    T1("Input username dan password valid"),
//    T2("Filter data valid"),
//    T3("Filter data invalid: tanpa start date"),
//    T4("Filter data invalid: tanpa end date"),
//    T5("Refresh data user"),
//    T6("Filter data invalid : pilih date DESC"),
//    T7("Menampilkan foto sales Faskes Awal")  ,
//    T8("Menampilkan foto sales Faskes Tujuan"),
//    T9("Menampilkan PDF agreement sales"),
//    T10("Menampilkan view data user yang telah di filter"),
//    T11("Mengexport Data user valid"),
//    T12("Mengexport data invalid : tanpa filter data"),
//    T13("Mengexport Data user invalid : tidak ada data pada tanggal di filter"),
//    T14("Mendownload Data user valid"),
//    T15("Mendownload data invalid : tanpa filter data"),
//    T16("Mendownload Data user invalid : tidak ada data pada tanggal di filter"),
//    T17("View Data (Preview Data)");
    private String testCaseName;
    TestScenarios(String value){
        testCaseName = value;
    }
    public String getTestCaseName(){
        return testCaseName;
    }
}
