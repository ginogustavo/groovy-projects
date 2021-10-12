Tweet tweet1 = new Tweet()
tweet1.user = "ginogustavo"
tweet1.text = "This is my first tweet"

Tweet tweet2 = new Tweet(user: "juan", text: "Hello Twitter!!")

Tweet tweet3 = new Tweet(user: "maria" , retweets: 2, likes: 3)

Tweet tweet4 = new Tweet( retweets: 2, likes: 3, user: "claudia" )


println tweet1
println tweet2
println tweet3
println tweet4
