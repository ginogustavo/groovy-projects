import groovy.xml.MarkupBuilder
FileWriter writer = new FileWriter('html/books.xml')
MarkupBuilder builder = new MarkupBuilder(writer)
builder.books{
    book(isbn: '978-1935182443') {
        title('Groovy in Action')
        author('Dierk Koenig')
        price(50.58)
    }
    book(isbn: '978-1935182948') {
        title('Making Java Groovy')
        author('Ken Kosen')
        price(33.96)
    }
    book(isbn: '978-1937785307') {
        title('Dynamic Productivity')
        author('Venkat Shub')
        price(28.92)
    }
}
FileWriter writerHtml = new FileWriter('html/books.html')
MarkupBuilder htmlBuilder = new MarkupBuilder(writerHtml)
List favBooks = [
        [id:1, title:"book1", author:'author1', price:456],
        [id:2, title:"book2", author:'author2', price:123],
        [id:3, title:"book3", author:'author3', price:789],
]
htmlBuilder.html{
    head{title("My Favorite Books")}
    body{
        h1("My Favorite Books")
        table{
            tr{
                th("ISBN")
                th("Title")
                th("Author")
                th("Price")
            }
            favBooks.each{book->
                tr{
                    td(book.id)
                    td(book.title)
                    td(book.author)
                    td(book.price)

                }

            }

        }
    }
}



