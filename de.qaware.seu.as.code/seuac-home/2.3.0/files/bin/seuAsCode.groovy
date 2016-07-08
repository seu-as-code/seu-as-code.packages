#!/usr/bin/env groovy

def seuAsCode = "SEU as Code (Groovy Script)"
println seuAsCode
println "${new Date()}"

def name = System.console().readLine 'What is your name? '
println "Hello, ${name}!"
