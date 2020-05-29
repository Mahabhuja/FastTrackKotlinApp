import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    val tests = input.nextInt()
    var i = 0
    var n = 0
    var k = 0
    var n1 = 0
    var n2 = 0
    var n3 = 0
    var n4 = 0

    while (i < tests) {
        n = input.nextInt()
        k = input.nextInt()

        n1 = n/(1 + k + k*k + k*k*k)

        n2 = k*n1
        n3 = k*n2
        n4 = k*n3
        println("$n1 $n2 $n3 $n4")

        i++
    }

}