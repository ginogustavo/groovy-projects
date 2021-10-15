//https://groovy-lang.org/operators.html#Operator-Overloading
def a = 1
def b = 2
println a+b
println a.plus(b)

def s1 = "Hello"
def s2 = ", World!"
println s1 + s2
println s1.plus(s2)


//Create our own plus method -> Operator overloading
class Account{
    BigDecimal balance

    Account plus(Account other){
        new Account(balance: this.balance + other.balance)
    }

    String toString(){
        "Account balance: $balance"
    }
}

Account savings = new Account(balance: 100.00)
Account checking = new Account(balance: 500.00)

println savings
println checking
println savings + checking
