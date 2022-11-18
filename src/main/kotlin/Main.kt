fun main() {
    solution(
        mutableListOf(
            mutableListOf(36,0,18,9),
            mutableListOf(27,54,9,0),
            mutableListOf(81,63,72,45)
        )
    )
}

fun solution(image: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {
    var outerList = mutableListOf(mutableListOf<Int>())
    for (l in 0 until (image.size + 1) - 3) {
        val innerList = mutableListOf<Int>()
        for (k in 0 until (image[0].size + 1) - 3) {
            var sum = 0


            for (i in 0 until 3) {
                for (j in 0 until 3) {
                    print("${image[i][j]}, ")
                    sum += image[i + l][j + k]
                }
                println()
            }


            println(sum)

            innerList.add(Math.floorDiv(sum, 9))
        }
        outerList.add(innerList)
    }

    outerList = outerList.filter {
        it.isNotEmpty()
    }.toMutableList()

    return outerList
}