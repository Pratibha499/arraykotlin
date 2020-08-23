fun main(){
    var list1= listOf<String>("pratibha","sharma")           //Declaration of immutable list
    println(list1)
    for(i in list1){
        println(i)
    }

    var list2= mutableListOf<String>("pratibha","sharma","cse")    //Declaration of Mutable list
    println(list2)
    list2[1]="verma"
    list2.add("branch")
    list2.add(3,"subject")
    list2.removeAt(2)
    val arr= arrayOf("radhika","sharma")               //add array to the list
    list2.addAll(arr)
    println(list2)

    var array2= arrayListOf<String>("pratibha","vaishnavi","ayushi")
    println(array2)


}