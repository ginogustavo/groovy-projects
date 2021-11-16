package G04_Templates

import groovy.text.SimpleTemplateEngine
import groovy.text.Template

/**
 * We need 3 components to build a dynamic template.
 *
 * 1. Engine (SingleTemplateEngine)
 * 2. Template (the email)
 * 3. Data Bindings (The data to insert into the dynamic portions of our email)
 */

SimpleTemplateEngine engine = new SimpleTemplateEngine()
Template template = engine.createTemplate( new File("dynamic-email.txt"))

//data bindings

Map bindings = [
        firstName: "Gino",
        lastName: "Ureta",
        commits: 35,
        repositories: [
                [name: "Apache Groovy Course", url:"https..."],
                [name: "Spring Boot Course", url:"https..."],
                [name: "Node JS Course", url:"https..."],
                [name: "Javascript Course", url:"https..."],

        ]
]

println template.make(bindings)