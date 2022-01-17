
package eg.fue.cs.messages;

import eg.fue.cs.users.User;


public class PrivateMessage extends Message{
    public PrivateMessage(String subject, String body, User from, User to) {
		super(subject, body, from, to);
	}

	public PrivateMessage() {

	}
}
