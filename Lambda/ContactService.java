package Lambda;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
	public List<Contact> findContactAgedBetween18and25(List<Contact> contacts){
		List<Contact> contactage18to25 = new ArrayList<>();
		for (Contact c:contacts){
			if (18<=c.getAge() && c.getAge()<=25){
				contactage18to25.add(c);
			}
		}
		return contactage18to25;
	}
}
