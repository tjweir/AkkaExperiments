package com.meetu.akka

import akka.actor.Actor.actorOf
import akka.actor.Actor

object Application extends App {

  val actor = actorOf(new EchoActor)
  actor.start
  actor ! "Hello Akka Echo Actor"
  actor.stop
}

/**
 * An Actor that echoes everything you send to it
 */
class EchoActor extends Actor {
  def receive = {
    case msg => {
      println(msg)
    }
  }
}