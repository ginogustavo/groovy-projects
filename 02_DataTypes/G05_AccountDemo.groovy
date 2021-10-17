@groovy.transform.ToString
class Account{
    BigDecimal balance = 0.0
    String type

    BigDecimal deposit(BigDecimal amount){
        balance+=amount
    }
    BigDecimal withdraw(BigDecimal amount){
        this.balance-=amount
    }
    BigDecimal plus(Account other){
        this.balance + other.balance
    }
}

Account checking = new Account(type:"Checking")
checking.deposit(100.00)
Account savings = new Account(type:"Balance")
savings.deposit(50.00)

checking
savings

BigDecimal total = checking + savings
println total
