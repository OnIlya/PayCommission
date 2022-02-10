package ru.netology

fun main() {
    val inputCard = "visa"
    val inputMoney = 1000
    val monthlyTransfers = 5000
    val sumTransfer = inputMoney + monthlyTransfers
    val result = commission(inputCard, inputMoney, sumTransfer)
    println("$result копеек")
}

fun commission(inputCard: String, inputMoney: Int, sumTransfer: Int): Int {

    val commission = when(inputCard) {
        "masterCard", "maestro" -> if (sumTransfer > 75_000) {
            (((inputMoney * 0.6 )/ 100) + 20.00) * 100
        } else {
            0
        }
        "visa", "mir" -> if (((inputMoney * 0.75) / 100) < 35) {
            35 * 100
        } else {
            ((inputMoney * 0.75) / 100) * 100
        }
        else -> 0
    }
    return commission.toInt()
}







