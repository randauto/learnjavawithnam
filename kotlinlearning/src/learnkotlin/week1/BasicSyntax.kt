package learnkotlin.week1

/**
 * Created by TuanLQ on 5/22/17.
 */

fun sum(a: Int, b: Int): Int {
    return a + b;
}

fun sum1(a: Int, b: Int) = a + b;

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is : ${a + b}");
}

fun main(args: Array<String>) {
//    print("Sum of 3 and 5 is:");
//    println(sum(3,5));

    println("Sum of 4 and 9 is ${sum1(4, 9)}");

    printSum(34, 55);

    val a: Int = 34;
    val b = 2;
    val c: Int;
    c = 4;
    print(c);

    var x = 5;
    x += 1;

    if (x > 0) {
        print(x);

    } else {
        println("Value x is less than 0.");
    }


    fun max(a: Int, b: Int) = if (a > b) a else b;

    println("Max of 5 and 7 is : ${max(5, 7)}");

    printName("Le Quoc Tuan")

    var text = """ for (i in s ) do something. """

    printName(text)
    showName("Chao cac ban!")

    maxOf1(4, 7)



    printProduct("1", "2")

    var length = getStringLength1("Le Quoc Tuan")
    println("Length is : " + length)

    print1toN()

    println(describe(1))

}

// fun return no meaningful value.

fun showName(name: String): Unit {
    // Unit return type can be omitted.
    println(name)
}

fun printName(name: String) {
    for (s in name) {
        print(s)
    }
}

var a = 1
val s1 = "a is $a"
val s2 = "${s1.replace("is", "was")}, but now is $a"

// using conditional expression.
fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

// using if as an expression.
fun maxOf1(a: Int, b: Int) = if (a > b) a else b

fun parseInt(str: String): Int? {
    return Integer.parseInt(str)
}

fun printProduct(str1: String, str2: String) {
    val x = parseInt(str1)
    val y = parseInt(str2)

    if (x != null && y != null) {
        println(x * y)
    } else {
        println("either '$str1' and '$str2' is not a number")
    }
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }

    return null
}

fun getStringLength1(obj: Any): Int? {
    if (obj !is String) return null

    return obj.length
}

// using for loop.

fun print1toN() {
    var items = listOf("apple", "samsung", "huawei")
/*    for (item in items) {
        println(item.toString())
    }*/

/*    for (index in items.indices) {
        println("Item at $index is ${items[index]}")
    }*/

    // using while loop.
    var index = 0
    while (index < items.size) {
        println("Item at $index is ${items[index]}")
        index++
    }
}

fun describe(obj : Any) : String =
        when(obj) {
            1 -> "One"
            else -> "Unknow"
        }

