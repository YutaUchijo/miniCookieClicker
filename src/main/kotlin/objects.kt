class Game(){
    var cookieNum = 0   //現在のクッキー数
    var allCPS = 0      //現在の一秒間に増えるクッキー数
    var baaNum = 0      //おばあちゃんの人数
    var fieldNum = 0    //畑の数
    var baaCPS = 0      //おばあちゃんによって１秒間で増えるクッキー数
    var fieldCPS = 0    //畑によって１秒間に増えるクッキー数

    fun printCurr(){    //現在の状態を表示する関数
        println("You have ${cookieNum} cookies now.")
        println("baa: ${baaNum}")
        println("field: ${fieldNum}")
        println("Current CPS: ${allCPS}")
    }

    fun buy(tar:String, amo:Int){ //おばあちゃんもしくは畑を買収する
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

    private fun refresh(){  //allCPSとかを更新する関数。
        baaCPS = baaNum * 1
        fieldCPS = fieldNum * 5
        allCPS = baaCPS + fieldCPS
    }

    fun click(){    //プレイヤーによるクリックの際の処理
        cookieNum++
    }
}