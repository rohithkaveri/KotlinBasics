

data class ClothingItem constructor(private val _price:String?, val type:String) {
    //don't really need curly brackets, also can make constructor order matter by
    //adding "constructor" before brackets
    init{
        //do something when initialized


    }

    var price = _price
        get() = field ?: "unknown"

    constructor(_price: String):this(_price, type="unknown") {
        //can do something when initialized, or do get/set methods
        //get() and set() only work with values declared in the class body, like
        //price and type
    }
}