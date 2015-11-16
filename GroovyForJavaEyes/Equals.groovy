str1 = 'hello'
str2 = str1
str3 = new String('hello')
str4 = 'Hello'

println "str1 == str2: ${str1 == str2}"
println "str1 == str3: ${str1 == str3}"
println "str1 == str4: ${str1 == str4}"
println "str1.is(str2): ${str1.is(str2)}"
println "str1.is(str3): ${str1.is(str3)}"
println "str1.is(str4): ${str1.is(str4)}"

class A {
	boolean equals(other) {
		println "equals called"
		false
	}
}
class B implements Comparable {
	boolean equals(other) {
		println "equals called"
		false
	}
	int compareTo(other) {
		println "compareTo called"
		0
	}
}
new A() == new A()
new B() == new B()