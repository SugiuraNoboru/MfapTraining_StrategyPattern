class Player // –¼‘O‚Æí—ª‚ğö‚¯‚ç‚ê‚é
    (private val name: String, private val strategy: Strategy) {
    private var wincount = 0
    private var losecount = 0
    private var gamecount = 0
    fun nextHand(): Hand? {                                // í—ª‚É‚¨‚¤‚©‚ª‚¢‚ğ—§‚Ä‚é
        return strategy.nextHand()
    }

    fun win() {                 // Ÿ‚Á‚½
        strategy.study(true)
        wincount++
        gamecount++
    }

    fun lose() {                // •‰‚¯‚½
        strategy.study(false)
        losecount++
        gamecount++
    }

    fun even() {                // ˆø‚«•ª‚¯
        gamecount++
    }

    override fun toString(): String {
        return "[$name:$gamecount games, $wincount win, $losecount lose]"
    }

}