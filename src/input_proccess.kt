package com.input_procccess

fun simpleInput () {
    println("\nInput Operator\n");

    val nama: String
    val umur: Int
    val hp: String

    print("Masukkan Nama Anda: ")
    nama = readLine()!!.toString()
    print("Masukkan Umur Anda: ")
    umur = readLine()!!.toInt()
    print("Masukkan Nomor Anda: ")
    hp = readLine()!!.toString()
    println("\nNama Anda: $nama")
    println("Umur Anda: $umur")
    println("Nomor HP Anda: $hp")
}

fun incrementOperator () {
    println("\nIncrement Operator\n")
    val dataA: Int
    val dataB: Int

    var x = 10

    dataA = ++x // Pre-Increment
    dataB = x++ // Post-Increment
    println("Isi Variable pre-Increment: $dataA")
    println("Isi Variable post-Increment: $dataB")
}

fun decrementOperator () {
    println("\nDecrement Operator\n")
    val dataA: Int
    val dataB: Int

    var x = 10

    dataA = --x // Pre-Decrement
    dataB = x-- // Post-Decrement
    println("Isi Variable pre-Decrement: $dataA")
    println("Isi Variable post-Decrement: $dataB")

}

fun arithmeticOperators () {
    println("\nArithmetic Operators\n")

    val number1: Int
    val number2: Int
    val number3: Int

    val addition: Int
    val substraction: Int
    val multiplication: Int
    val division: Int
    val modulo: Int

    number1 = 100
    number2 = 15
    number3 = 18

    addition = number1 + number2
    substraction = number1 - number2
    multiplication = number2 * number3
    division = number1 / number3
    modulo = number1 * number2
    println("Number1: $number1")
    println("Number2: $number2")
    println("Number3: $number3")
    println("Number1 + Number2 = $addition")
    println("Number1 - Number2 = $substraction")
    println("Number2 * Number3 = $multiplication")
    println("Number1 / Number3 = $division")
    println("Number1 % Number2 = $modulo")
}

fun relationOperators () {
    println("\nRelation Operators\n")

    val a = 10
    val b = 20

    if (a < b) println("Nilai A kurang dari Nilai B") else println("Nilai A lebih dari nilai B")
    if (a > b) println("Nilai A lebih dari Nilai B") else println("Nilai A kurang dari nilai B")
    if (a !== b) println("Nilai A tidak sama dengan Nilai B") else println("Nilai A sama dengan nilai B")
    if (a >= b) println("Nilai A kurang dari atau sama dengan Nilai B") else println("Nilai A lebih dari nilai B")
    if (a <= b) println("Nilai A lebih atau sama dari Nilai B") else println("Nilai A kurang dari nilai B")
    if (a == b) println("Nilai A sama dengan Nilai B") else println("Nilai A tidak sama dengan nilai B")
}

fun logicOperators () {
    println("\nLogic Operators\n")

    val a = 10
    val b = 25
    val c = 20

    println("Nilai A: $a")
    println("Nilai B: $b")
    println("Nilai C: $c")

    if (a != b && b < c) {
        println("Nilai A tidak sama dengan nilai B dan Nilai B kurang dari nilai C")
    } else {
        println("Nilai A sama dengan nilai B dan Nilai B lebih atau sama dengan nilai C")
    }

    if (a != b || b < c) {
        println("Nilai A tidak sama dengan nilai B atau Nilai B kurang dari nilai C")
    } else {
        println("Nilai A sama dengan nilai B atau lebih atau sama dengan nilai C")
    }

    if (!(b < c)) {
        println("Nilai A kurang dari nilai B")
    } else {
        println("Nilai A lebih dari nilai B")
    }
}
