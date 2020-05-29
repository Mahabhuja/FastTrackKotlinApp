import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    val tests = input.nextInt()
    var i = 0
    var n = 0
    var k1 = 0
    var k2 = 0
    var days = ""
    var lectures = 0

    while (i < tests) {
        n = input.nextInt()
        k1 = input.nextInt()
        k2 = input.nextInt()

        days = input.next()
        var prevDay = '0'
        lectures = 0

        for (x in days.toCharArray()) {
            if(x == '1') {
                if (prevDay == '1') {
                    if(2*k1 > k2) {
                        lectures -= k1
                        lectures += k2
                    } else {
                        lectures += k1
                    }
                } else {
                    lectures += k1
                }
            }
            if(prevDay == '1')
                prevDay = '0'
            else
                prevDay = x
        }

        println("$lectures")

        i++
    }

}