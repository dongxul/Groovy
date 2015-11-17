class Calibrator {
	Calibrator(calculationBlock) {
		print "using..."
		calculationBlock()
	}
}

def calibarator1 = new Calibrator({
	println "the calculation provided"
	})

def calculation = { 
	println "another calculation provided"
}
def calibrator2 = new Calibrator(calculation)