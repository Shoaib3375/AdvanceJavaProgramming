package Lambda;

import java.util.ArrayList;
import java.util.List;

public class ContactServiceForMale {
	public List<Contact> findMaleContactAgedBetween18and25(List<Contact> contacts){
		List<Contact> maleAgedBetween18to25 = new ArrayList<>();
		for (Contact c:contacts){
			if (18<= c.getAge()&&c.getAge()<=25&&c.getGender()==Contact.Gender.MALE) {
				maleAgedBetween18to25.add(c);
			}
		}
		return maleAgedBetween18to25;
	}
}
