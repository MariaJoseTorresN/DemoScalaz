import Example.{HIGH, LOW, Priority, Score, threadShow}
import scalaz.Scalaz.{ToEnumOps, ToEqualOps, ToOrderOps, ToShowOps, booleanInstance, char, intInstance, listEqual, optionEqual, stringInstance}
import scalaz._

//Equals
val num1 = 15
val num2 = "15"
val num3 = 25

//num1==num2
//num1===num2

//num1=/=num3

//Order
3 < 5.6
val score1 = Score(0.9)
val score2 = Score(0.8)

score1 > score2
score1 gt score2
score1 gte score2
score1 < score2
score1 lt score2
score1 lte score2
score1 ?|? score2
score2 ?|? score1
score1 ?|? score1

//Show
num1.shows
num1.shows === num2

//Falta show threads

//Enum
val enum = 'a' |-> 'g'
val enumAsList = enum.toList

val expectedResult = IList('a', 'b', 'c', 'd', 'e', 'f', 'g')
val expectedResultAsList = List('a', 'b', 'c', 'd', 'e', 'f', 'g')

enum === expectedResult
enumAsList === expectedResultAsList

'c' === 'b'.succ
'a' === 'b'.pred

'e' === 'b' -+- 3
'f' === 'b' -+- 4

'b' === 'e' --- 3
'a' === 'c' --- 2

val intMin = Enum[Int].min
val intMax = Enum[Int].max

val expectedMin = Some(-2147483648)
val expectedMax = Some(2147483647)

intMin === expectedMin
intMax === expectedMax

