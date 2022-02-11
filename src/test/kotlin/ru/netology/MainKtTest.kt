package ru.netology



import org.junit.Assert.assertEquals
import org.junit.Test

class MainKtTest {

    @Test
    fun should_actual_commission_visa_075() {
        // arrange
        val inputCard = "visa"
        val inputMoney = 100_000
        val commission = 75000
        val monthlyTransfers = 5000
        val sumTransfer = inputMoney + monthlyTransfers
        // act
        val actualCommission = commission(inputCard, inputMoney, sumTransfer)
        // assert
        assertEquals(commission, actualCommission)
    }
    @Test
    fun should_actual_commission_visa_35() {
        // arrange
        val inputCard = "visa"
        val inputMoney = 1000
        val commission = 500
        val monthlyTransfers = 5_000
        val sumTransfer = inputMoney + monthlyTransfers
        // act
        val actualCommission = commission(inputCard, inputMoney, sumTransfer)
        // assert
        assertEquals(commission, actualCommission)
    }
    @Test
    fun should_actual_commission_maestro_06() {
        // arrange
        val inputCard = "maestro"
        val inputMoney = 100_000
        val commission = 62000
        val monthlyTransfers = 5000
        val sumTransfer = inputMoney + monthlyTransfers
        // act
        val actualCommission = commission(inputCard, inputMoney, sumTransfer)
        // assert
        assertEquals(commission, actualCommission)
    }
    @Test
    fun should_actual_commission_maestro_0() {
        // arrange
        val inputCard = "maestro"
        val inputMoney = 5000
        val commission = 0
        val monthlyTransfers = 5000
        val sumTransfer = inputMoney + monthlyTransfers
        // act
        val actualCommission = commission(inputCard, inputMoney, sumTransfer)
        // assert
        assertEquals(commission, actualCommission)
    }
    @Test
    fun should_actual_commission_vkPay() {
        // arrange
        val inputCard = "vkPay"
        val inputMoney = 100_000
        val commission = 0
        val monthlyTransfers = 5000
        val sumTransfer = inputMoney + monthlyTransfers
        // act
        val actualCommission = commission(inputCard, inputMoney, sumTransfer)
        // assert
        assertEquals(commission, actualCommission)
    }




}


