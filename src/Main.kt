//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    myfriends()

    val nums = arrayOf(1,2,3,4,5)
    val data = arrayOf("Kenya" ,5200 , true , 4.5 ,7.2F,32377687487327842 )
    println(data.contentToString())

     //nums = arrayOf(arrayOf(1,2,3,)  )


    var friends = arrayOf("Jane", "Beryl", "Vivian", "Dennis", "Kevin")
        friends=friends.plus("Mercy")
        println(friends.contentToString())
       println(friends.indexOf("Dennis"))


    var statistics = arrayOf(21,14,56,18,9,32,5,5,6,32,67,88,43)
    print(statistics.count())
    println(statistics.average())
    println(statistics.sum())
    println( statistics .sum().toDouble()/statistics .size )


    println(statistics.maxOrNull() )
    val mt = Array(5){0}
    mt[0]= 43
    mt[1]= 5
    mt[2]= 6
    mt[3]= 7
    println(mt.contentToString())


    val number = arrayOf(1,2,3,45,20)
    println(number.indexOf(20))









    var x:Int? = 5
        x = null
    println(x)

}
fun myfriends() {


    val friends = arrayOf("Jane", "Beryl", "Vivian", "Dennis", "Kevin")
    println(friends.contentToString())
    print(friends[2])
    println(friends.get(3))
    friends.set(1,"Chemtai")
    println(friends.contentToString())


}
 fun printcities(cities:Array<String>){
     var newCities = Array(cities.size){""}
     cities.forEachIndexed(idx,city ->)
 }



//sorted array
/*fun friends (){
    var friends = arrayOf("Jane", "Beryl", "Vivian", "Dennis", "Kevin")
     friends.forEachIndexed{idx, f->
   if(idx==1 ||idx==2){
println(f)}
