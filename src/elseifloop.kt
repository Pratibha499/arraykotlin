fun main(){
    var a=34
    var b=53
    var maxvalue:Int
    if(a>b){
        maxvalue=a
    }
    else{
        maxvalue=b
    }
    println(maxvalue)

    //other method of using if else
    val maxvalue1:Int=if(a>b){
        a
    }
    else{
        b
    }
    println(maxvalue)

}