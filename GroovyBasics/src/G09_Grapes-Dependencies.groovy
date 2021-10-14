//Defining dependencies
@Grapes(
        @Grab(group='org.apache.commons', module='commons-lang3', version='3.12.0') // define the dependency
)

import org.apache.commons.lang3.text.WordUtils

String name = "Gino Gustavo Ureta"

WordUtils utils = new WordUtils()
println utils.initials(name)
