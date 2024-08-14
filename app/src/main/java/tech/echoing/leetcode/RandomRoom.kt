package tech.echoing.leetcode


//应该是2个2个遍历，然后和后面的做随机swap就够了

fun main(args: Array<String>) {
    val count = 50
    randomRoom(count)
}

fun genList(count: Int): MutableList<Int> {
    var list = mutableListOf<Int>()
    for (a in 1..count) {
        list.add(a)
    }
    return list
}

var roomId = 0
fun randomRoom(count: Int) {
    val people = genList(count)
    val male= mutableListOf<Int>()
    val female = mutableListOf<Int>()

    while (people.isNotEmpty()){
        //从现有列表中随机取一个元素
        val randomIndex = (Math.random()*100).toInt()%people.size
        //取出来的随机元素
        val uid = people[randomIndex]
        if (uid%2==0) {
            checkIn(female, uid)
        }else{
            checkIn(male,uid)
        }
        people.removeAt(randomIndex)
    }
    checkInRest(male)
    checkInRest(female)
}

fun checkInRest(list: MutableList<Int>) {
    //剩余人员单独住一间
    if (list.isNotEmpty()) {
        println("房间${++roomId}:$list")
    }
}

private fun checkIn(list: MutableList<Int>, uid: Int) {
    //两两配对送入洞房
    list.add(uid)
    if (list.size == 2) {
        println("房间${++roomId}:$list")
        list.clear()
    }
}