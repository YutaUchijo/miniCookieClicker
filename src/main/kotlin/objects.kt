class Game(){
    var cookieNum = 0
    var allCPS = 0
    var baaNum = 0
    var fieldNum = 0
    var baaCPS = 0
    var fieldCPS = 0

    fun printCurr(){
        println("You have ${cookieNum} cookies now.")
        println("baa: ${baaNum}")
        println("field: ${fieldNum}")
        println("Current CPS: ${allCPS}")
    }

    fun buy(tar:String, amo:Int){
        when(tar){
            "baa"   ->{
                baaNum += amo
                println("You purchased ${amo} ${tar}(s).")
                refresh()
            }

            "field" ->{
                fieldNum += amo
                println("You purchased ${amo} ${tar}(s).")
                refresh()
            }

            else    ->{
                println("Something went wrong! Try again!!")
            }
        }
    }

    private fun refresh(){
        baaCPS = baaNum * 1
        fieldCPS = fieldNum * 5
        allCPS = baaCPS + fieldCPS
    }

    fun click(){
        cookieNum++
    }
}