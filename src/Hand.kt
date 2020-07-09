class Hand private constructor(// じゃんけんの手の値
    private val handvalue: Int
) {

    fun isStrongerThan(h: Hand?): Boolean {     // thisがhより強いときtrue
        return fight(h) == 1
    }

    fun isWeakerThan(h: Hand?): Boolean {       // thisがhより弱いときtrue
        return fight(h) == -1
    }

    private fun fight(h: Hand?): Int {                 // 引き分けは0, thisの勝ちなら1, hの勝ちなら-1
        return if (this === h) {
            0
        } else if ((handvalue + 1) % 3 == h!!.handvalue) {
            1
        } else {
            -1
        }
    }

    override fun toString(): String {                  // 文字列表現へ変換
        return name[handvalue]
    }

    companion object {
        const val HANDVALUE_GUU = 0 // グーを表す値
        const val HANDVALUE_CHO = 1 // チョキを表す値
        const val HANDVALUE_PAA = 2 // パーを表す値
        val hand = arrayOf( // じゃんけんの手を表す3つのインスタンス
            Hand(HANDVALUE_GUU),
            Hand(HANDVALUE_CHO),
            Hand(HANDVALUE_PAA)
        )
        private val name = arrayOf( // じゃんけんの手の文字列表現
            "グー", "チョキ", "パー"
        )

        fun getHand(handvalue: Int): Hand { // 値からインスタンスを得る
            return hand[handvalue]
        }
    }

}