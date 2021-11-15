import groovy.json.JsonSlurper

def books = '''
    {
    "books": {
        "currentBook": {
            "title": "The 4 hour work week",
            "isbn": "978-0-307-46535-1",
            "author": {
                "first": "Timothy",
                "last": "Ferris",
                "twitter": "@tferris"
            },
            "related": [
                "the 4 hour body",
                "the 4 hour chef"
            ]
        },
        "nextBook": {
            "title": "#AskGaryLee",
            "isbn": "978-0-345-741569-1",
            "author": {
                "first": "Gary",
                "last": "Vay",
                "twitter": "@gary"
            },
            "related": [
                "Jab jab jab Right hook",
                "crush it"
            ]
        }
    }
}
'''

JsonSlurper slurper = new JsonSlurper()
def json = slurper.parseText(books)

println json
println json.getClass().getName()

println json.books.nextBook.title


//Reading the file
JsonSlurper slurper2 = new JsonSlurper()
def json2 = slurper.parse(new File('data/books.json'))

println json2
println json2.books.currentBook
println json2.books.currentBook.title
println json2.books.currentBook.author
println json2.books.currentBook.author.twitter
println json2.books.currentBook.related


