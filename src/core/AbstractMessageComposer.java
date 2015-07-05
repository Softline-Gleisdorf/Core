package core;

public abstract class AbstractMessageComposer implements MessageComposer {

	@Override
	public String composeMessage() {
		return "Simple message from " + getClass().getSimpleName();
	}

}
