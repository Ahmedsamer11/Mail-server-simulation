
package eg.fue.cs.messages;

import eg.fue.cs.users.User;


public class PublicMessage extends Message {
    public PublicMessage(String subject, String body, User from, User to) {
		super(subject, body, from, to);
	}

	public PublicMessage() {

	}
}
