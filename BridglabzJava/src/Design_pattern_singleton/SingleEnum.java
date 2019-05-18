package Design_pattern_singleton;

public enum SingleEnum {
	instance;
int value;

public int getValue() {
	return value;
}

public void setValue(int value) {
	this.value = value;
}

}
