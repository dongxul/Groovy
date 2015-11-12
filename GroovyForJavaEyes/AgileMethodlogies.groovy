enum Methodologies {
	Evo(5),
	XP(21),
	Scrum(30);

	final int daysInInteration 

	Methodologies(days) {
		daysInInteration = days
	}

	def interationDetails() {
		println "${this} recommends $daysInInteration days for interation"
	}
}

for (Methodology in Methodologies.values()) {
	Methodology.interationDetails()
}