fun main(){
    var num=5
    var number=0
    when(num){                                   // whwn is used in the place of nested if to make the code easy and short
        1->println("one")
        2->println("two")
        3->println("three")
        4->println("four")
        5->println("five")
        6->println("six")
 else->println("none of the above")
    }
    //method to check number is negative ,positive or zero
    when{
        number > 0->println("positive")
        number < 0-> println("negative")
        else-> println("zero")

    }
    var x=64
    var y=54
    if(x>0||y>0){                                     //logical operator
        println("positive")
    }
    else{
        println("negative")
    }

    var pratibha=8
    when(pratibha){                                             // in is used to check the range of a number
        in 1..10->println("yes pratibha lies between 1-10")
        in 11..43->println("yes pratibha lies between 11-43")
        else->println("none")
    }
}