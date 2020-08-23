import java.util.*

fun main(){
    var Arrayofcharacters=arrayOf('i','n','t','e','r')
    val chararray=arrayOf('1','2','3','6')
    println(Arrayofcharacters.get(4))
    println(chararray.get(3))
    println(Arrayofcharacters[2])
    Arrayofcharacters[3]='f'
    println(Arrayofcharacters[3])                          // printing single element of array at given index
    println(Arrayofcharacters.size)                       // returns the size of the array
    println(Arrays.toString(Arrayofcharacters))          //printing whole array
}

/*fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5)         Create an array of the first five natural numbers and all boolean values
                                            **You need not run this program as we have not performed any operation here.
    val arrBool = arrayOf(true, false)
}*/