//Java Sample Patterns

import java.util.regex.*;
Pattern pattern  = Pattern.compile("a////b");
println pattern
println pattern.class

// Patterns in Groovy

String slashy = /a\b/
String url= $/http://groovy.com/blog/$

println slashy.class  //java.lang.String

def pattern2 = ~/a\b/  //the ~ replaces the Pattern.compile
println pattern2.class // java.util.regex.Pattern

// Find | Match

def text = "Being a Bears sports fan is no way to go through life" // true
def pattern3 = ~/Bears sports fan/
def finder = text =~ pattern3    //It reads: in that text can we find this pattern : false
def matcher = text ==~ pattern3

println finder// it will returns instance of java.util.regex.Matcher
println finder.size()



def text4 = "Bears sports fan"
def pattern4 = ~/Bears sports fan/
def matcher4 = text4 ==~ pattern4

println matcher4 // true

if (matcher){} // do something


def text5 = "Being a Bears sports fan is no way to go through life"
def pattern5 = ~/Bears/

text5 = text5.replaceFirst(pattern5, "Buffalo")
println text5

//https://www.regular-expressions.info/refquick.html