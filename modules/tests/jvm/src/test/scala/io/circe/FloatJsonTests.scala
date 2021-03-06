package io.circe

import io.circe.tests.CirceSuite

/**
 * Tests that fail because of limitations on Scala.js.
 */
trait FloatJsonTests { this: CirceSuite =>
  "fromFloatOrString" should "return a Json number for valid Floats" in {
    assert(Json.fromFloatOrString(1.1f) === Json.fromJsonNumber(JsonNumber.fromDecimalStringUnsafe("1.1")))
    assert(Json.fromFloatOrString(-1.2f) === Json.fromJsonNumber(JsonNumber.fromDecimalStringUnsafe("-1.2")))
  }
}
