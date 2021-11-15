import groovy.json.JsonBuilder

JsonBuilder builder = new JsonBuilder()
builder.books{
    currentBook{
        title 'The 4 hour work week'
        isbn '978-0-307-46535-1'
        author (first:'Timothy', last: 'Ferris',twitter:"@tferris" )
        related 'the 4 hour body', 'the 4 hour chef'
    }
    nextBook{
        title '#AskGaryLee'
        isbn '978-0-345-741569-1'
        author (first:'Gary', last: 'Vay',twitter:"@gary" )
        related 'Jab jab jab Right hook', 'crush it'
    }
}
new File('data/books.json').write(builder.toPrettyString())
