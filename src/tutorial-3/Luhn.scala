package scala_exercises
package luhn

object Luhn {
    def valid(input: String): Boolean = 
        if !input.forall(c => c.isDigit || c == ' ') then return false

        val digits = input.filter(c => c.isDigit)
            .map(_.asDigit)
            .reverse
            .zipWithIndex
        
        if digits.length <= 1 then return false

        digits.map { (x, idx) =>
            if (idx % 2 != 0) then
                val y = x * 2
                if y > 9 then y - 9
                else y
            else
                x
        }.sum % 10 == 0
}
