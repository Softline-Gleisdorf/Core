package core;

public abstract class AbstractMessageComposer implements MessageComposer {

	@Override
	public String composeMessage() {
		return "Eine kleine Änderung der Basis-Nachricht von " + getClass().getSimpleName();
	}

}
