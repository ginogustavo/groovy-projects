import groovy.xml.MarkupBuilder
FileWriter writer = new FileWriter('html/about.html')
MarkupBuilder builder = new MarkupBuilder(writer)

List courses = [
        [id:1, name: 'Apache Groovy'],
        [id:2, name: 'Spring Boot'],
        [id:3, name: 'Python'],

]
builder.html{
    head{
        title 'About Gino'
        description 'This is an about me page'
        keywords 'Gino, Groovy, programming'
    }
    body{
        h1  'About me'
        p "Thi sis a bucn of text about me"
        section{
            h2 "courses"
            table {
                tr{
                    th 'id'
                    th 'name'
                }
//                tr{
//                    td '1'
//                    td 'Groovy'
//                }
//                tr{
//                    td '2'
//                    td 'Java'
//                }
                courses.each { course ->
                    tr{
                        td course.id
                        td course.name
                    }
                }
            }
        }
    }
}
