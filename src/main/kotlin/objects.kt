class Game(){
    var cookieNum = 0   //現在のクッキー数
    var allCPS = 0      //現在の一秒間に増えるクッキー数
    //var baaNum = 0      //おばあちゃんの人数
    //var fieldNum = 0    //畑の数
    //var baaCPS = 0      //おばあちゃんによって１秒間で増えるクッキー数
    //var fieldCPS = 0    //畑によって１秒間に増えるクッキー数

    //var paris = Pair<automation, Int>(automation(CPS = 1, name = "baa", price = 10), 0)
    val facilities:MutableMap<String, automation> = mutableMapOf("baa" to automation(2, "baa", 20), "field" to automation(5, "field", 100))

    fun printCurr(){    //現在の状態を表示する関数
        println("You have ${cookieNum} cookies now.")
        println("baa: ${facilities["baa"]?.amountOfIt}")
        println("field: ${facilities["field"]?.amountOfIt}")
        println("Current CPS: ${allCPS}")
    }

    fun buy(tar:String, amo:Int){ //おばあちゃんもしくは畑を買収する
        facilities[tar]?.amountOfIt = amo
    }

    private fun refresh(){  //allCPSとかを更新する関数。
        baaCPS = baaNum * 1
        fieldCPS = fieldNum * 10
        allCPS = baaCPS + fieldCPS
    }

    fun click(){    //プレイヤーによるクリックの際の処理
        cookieNum++
    }
}

class automation(CPS:Int, name:String, price:Int){
    var amountOfIt = 0
}