class Hand private constructor(// ����񂯂�̎�̒l
    private val handvalue: Int
) {

    fun isStrongerThan(h: Hand?): Boolean {     // this��h��苭���Ƃ�true
        return fight(h) == 1
    }

    fun isWeakerThan(h: Hand?): Boolean {       // this��h���ア�Ƃ�true
        return fight(h) == -1
    }

    private fun fight(h: Hand?): Int {                 // ����������0, this�̏����Ȃ�1, h�̏����Ȃ�-1
        return if (this === h) {
            0
        } else if ((handvalue + 1) % 3 == h!!.handvalue) {
            1
        } else {
            -1
        }
    }

    override fun toString(): String {                  // ������\���֕ϊ�
        return name[handvalue]
    }

    companion object {
        const val HANDVALUE_GUU = 0 // �O�[��\���l
        const val HANDVALUE_CHO = 1 // �`���L��\���l
        const val HANDVALUE_PAA = 2 // �p�[��\���l
        val hand = arrayOf( // ����񂯂�̎��\��3�̃C���X�^���X
            Hand(HANDVALUE_GUU),
            Hand(HANDVALUE_CHO),
            Hand(HANDVALUE_PAA)
        )
        private val name = arrayOf( // ����񂯂�̎�̕�����\��
            "�O�[", "�`���L", "�p�["
        )

        fun getHand(handvalue: Int): Hand { // �l����C���X�^���X�𓾂�
            return hand[handvalue]
        }
    }

}