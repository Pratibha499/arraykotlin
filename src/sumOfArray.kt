import java.util.*

fun main() {
    // Write your code here
    var Arrayeven=arrayOf(2,4,6,8,10)
    var Arrayodd=arrayOf(1,3,5,7,9)
    Arrayeven[0]+=Arrayodd[0]
    Arrayeven[1]+=Arrayodd[1]
    Arrayeven[2]+=Arrayodd[2]
    Arrayeven[3]+=Arrayodd[3]
    Arrayeven[4]+=Arrayodd[4]
    println(Arrays.toString(Arrayeven))

    val array=arrayOf("pratibha",'4',3,7.5,true)
    print(Arrays.toString(array))

}