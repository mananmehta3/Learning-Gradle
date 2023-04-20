float a = 10.746F

println a
println a.class

s = 'hello'
println s

name = "Doe"
s = "John ${name}"
println s

s = '''All the power is within you.
You can do anything
and everything!!!!'''

println s

emailPattern = /[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+/
println emailPattern.getClass()
println "test@gmail.com"==~emailPattern