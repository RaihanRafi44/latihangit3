import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var num1: Double
    var num2: Double
    var operator: Char

    println("Masukkan angka pertama:")
    num1 = scanner.nextDouble()

    println("Masukkan operator (+, -, *, /):")
    operator = scanner.next()[0]

    println("Masukkan angka kedua:")
    num2 = scanner.nextDouble()

    when (operator) {
        '+' -> println("$num1 + $num2 = ${num1 + num2}")
        '-' -> println("$num1 - $num2 = ${num1 - num2}")
        '*' -> println("$num1 * $num2 = ${num1 * num2}")
        '/' -> {
            if (num2 != 0.0) {
                println("$num1 / $num2 = ${num1 / num2}")
            } else {
                println("Tidak bisa dibagi dengan nol")
            }
        }
        else -> println("Operator tidak valid")
    }
}
