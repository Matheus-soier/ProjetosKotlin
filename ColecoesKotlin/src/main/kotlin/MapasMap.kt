const val POINTS_X_PASS: Int = 15
val EZPassAcounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
val EZPassReport: Map<Int, Int> = EZPassAcounts

fun updatePointsCredit(accountId: Int) {
    if (EZPassAcounts.containsKey(accountId)) {
        println("Updating $accountId...")
        EZPassAcounts[accountId] = EZPassAcounts.getValue(accountId) + POINTS_X_PASS
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId)")
    }
}

fun accountReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach {
        k, v -> println("ID $k: credit $v")
    }
}

fun main() {
    accountReport()
    updatePointsCredit(1)
    updatePointsCredit(1)
    updatePointsCredit(5)
    accountReport()
}