package com.meetu.akka

import org.junit.runner.RunWith
import org.scalatest.FeatureSpec
import org.scalatest.GivenWhenThen
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class SampleSpec extends FeatureSpec with GivenWhenThen {

  type ? = this.type

  feature("Execute tests") {
    info("As a developer")
    info("Tests must be triggered where I execute:")
    info(" $ sbt test")
    scenario("assert true equals true") {

      val booleanValue = true

      given("A booleanValue = true")
      when("asserted with true")
      then("must be pass")

      assert(booleanValue === true)
    }
  }

}