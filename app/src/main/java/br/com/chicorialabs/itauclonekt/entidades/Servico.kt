package br.com.chicorialabs.itauclonekt.entidades

import br.com.chicorialabs.itauclonekt.R

enum class Servico(
    val nome: String,
    val icone: Int
) {
    CARTOES("cartões", R.drawable.ic_baseline_credit_card_24),
    INVESTIMENTOS("investimentos", R.drawable.ic_baseline_attach_money_24),
    POUPANCA("poupança", R.drawable.ic_baseline_savings_24),
    CREDITO("crédito", R.drawable.ic_baseline_account_balance_24),
    RENEGOCIACAO("renegociação",  R.drawable.ic_outline_back_hand_24),
    PORTABILIDADE("portabilidade de salário", R.drawable.ic_baseline_payments_24),
    PIC("pic", R.drawable.ic_baseline_celebration_24),
    PAGAMENTOS("pagamentos", R.drawable.ic_baseline_monetization_on_24),
    TRANSFERENCIAS("transferências", R.drawable.ic_baseline_moving_24);

    companion object{
        fun getTodos(): List<Servico> =
        listOf(CARTOES, INVESTIMENTOS, POUPANCA, CREDITO, RENEGOCIACAO, PORTABILIDADE, PIC, PAGAMENTOS, TRANSFERENCIAS)
    }

}
