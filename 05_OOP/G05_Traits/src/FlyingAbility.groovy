trait FlyingAbility {

    String fly(){
        "I'm flying"
    }

    //to make sure is implemented
    abstract landing()

    //since private and implementers dont have to implement it
    private String washWings(){
        "washing wings"
    }
}