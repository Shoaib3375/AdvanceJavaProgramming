package Lambda.optimizeContactService;

import Lambda.Contact;

public interface FilterCriteria {
	boolean match(Contact contact);
}
