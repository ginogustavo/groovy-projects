
@Singleton
class DBConnection{
    String url
}

DBConnection db = DBConnection.instance
println db
