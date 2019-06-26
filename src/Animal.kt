class Animal {
    interface Dog{
        fun speak(){
            println("WOOF")
        }
        var fur:String

    }
    interface Cat{
        fun speak(){
            println("meow")
        }
        var fur:String
    }

    class Retriever:Dog{
        override fun speak() {
            println("woof")
        }
        override var fur = "golden"
    }
    class Mix:Dog,Cat{
        override fun speak() {
            super<Dog>.speak()
        }

        override var fur: String
            get() = "golden"
            set(value) {fur = value}
    }
}