package Lambda.optimizeContactService;

import Lambda.Contact;

import java.util.List;

public class ContactApp {
	public static void main(String[] args) {
		List<Contact> contactsList = List.of(new Contact("Shoaib Islam", "shoaib@gmail.com",22,Contact.Gender.MALE),
				new Contact("A.J. Jetty","jetty@gmail.com",23,Contact.Gender.FEMALE),
				new Contact("Tasnuva Nijhum","nijhum@gmail.com", 22, Contact.Gender.FEMALE)
				);
		ContactService contactService = new ContactService();
		List<Contact> contactAged18To25 = contactService.findContacts(contactsList, new FilterCriteria() {
			@Override
			public boolean match(Contact contact) {
				return 18<=contact.getAge()&&contact.getAge()<=25&&contact.getGender()== Contact.Gender.FEMALE;
			}
		});
	}
}
