fun main(){
    val a = arrayOf("Internshala", "Trainings")
    val b = arrayOf("Android", "App", "Developement")
    print(compareArrayLength(a, b))
    var array=arrayOf(1, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
    for(i in array){
        println(i)
    }
}
fun compareArrayLength(a:Array<String>,b:Array<String>):Boolean{
    return a.size==b.size
}
