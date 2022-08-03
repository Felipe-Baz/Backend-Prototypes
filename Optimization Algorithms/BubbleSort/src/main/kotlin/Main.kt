import java.time.Duration
import java.time.LocalTime
import kotlin.random.Random

fun main(args: Array<String>) {
    val listA = ArrayList<Int>()
    for (i in 0..10) {
        listA.add(
            Random.nextInt(0, 1000)
        )
    }

    val initialTime = LocalTime.now()
    val bubbleSort = bubbleSort(listA)
    val finalTime = LocalTime.now()

    val diff = Duration.between(initialTime, finalTime)
    println("start: $initialTime final: $finalTime diff: ${diff.seconds}.${diff.nano}")
    println(bubbleSort)
}
