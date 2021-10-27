class Account{
    BigDecimal balance = 0.0

    def deposit(BigDecimal amount){
        if(amount<0){
            throw new Exception("Negative amount")
        }
        balance +=amount
    }

    def deposit(List amounts){
        for(amt in amounts){
            deposit(amt)
        }
    }

}

Account account = new Account()
try{
    account.deposit(100)
//account.deposit(-100)

    account.deposit([50,20,30,40,5])

    account.balance
}catch(Exception e){
    println e.message
}
