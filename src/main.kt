import javax.sql.rowset.CachedRowSet

/*Given a list of 10 strings, write a function that returns a list of the strings
at even indices i.e index 2,4,6 etc     (2 points)
2. Given a list of people’s heights in metres. Write a function that returns
the average height and the total height    (2 points)
3. Given a list of Person objects, each with the attributes, name, age,
height and weight. Sort the list in order of descending age   (2 points)
4.  Given a list similar to the one above, write a function in which you will
create 2 more people objects and add them to the list at one go.
(1 points)
5. Write a function that takes in a list of Car objects each with a
registration and mileage attribute and returns the average mileage of
all the vehicles in the list.      (3 points) */
fun main (){
evenstring(listOf("Peace","Unity","Serenity","Compassion","Love","Kindness","Teamwork","Family","Peace","Sanity"))
    height(listOf(3,2,4,1,5))
    var a=Person("Conslate",25,3,60)
    var b=Person("Sheila",22,2,56)
    var c=Person("Joy",26,3,70)
    var d=Person("Maryanne",21,3,65)

    var editedlist= listOf(a,b,c,d)
    var sort= editedlist.sortedByDescending { i ->i.age }
    println(sort)
    var e=Person("Yugi",23,3,54)
    var f=Person("Phel",19,2,44)

    var zote= listOf(e,f)
    var all=(editedlist.plus(zote))
    println(all)

    var g=Car(12000,"KDB 606Y")
    var h=Car(10000,"KCC 675b")
    var l=Car(11000,"KAT 765h")

    var s= listOf(g,h,l)
    println(Cars(s))



}


fun evenstring(values:List<String>):List<String> {
    values.forEachIndexed { index, s ->
        if (index % 2== 0) {
            println(s)
        }
    }
    return values
}
fun height(meters:List<Int>):String{
    val average=meters.average()
    val sum=meters.sum()
    var y="$average,$sum"
    println(y)

return y
}
data class Person(var name:String,var age:Int,var height:Int,var weight:Int)


data class Car(var mileage:Int,var registration:String)
fun Cars(miles:List<Car>):Int{
var loop=0
    miles.forEach { gari ->
        loop+=gari.mileage
    }
    var average=loop/miles.count()
    return average
}