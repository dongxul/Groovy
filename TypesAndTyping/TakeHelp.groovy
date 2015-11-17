def takeHelp(helper) {
	helper.helpMoveThings()
}

class Man {
	void helpMoveThings() {
		println "Man's helping"
	}
}

class Woman {
	void helpMoveThings() {
		println "Woman's helping"
	}
}

class Elephant {
	void helpMoveThings() {
		println "Elephant's helping"
	}
	void eatSugarcane() {
		println "I love sugarcane"
	}
}

takeHelp(new Man())
takeHelp(new Woman())
takeHelp(new Elephant())

def takeHelpAndReward(helper) {
	helper.helpMoveThings()
	if (helper.metaClass.respondsTo(helper, 'eatSugarcane')) {
		helper.eatSugarcane()
	}
}

takeHelpAndReward(new Man())
takeHelpAndReward(new Woman())
takeHelpAndReward(new Elephant())