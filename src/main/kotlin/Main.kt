fun main (){
 sentence("Barnie bakes brown bagels and burns")
    operate(arrayOf(20,40,5,35,70))
    read("Madam")
}
//Quiz 1.
fun sentence(words:String){
    var remove=words.split("b")
    println(remove)
}
//Quiz 2.
fun operate(Num:Array<Int>):Int{
   var x=Num.sum()
    return(x)
    var y=Num.count()
    return (y)
    var a=Num.average()

}

//Quiz 4.
fun read(text:String):Boolean{
    var w=text
    var palindrome= w
    if(text==palindrome)
        return(true)
    else{
        return(false)
    }
}







