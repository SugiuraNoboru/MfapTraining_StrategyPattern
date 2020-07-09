interface Strategy {
    fun nextHand(): Hand?
    fun study(win: Boolean)
}