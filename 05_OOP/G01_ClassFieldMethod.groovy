class Person{
    String firstName, lastName
    def dob

    // private | protected | public

    protected String fi, f2, f3
    private Date createdon = new Date()

    static welcomeMsg = 'Hello'
    public final static String WELCOME_MSG = 'HELLO'

    //local Variables
    def foo(){
        String msg = "Hello"
        String firstName = "Gino"  // * no collide with class property because it's locally scoped
        println "$msg , $firstName"
    }

}

println Person.WELCOME_MSG
Person person = new Person()
person.foo()

