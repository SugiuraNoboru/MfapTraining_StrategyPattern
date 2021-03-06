class Player // 名前と戦略を授けられる
    (private val name: String, private val strategy: Strategy) {
    private var wincount = 0
    private var losecount = 0
    private var gamecount = 0
    fun nextHand(): Hand? {                                // 戦略におうかがいを立てる
        return strategy.nextHand()
    }

    fun win() {                 // 勝った
        strategy.study(true)
        wincount++
        gamecount++
    }

    fun lose() {                // 負けた
        strategy.study(false)
        losecount++
        gamecount++
    }

    fun even() {                // 引き分け
        gamecount++
    }

    override fun toString(): String {
        return "[$name:$gamecount games, $wincount win, $losecount lose]"
    }

}