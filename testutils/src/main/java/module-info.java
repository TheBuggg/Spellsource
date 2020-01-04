open module spellsource.testutils {
	requires spellsource.game;
	requires com.fasterxml.jackson.core;
	requires spellsource.core;
	requires vertx.core;
	requires org.junit.jupiter.api;
	requires commons.io;
	requires co.paralleluniverse.quasar.core;
	requires org.mockito;
	requires logback.classic;
	requires org.slf4j;
	requires com.google.common;
	requires annotations.java5;
	requires commons.lang3;
	exports com.hiddenswitch.spellsource.cards.test;
	exports com.hiddenswitch.spellsource.testutils;
	exports net.demilich.metastone.tests.util;
}