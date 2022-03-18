package org.diligentsnail.javafxdemos;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PropertiesTest {

	@Test
	void propertyBound() {
		StringProperty a = new SimpleStringProperty();
		StringProperty b = new SimpleStringProperty();
		a.bind(b);

		String value = "abc";
		b.setValue(value);

		assertEquals(value, a.getValue());
	}

	@Test
	void propertyBoundBidirectionally() {
		StringProperty a = new SimpleStringProperty();
		StringProperty b = new SimpleStringProperty();
		a.bindBidirectional(b);

		String value = "abc";
		b.setValue(value);

		assertEquals(value, a.getValue());
		assertEquals(value, b.getValue());
	}
}