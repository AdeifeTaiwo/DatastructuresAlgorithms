class HeapSort {
    private var largest: Int = 0
    private var left: Int = 0
    private var right: Int = 0


    private lateinit var array: Array<Int>
    private fun parent(i: Int): Int = i / 2

    private fun left(i: Int): Int = 2 * i

    private fun right(i: Int): Int = 2 * i + 1

    fun maxHeapify(array: Array<Int>, i: Int) {
        left = left(i)
        right = right(i)

        if (left <= array.size && array[left] > array[i]) {
            largest = left
        } else {
            largest = i
        }

        if (right <= array.size && array[right] > array[largest]) {
            largest = right
        }
        if (largest != i) {
            val temp = array[i]
            array[i] = array[largest]
            array[largest] = temp
            maxHeapify(array, largest)

            for (arra in array) {
                print("$arra ")
            }
        }





    }


}