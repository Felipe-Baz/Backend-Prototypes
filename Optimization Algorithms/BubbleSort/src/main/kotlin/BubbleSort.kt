fun bubbleSort(listA: ArrayList<Int>): ArrayList<Int> {
    var swap = true
    while(swap){
        swap = false
        for(i in 0 until listA.size-1){
            if(listA[i] > listA[i+1]){
                val temp = listA[i]
                listA[i] = listA[i+1]
                listA[i + 1] = temp

                swap = true
            }
        }
    }
    return listA
}