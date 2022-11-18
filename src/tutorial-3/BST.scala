package scala_exercises
package bst

import scala.math.Ordering.Implicits._

case class Bst[T: Ordering](
    value: T,
    lhs: Option[Bst[T]] = None,
    rhs: Option[Bst[T]] = None
):

    def insert(n: T): Bst[T] =
        if n > value then copy(rhs = Some(rhs.fold(Bst(n))(_.insert(n))))
        else copy(lhs = Some(lhs.fold(Bst(n))(_.insert(n))))

    override def toString(): String =
        "(" + lhs.toString() + ", " + value.toString() + ", " + rhs
            .toString() + ")"

object Bst:
    def fromList[T: Ordering](list: List[T]): Bst[T] =
        list.tail.foldLeft(Bst(list.head))((tree, elem) => {
            tree.insert(elem)
        })

    def toList[T: Ordering](bst: Bst[T]): List[T] =
        val lhs = bst.lhs.fold { Nil } { node => toList(node) }
        val rhs = bst.rhs.fold { Nil } { node => toList(node) }
        lhs ++ List(bst.value) ++ rhs

object bstRun extends App:
    val b = Bst.fromList(List(1, 2, 3, 4))
    println(b)
