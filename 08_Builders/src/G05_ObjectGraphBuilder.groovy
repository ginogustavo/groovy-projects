import groovy.transform.ToString

//http://docs.groovy-lang.org/2.4.9/html/gapi/groovy/util/ObjectGraphBuilder.html
//Builder for creating Object Graphs

@ToString(includeNames = true)
class Book{
    String title
    String summary
    List<Section> sections = []
}
@ToString(includeNames = true)
class Section{
    String title
    List<Chapter> chapters = []
}
@ToString(includeNames = true)
class Chapter{
    String title
}

//Java style
/*
public Book createBook(){
    Book b = new Book()
    b.setTitle("My Book")
    b.setSummary("My Summary")

    Section s = new Section()
    s.setTitle("Section 1")

    Chapter c1 = new Chapter()
    c1.setTitle("Chapter 1")
    Chapter c2 = new Chapter()
    c2.setTitle("Chapter 2")

    s.addChapter(c1, c2)
    s.getSections().add(s)

    return book

}
 */

ObjectGraphBuilder builder = new ObjectGraphBuilder()
def book = builder.book(
    title: 'Groovy Book',
    summary: "Groovy in Action is a great book"){

    section(title: 'section 1'){
        chapter(title: 'chapter 1')
        chapter(title: 'chapter 2')
        chapter(title: 'chapter 3')
    }
    section(title: 'section 2'){
        chapter(title: 'chapter 2.1')
        chapter(title: 'chapter 2.2')
        chapter(title: 'chapter 2.3')
    }
}

println book
assert book.title == "Groovy Book"
assert book.sections.size() == 2
assert book.sections[0].title == "section 1"
assert book.sections[0].chapters.size() == 3

//https://groovy-lang.org/dsls.html#_builders