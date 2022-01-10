import groovy.sql.GroovyRowResult
import groovy.sql.Sql

String username= 'twitter'
String password = 'password'

def sql = Sql.newInstance("jdbc:mysql://localhost:3306/twitter", username, password, "com.mysql.jdbc.Driver")

//create schema
sql.execute("DROP TABLE IF EXISTS users")
sql.execute '''
    CREATE TABLE users(
        id INT NOT NULL,
        username VARCHAR(45) NOT NULL,
        bio VARCHAR(45) NULL,
        PRIMARY KEY(id)
    );
'''

//create some data
sql.execute '''
    INSERT INTO users (id, username, bio) VALUES(1, 'gino', 'Programmer, latest trends')
'''

def twitterUser = [id:2, usrename:'foo', bio:'fooo']

sql.execute '''
    INSERT INTO users(id,username,bio)
    VALUES
    (${twitterUser.id}, ${twitterUser.username}, ${twiterUser.bio})
'''

List<GroovyRowResult> rows = sql.rows ( "select * from users")
println rows

sql.eachRow('select * from users'){row ->
    println "Tweet: @${row.username}"
}

//callling close manually
sql.close()
println "Completed!"