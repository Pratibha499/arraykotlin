fun main(){
    var a=arrayOf('p','r','a','t','i','b','h','a')
    for(i in 0..a.size-1){                      //for(i in 0 until a.size)
        print("${a[i]}")
       // print("${a[i]}")
    }
    for(i in 0..10 step 2){                            //"step" is used for incermenting the iterator
        println(i)
    }

    for(i in 10 downTo 1){                             //"downto" is used to decrementing the iterator
        println(i)
    }
}