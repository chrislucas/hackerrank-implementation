/**
 * https://www.hackerrank.com/challenges/beautiful-triplets/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 * DONE
 * */


fun beautifulTriplets(d: Int, arr: Array<Int>): Int {
    var acc = 0
/*
    for( i in 0 until arr.size) {
        for ( j in i+1 until arr.size) {
            if (arr[j] - arr[i] > d)
                break
            for ( k in j+1 until  arr.size) {
                if (arr[k] - arr[j] > d)
                    break
                if ((arr[k] - arr[j]) == (arr[j] - arr[i]) && d == (arr[k] - arr[j])) {
                    acc++
                }
            }
        }
    }

*/


    for( i in 0 until arr.size - 2) {
        // existe um elementi em arr tal que seja igual a arr[i] + d
        val p = arr.binarySearch(arr[i]+d, 0)
        val q = arr.binarySearch(arr[i]+d+d, 0)
        if (p > -1 && q > -1)
            acc++
    }

    return acc
}


fun main(args: Array<String>) {
    val enter = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    val arr = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    println(beautifulTriplets(enter[1], arr))
}