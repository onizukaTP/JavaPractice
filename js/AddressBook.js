import Contact from './Contact.js';

class AddressBook {
    constructor() {
        this.addressBook = new Array();
    }
    // Add a new contact
    addContact(contact) {
        if (!this.addressBook.some(c => 
            c.firstName === contact.firstName && 
            c.lastName === contact.lastName)) {
            this.addressBook.push(contact);
            console.log("Contact added successfully!");
        } else {
            console.log("Contact already exists!");
        }
    }

    // Search by city or state
    searchByCityOrState(location) {
        return this.addressBook.filter(c =>
            c.city === location || c.state === location
        )
    }

    // View persons by city or state
    viewPersonsByCityOrState(location) {
        return this.addressBook.filter(c =>
            c.city === location || c.state === location
        ).map(c => c.firstName + " " + c.lastName);
    }

    // Get number of contacts by city or state
    getNumberOfContactsByCityOrState(location) {
        return this.addressBook.filter(c =>
            c.city === location || c.state === location)
            .reduce((count) => count + 1, 0);
    }

    // sort by city
    sortByCity() {
        return this.addressBook.sort((a, b) => 
            a.city.localeCompare(b.city)
        );
    }

    // sort by state
    sortByState() {
        return this.addressBook.sort((a, b) => 
            a.state.localeCompare(b.state)
        );
    }

    // sort by zip
    sortByZip() {
        return this.addressBook.sort((a, b) => 
            a.zip - b.zip
        );
    }

    // Get the address book
    getAddressBook() {
        return this.addressBook;
    }
}

const addressBook = new AddressBook();
const contact1 = new Contact(
    "Zohn", "Doe", "123 Main St", "Springfield", 
    "IL", "62701", "2175551234", "john@email.com");
const contact2 = new Contact(
    "Jane", "Smith", "456 Oak Ave", "Chicago", 
    "IL", "60601", "3125551234", "jane@email.com");
addressBook.addContact(contact1);
addressBook.addContact(contact2);
console.log(addressBook.searchByCityOrState("Springfield"));
console.log(addressBook.viewPersonsByCityOrState("IL"));
console.log(addressBook.getNumberOfContactsByCityOrState("IL"));
console.log("Sorted Address Book by First Name:" + addressBook.sortByCity());
console.log("Sorted Address Book by State:" + addressBook.sortByState());
console.log("Sorted Address Book by ZIP:" + addressBook.sortByZip());