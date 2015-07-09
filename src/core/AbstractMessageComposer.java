package core;

public abstract class AbstractMessageComposer implements MessageComposer {

	@Override
	public String composeMessage() {
		return "Kleiner Änderung der Nachricht von " + getClass().getSimpleName();
	}

}
