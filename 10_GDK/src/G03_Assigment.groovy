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
    INSERT INTO users (id, username, bio) 
    VALUES
    (1, 'gino', 'Programmer, latest trends')
    (2, 'gustavo', 'Programmer, latest trends')
    (3, 'giodano', 'Programmer, latest trends')
    (4, 'anthony', 'Programmer, latest trends')
    (5, 'emmanuel', 'Programmer, latest trends')
    
'''

def file = new File('twitter.csv')
file.write('id, username, name\n')
sql.eachRow('select * from users'){ row->
    file.append("${row.id}, ${row.username}, ${row.name}\n")
}

sql.close()
println "completed"