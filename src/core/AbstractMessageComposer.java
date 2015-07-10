package core;

public abstract class AbstractMessageComposer implements MessageComposer {

	@Override
	public String composeMessage() {
		return "Eine kleine �nderung der Basis-Nachricht von " + getClass().getSimpleName();
	}

}
