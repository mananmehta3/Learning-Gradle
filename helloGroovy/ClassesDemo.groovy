class Patient {
    def firstName,lastName,age
    static hospitalCode = "12345"

    void setLastName(lastName) {
        if(lastName==null) {
            throw new IllegalArgumentException("Last Name Cannot be null")
        }
        this.lastName = lastName
    }

    static void display() {
        println hospitalCode
    }
}

p = new Patient(firstName:'John',lastName:'Doe',age:20)
p.setLastName("Dopinder")
println p.firstName + " " + p.lastName + " " + p.age
Patient.display()