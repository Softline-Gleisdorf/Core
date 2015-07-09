package core;

public abstract class AbstractMessageComposer implements MessageComposer {

	@Override
	public String composeMessage() {
		return "Eine Nachricht von " + getClass().getSimpleName();
	}

}
