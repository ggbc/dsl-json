package com.dslplatform.json.generated.types.Timestamp;



import com.dslplatform.json.generated.types.StaticJson;
import com.dslplatform.json.generated.ocd.javaasserts.TimestampAsserts;

import java.io.IOException;

public class OneSetOfOneTimestampsDefaultValueTurtle {
	private static StaticJson.JsonSerialization jsonSerialization;

	@org.junit.BeforeClass
	public static void initializeJsonSerialization() throws IOException {
		jsonSerialization = StaticJson.getSerialization();
	}

	@org.junit.Test
	public void testDefaultValueEquality() throws IOException {
		final java.util.Set<org.joda.time.DateTime> defaultValue = new java.util.HashSet<org.joda.time.DateTime>(0);
		final StaticJson.Bytes defaultValueJsonSerialized = jsonSerialization.serialize(defaultValue);
		final java.util.List<org.joda.time.DateTime> deserializedTmpList = jsonSerialization.deserializeList(org.joda.time.DateTime.class, defaultValueJsonSerialized.content, defaultValueJsonSerialized.length);
		final java.util.Set<org.joda.time.DateTime> defaultValueJsonDeserialized = deserializedTmpList == null ? null : new java.util.HashSet<org.joda.time.DateTime>(deserializedTmpList);
		TimestampAsserts.assertOneSetOfOneEquals(defaultValue, defaultValueJsonDeserialized);
	}

	@org.junit.Test
	public void testBorderValue1Equality() throws IOException {
		final java.util.Set<org.joda.time.DateTime> borderValue1 = new java.util.HashSet<org.joda.time.DateTime>(java.util.Arrays.asList(org.joda.time.DateTime.now()));
		final StaticJson.Bytes borderValue1JsonSerialized = jsonSerialization.serialize(borderValue1);
		final java.util.List<org.joda.time.DateTime> deserializedTmpList = jsonSerialization.deserializeList(org.joda.time.DateTime.class, borderValue1JsonSerialized.content, borderValue1JsonSerialized.length);
		final java.util.Set<org.joda.time.DateTime> borderValue1JsonDeserialized = deserializedTmpList == null ? null : new java.util.HashSet<org.joda.time.DateTime>(deserializedTmpList);
		TimestampAsserts.assertOneSetOfOneEquals(borderValue1, borderValue1JsonDeserialized);
	}

	@org.junit.Test
	public void testBorderValue2Equality() throws IOException {
		final java.util.Set<org.joda.time.DateTime> borderValue2 = new java.util.HashSet<org.joda.time.DateTime>(java.util.Arrays.asList(new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)));
		final StaticJson.Bytes borderValue2JsonSerialized = jsonSerialization.serialize(borderValue2);
		final java.util.List<org.joda.time.DateTime> deserializedTmpList = jsonSerialization.deserializeList(org.joda.time.DateTime.class, borderValue2JsonSerialized.content, borderValue2JsonSerialized.length);
		final java.util.Set<org.joda.time.DateTime> borderValue2JsonDeserialized = deserializedTmpList == null ? null : new java.util.HashSet<org.joda.time.DateTime>(deserializedTmpList);
		TimestampAsserts.assertOneSetOfOneEquals(borderValue2, borderValue2JsonDeserialized);
	}

	@org.junit.Test
	public void testBorderValue3Equality() throws IOException {
		final java.util.Set<org.joda.time.DateTime> borderValue3 = new java.util.HashSet<org.joda.time.DateTime>(java.util.Arrays.asList(org.joda.time.DateTime.now(), new org.joda.time.DateTime(0), new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC), new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)));
		final StaticJson.Bytes borderValue3JsonSerialized = jsonSerialization.serialize(borderValue3);
		final java.util.List<org.joda.time.DateTime> deserializedTmpList = jsonSerialization.deserializeList(org.joda.time.DateTime.class, borderValue3JsonSerialized.content, borderValue3JsonSerialized.length);
		final java.util.Set<org.joda.time.DateTime> borderValue3JsonDeserialized = deserializedTmpList == null ? null : new java.util.HashSet<org.joda.time.DateTime>(deserializedTmpList);
		TimestampAsserts.assertOneSetOfOneEquals(borderValue3, borderValue3JsonDeserialized);
	}
}
