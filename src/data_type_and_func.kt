package com.data_type_and_func

fun print_data_type () {

    // Constanta
    val data1: Long = 1024_1024_1024
    val data2: Int = 1024_1024
    val data3: Short = 1024
    val data4: Byte = 64
    val data5: Double = 2.998
    val data6: Float = 3.14f
    val data7: Char = 'C'
    val data8: Boolean = true
    val data9: String = "Ini Data String"

    println("Constanta Print");
    println("Print Data Typeof (Log): $data1")
    println("Print Data Typeof (Int): $data2")
    println("Print Data Typeof (Short): $data3")
    println("Print Data Typeof (Byte): $data4")
    println("Print Data Typeof (Double): $data5")
    println("Print Data Typeof (Float): $data6")
    println("Print Data Typeof (Char): $data7")
    println("Print Data Typeof (Boolean): $data8")
    println("Print Data Typeof (String): $data9")

    println("\nVariable Print")
    var mutableVar: String = "ini mutable var"
    println("Print Nilai Awal: $mutableVar")
    mutableVar = "ini var di edit"
    println("Print Nilai Akhir: $mutableVar")
}

fun calculateCircle (radius: Int) {
    println("\nCircle Calculation\n");
    val PHI: Double = 3.14

    val result = 2 * PHI * radius
    println("Keliling Lingkaran dengan jari-jari $radius adalah " + String.format("%.1f", result) )
}