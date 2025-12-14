class Contact {

    // Parameterized Constructor
    constructor(...params) {
        this.firstName = params[0];
        this.lastName = params[1];
        this.address = params[2];
        this.city = params[3];
        this.state = params[4];
        this.zip = params[5];
        this.phoneNumber = params[6];
        this.email = params[7];
    }

    // Getters and Setters
    get firstName() {
        return this._firstName;
    }

    set firstName(firstName) { 
        let nameRegex = RegExp('^[A-Z]{1}[a-zA-Z\\s]{2,}$');
        if (nameRegex.test(firstName)) {
            this._firstName = firstName;
        } else {
            throw 'First Name is Incorrect!';
        }
    }

    get lastName() {
        return this._lastName;
    }

    set lastName(lastName) { 
        let nameRegex = RegExp('^[A-Z]{1}[a-zA-Z\\s]{2,}$');
        if (nameRegex.test(lastName)) {
            this._lastName = lastName;
        } else {
            throw 'Last Name is Incorrect!';
        }
    }

    get phoneNumber() {
        return this._phoneNumber;
    }

    set phoneNumber(phoneNumber) {
        let phoneRegex = RegExp('^[0-9]{10}$');
        if (phoneRegex.test(phoneNumber)) {
            this._phoneNumber = phoneNumber;
        } else {
            throw 'Phone Number is Incorrect!';
        }
    }

    get address() {
        return this._address;
    }

    set address(address) {
        let addressRegex = RegExp('^[a-zA-Z0-9\\s,.-]{4,}$');
        if (addressRegex.test(address)) {
            this._address = address;
        } else {
            throw 'Address is Incorrect!';
        }
    }

    get city() {
        return this._city;
    }

    set city(city) {
        let cityRegex = RegExp('^[a-zA-Z\\s]{4,}$');
        if (cityRegex.test(city)) {
            this._city = city;
        } else {
            throw 'City is Incorrect!';
        }
    }

    get state() {
        return this._state;
    }

    set state(state) {
        let stateRegex = RegExp('^[a-zA-Z\\s]{2,}$');
        if (stateRegex.test(state)) {
            this._state = state;
        } else {
            throw 'State is Incorrect!';
        }
    }

    get zip() {
        return this._zip;
    }

    set zip(zip) {
        let zipRegex = RegExp('^[0-9]{5}(?:-[0-9]{4})?$');
        if (zipRegex.test(zip)) {
            this._zip = zip;
        } else {
            throw 'ZIP is Incorrect!';
        }
    }

    get email() {
        return this._email;
    }

    set email(email) {
        let emailRegex = RegExp('^[a-zA-Z0-9]+([._+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$');
        if (emailRegex.test(email)) {
            this._email = email;
        } else {
            throw 'Email is Incorrect!';
        }
    }

    // toString Method
    toString() {
        return "First Name='" + this.firstName + "', Last Name='" + this.lastName + 
        "', Address='" + this.address + "', City='" + this.city + 
        "', State='" + this.state + "', ZIP='" + this.zip + 
        "', Phone Number='" + this.phoneNumber + "', Email='" + this.email + "'";
    }
}

let addressBook = new Array();
addressBook.push(new Contact("John", "Doe", "123 Main St", "Springfield", "IL", "62701", "2175551234", "john@email.com" ));
console.log(addressBook[0].toString());
addressBook[0].firstName = "Jane";
console.log(addressBook[0].toString());

// get contact by first name
const getContactByName = (name) => {
    return addressBook.find(c => c.firstName === name || 
    c.lastName === name);
};

let contact = getContactByName("Jane");

// edit contact by name
if (contact) {
  try {
    contact.firstName = "Janet"; 
    console.log(contact.toString());
  } catch (e) {
    console.log('Update failed:', e);
  }
} else {
  console.log("Contact not found");
}

// delete contact by name
let deleteableContact = getContactByName("Janet");
if (deleteableContact) {
    const index = addressBook.indexOf(deleteableContact);
    if (index > -1) {
        addressBook.splice(index, 1);
        console.log("Contact deleted successfully!");
    }
} else {
    console.log("Contact to delete not found");
}
console.log(addressBook.length);

export default Contact;