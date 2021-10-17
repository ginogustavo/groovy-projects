//Java Sample Patterns

import java.util.regex.*;
Pattern pattern  = Pattern.compile("a////b");
println pattern
println pattern.class

// Patterns in Groovy

String slashy = /a\b/
String url= $/http://groovy.com/blog/$

println slashy.class  //java.lang.String

def pattern = ~/a\b/  //the ~ replaces the Pattern.compile
println pattern.class // java.util.regex.Pattern

// Find | Match

def text = "Being a Bears sports fan is no way to go through life" // true
def pattern = ~/Bears sports fan/
def finder = text =~ pattern    //It reads: in that text can we find this pattern : false
def matcher = text ==~ pattern

println finder// it will returns instance of java.util.regex.Matcher
println finder.size()



def text = "Bears sports fan"
def pattern = ~/Bears sports fan/
def matcher = text ==~ pattern

println matcher // true

if (matcher){} // do something


def text = "Being a Bears sports fan is no way to go through life"
def pattern = ~/Bears/

text = text.replaceFirst(pattern, "Buffalo")
println text

//https://www.regular-expressions.info/refquick.html