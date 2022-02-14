package ru.netology

fun main() {
    val inputCard = "vkPay"
    val inputMoney = 100_000_000
    val kopecksInRubles = 100
    val monthlyTransfers = 0
    val sumTransfer = inputMoney + monthlyTransfers
    val result = commission(inputCard, inputMoney, sumTransfer, kopecksInRubles)
    println("Комиссия $result коп")
}

fun commission(inputCard: String, inputMoney: Int, sumTransfer: Int, kopecksInRubles: Int): Int {
    val commissionMaestroMasterCard = inputMoney * 0.006
    val commissionVisaMir = inputMoney * 0.0075

    val commission = when(inputCard) {
        "masterCard", "maestro" -> if (sumTransfer > 75_000 * kopecksInRubles) {
            commissionMaestroMasterCard + (20 * kopecksInRubles)
        } else {
            0
        }
        "visa", "mir" -> if (commissionVisaMir < 35 * kopecksInRubles) {
            35 * kopecksInRubles
        } else {
            commissionVisaMir
        }
        else -> 0
    }
    return commission.toInt()
}







