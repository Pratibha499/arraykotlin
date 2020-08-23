fun main(){
    val ar= arrayOf('3','5','7')
    try{
        ar[8]='3'
        println("changed the value ")
    }
    catch (e:ArrayIndexOutOfBoundsException){
        println("caught the exception")
    }
    finally {
        println(ar[2])
    }
}