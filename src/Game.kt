fun main() {
    var healthPoints: Int = 100
    val playerName = "Madrigal"
    var isbless: Boolean = true
    when (healthPoints) {
        100 -> println("Madrigal is an excellent condition")
        in 90..99 -> println("Madrigal has few scratches")
        in 75..89 -> println("Madrigal has some minor wounds")
        in 15..74 -> println("Madrigal looks pretty hurt")
        in 0..14 -> println("Madrigal has awful condition")

    }
    fun check(healthPoints: Int): String {
        if (healthPoints >= 75) {
            if (isbless == true)
                return "has some minor but it healing quickly"
            else
                return "has some minor"
        }
        return ""
    }

    println(check(healthPoints))
    println(playerName)
    println(healthPoints)
}