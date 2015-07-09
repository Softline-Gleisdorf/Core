package core;

public abstract class AbstractMessageComposer implements MessageComposer {

	@Override
	public String composeMessage() {
		return "Nachricht von " + getClass().getSimpleName();
	}

}
