package scala_exercises
package collatz
import scala.annotation.tailrec
import scala.collection.*


object CollatzConjecture:
    def steps(n: Int): Option[Int] =
        if (n < 1) return None
        Some(collatz(n, 0)) 
    
    @tailrec
    def collatz(n: Int, step: Int): Int = n match
        case 1 => step
        case x if x % 2 == 0 => collatz(x / 2, step + 1)
        case x => collatz(x * 3 + 1, step + 1)

object MainObject extends App:
    println("Hello World")

