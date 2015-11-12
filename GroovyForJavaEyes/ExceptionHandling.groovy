def openFile(fileName) {
	new FileInputStream(fileName)
}

try {
	openFile("nonexistentfile")
}
catch (FileNotFoundException ex) {
	println "Oops: "
	ex.printStackTrace()
}

try {
	openFile("nonexistentfile")
}
catch (ex) {
	println "Oops: "
	ex.printStackTrace()
}