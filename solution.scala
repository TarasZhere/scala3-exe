@main
def main():Unit =
    val weirdSum: (Int, Int) => Int = (x:Int, y:Int) => if x == y then x * 3 else x + y

    val numbers:List[(Int, Int)] = List(
        (4, 5),
        (5, 5),
        (9, 2)
    )
    for number <- numbers do
        println(weirdSum(number(0), number(1)))